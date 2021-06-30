package Airplane;

import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j;


@NoArgsConstructor
@Log4j
public class SupersonicAirplane extends Airplane {
	// static final 상수 선언 
	public static final int NORMAL = 1;			//정상 비행 
	public static final int SUPERSONIC = 2;		//초음속 비행
	
	
	//비행모드 (정상비행 / 초음속비행) 
	public int flyMode = NORMAL;


	@Override
	public void fly() {	//상속받은 메소드 재정의 (다형성 -2)
		log.debug("fly() invoked.");
		
		if(flyMode == SUPERSONIC) {
			log.info("초음속비행합니다. ");
		}
		else {
			super.fly();	//부모객체의 메소드 호출(다형성-2를 우회해서...)
		}//if-esle
		
	}//fly
	
}//end class
