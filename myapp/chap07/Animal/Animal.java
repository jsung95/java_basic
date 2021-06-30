package Animal;

import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j;


@Log4j
@NoArgsConstructor
public class Animal {

		
	public void sound() {
		log.debug("sound() invoked.");
		
		log.info("\t+ 소리: 웅웅웅!!~~");
	}//sound
	
}//end class
