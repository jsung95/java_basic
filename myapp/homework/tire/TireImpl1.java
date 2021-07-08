package tire;

import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j;


@NoArgsConstructor
@Log4j
public class TireImpl1 
	implements ITire {
	int tireLife = ITire.MIN_INCH_TIRE_LIFE;

	@Override
	public int roll() {	
		
		while(this.tireLife > 0) {	
			
			if(this.tireLife > 0) {
				log.info(ITire.MIN_INCH + "인치 타이어로 자전거가 굴러갑니다.");
				tireLife--;
				log.info("현재 남은 " + ITire.MIN_INCH + "인치 타이어의 수명은 " + this.tireLife + " 입니다. ");	
			
			}
			else {
				log.info("타이어의 현재 수명이 " + this.tireLife + " 입니다.");
				log.info("타이어 교체 필요!!");
				
				break;
			}//else if
			
			
			
		}//while
		return 99999;
	}

	@Override
	public void pin() {
		// TODO Auto-generated method stub
		
	}


//	public void pin() {
//		this.tireLife = 0;
//		log.info("*** 압정 밟음! ***");
//		log.info("타이어의 현재 수명이 " + this.tireLife + " 입니다.");
//		log.info("타이어 교체 필요!!");
//	}//pin
	
	
}//end class
