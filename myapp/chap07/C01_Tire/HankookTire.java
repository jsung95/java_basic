package C01_Tire;

import lombok.extern.log4j.Log4j;


@Log4j
public class HankookTire extends Tire{
	//필드 
	
	//생성자 
	public HankookTire(String location, int maxRotation) {
		super(location, maxRotation);			//부모객체(즉, Tire객체)의 생성자 호출
		
		log.debug("HankookTire(location, maxRatation)");
	}//constructor

	@Override
	public boolean roll() {
		log.debug("roll() invoked.");
		
		++accumulatedRatation;	//이 메소드가 호출될 때마다, 타이어의 회전수를 누적시킴 
		
		// 만일, 누적회전수가 타이어의 최대가능회전수(즉, 수명)에 못미치면(아직 유효하면 ..)
		if(accumulatedRatation < maxRotation) {
			log.info(location + " HankookTire 수명 : " + (maxRotation - accumulatedRatation) + "회");
			
			return true;
		}
		else {	//타이어의 수명이 다 되어서, 펑크 발생 
			log.info("***" + location + " HankookTire 펑크 ***");
			
			return false;
		}//if-else
	}//roll
}
