package Airplane;

import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j;


@Log4j
@NoArgsConstructor
public class Airplane {
	public void land() {
		log.info("착륙합니다 ");
	}//land
	
	public void fly() {
		log.info("일반비행합니다 ");
	}//fly
	
	public void takeOff() {
		log.debug("takeOff() invoked");
	}//takeOFf
}//end class
