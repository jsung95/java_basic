package C01_Tire;

import lombok.extern.log4j.Log4j;


@Log4j
public class Tire {
	//-1.인스턴스 필드 
	public int maxRotation;				//최대회전수(=최대수명)
	public int accumulatedRatation;		//타이어 위치 
	public String location;				//누적회전수(=상태필드)
	
	//-2.생성자 
	public Tire(String location, int maxRatation) {
		log.debug("Tire(location, maxRatation) constructor invoked.");
		
		this.location = location;
		this.maxRotation = maxRatation;
	}//constructor
	
	
	//-3.메소드 
	public boolean roll() {
		log.debug("roll() invoked.");
		
		++accumulatedRatation;	//이 메소드가 호출될 때마다, 타이어의 회전수를 누적시킴 
		
		// 만일, 누적회전수가 타이어의 최대가능회전수(즉, 수명)에 못미치면(아직 유효하면 ..)
		if(accumulatedRatation < maxRotation) {
			log.info(location + " Tire 수명 : " + (maxRotation - accumulatedRatation) + "회");
			
			return true;
		}
		else {	//타이어의 수명이 다 되어서, 펑크 발생 
			log.info("***" + location + " Tire 펑크 ***");
			
			return false;
		}//if-else
	}//roll
	
	
}//end class
