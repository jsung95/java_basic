package polymorphism;

import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j;


@NoArgsConstructor
@Log4j
public class Taxi 
	extends Vehicle{
	
	
	@Override
	public void run() {
		log.debug("run() invoked.");
		
		log.info("택시가 달립니다.");
	}//run

}//end class
