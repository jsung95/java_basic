package brake;

import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j;

@Log4j
@NoArgsConstructor
public class Brake {
	
	public void operating(boolean op, int currentSpeed) { //currentSpeed도 동적으로 받는지?? default가 있는지?
		if(op) {	// true면 속도 줄이기
			log.info("부드럽게 속도가 줄었다.");
			currentSpeed /= 2;
			log.info("현재속도 : " + currentSpeed);
		}else {		// false면 멈춤
			log.info("자전거가 멈췄다.");
			currentSpeed = 0;
			log.info("현재속도 : " + currentSpeed);
		}// if-else
	}//operating
	

	public void breakDown() {
		log.info("앗,브레이크가 고장났다!");
		log.info("브레이크 교체 필요!");
	}
	
}// end class
