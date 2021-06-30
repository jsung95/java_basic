package Car;

import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.extern.log4j.Log4j;


@ToString
@NoArgsConstructor
@Log4j
public class C13_Car {
	//--1. 필드 
	int gas;
	
	//--2-1. 생성자 				====> 객체 생자(new), 인스넌스 필드의 초기화 
	
	//--2-2. static initializer  ===> 정적필드의 초기화 수행 
	static {
		;;
	}
	
	//--3. 메소드 
	void setGas(int gas) {
		this.gas = gas;
	}//setGas
	
	boolean isLeftGas() {
		if(gas == 0) {
			log.info("No more gas");
			
			return false;
		}//if
		
		log.info("Exist gas");
		
		return true;
	}//isLeftGas
	
	void run() {
		while(true) {
			if(gas > 0) {
				log.info("달립니다 (gas 잔량 : " + gas + ")");
				
				gas -= 1;
			}
			else {
				log.info("멈춥니다 (gas 잔량 : " + gas + ")");
				
				return;
			}//if-else
			
		}//while
		
	}//run
	
}//end class
