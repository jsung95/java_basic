package C01_Tire;

import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j;


@Log4j
@NoArgsConstructor
public class Car {
	//필드 
	Tire frontLeftTire = new Tire("앞왼쪽", 6);		//완성자동차회사의 기본타이어 장착(부품객체의 조립)
	Tire frontRightTire = new Tire("앞오른쪽", 2);
	Tire backLeftTire = new Tire("뒤왼쪽", 3);
	Tire backRightTire = new Tire("뒤오른쪽", 4);
	
	//메소드 
	int run() {
		log.debug("run() invoked.");
		
		log.info("\t+ [자동차가 달립니다.]");
		
		//만일 어느 위치의 타이어가 회전시 펑크가 나면(즉, false를 리턴), 펑크난 타이어의 위치를 1~4 정수값으로 반환
		//자식 타이어 객체로 교체 후에는, 다형성-2가 발생 (즉, 재정의된 roll() 메소드가 수행 )
		if(frontLeftTire.roll() == false) { // 펑크가 났으니, stop하고, 타이어의 위치를 반환 
			stop();
			
			return 1;
		}
		if(frontRightTire.roll() == false) {
			stop();
			
			return 2;
		}
		if(backLeftTire.roll() == false) {
			stop();
			
			return 3;
		}
		if(backRightTire.roll() == false) {
			stop();
			
			return 4;
		}
		
		return 0;		//모든 타이어가 아직 수명이 남아있으면, 0을 리턴 
	}//run
	
	void stop() {	//자동차를 멈추는 기능을 수행하는 메소드 
		log.debug("stop invoked.");
		
		log.info("\t+ [자동차가 멈춥니다.]");
	}//stop
	
}//end class 
