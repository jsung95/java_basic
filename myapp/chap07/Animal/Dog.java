package Animal;

import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j;


@Log4j
@NoArgsConstructor
public class Dog extends Animal{@Override
	public void sound() {
		log.debug("sound() invoked.");
		
		log.info("\t+ 멍멍!!");
	}//sound
	
}//end class
