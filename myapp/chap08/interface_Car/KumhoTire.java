package interface_Car;

import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j;


@NoArgsConstructor(access = lombok.AccessLevel.PUBLIC)
@Log4j
public class KumhoTire 
	implements Tire {
	
	//Tire 타입에 선언된 "규격(추상메소드)"을 반드시 지켜야 한다!! 
	@Override
	public void roll() {
		log.info("roll() invoked. ");
		
	}//roll
	
}//end class
