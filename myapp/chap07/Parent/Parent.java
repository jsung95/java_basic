package Parent;

import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j;


@Log4j
@NoArgsConstructor
public class Parent {	//부모타입 
	
	public void method1() {
		log.debug("method1() invoked.");
	}//method1
	
	public void method2() {
		log.debug("method2() invoked.");
	}//method2
	
}//end class
