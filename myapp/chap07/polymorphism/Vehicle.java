package polymorphism;

import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j;


@NoArgsConstructor
@Log4j
public class Vehicle {
	
	public void run() {
		log.debug("run() invoked.");
		log.info("차량이 달립니다 ");
	}//run
	
}//end class 
