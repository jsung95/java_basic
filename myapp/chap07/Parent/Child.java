package Parent;

import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j;


@Log4j
@NoArgsConstructor
public class Child extends Parent{
	
	@Override
	public void method2() {
		log.info("method2() invoked.");
	}//method2

	public void method3() {
		log.info("method3() invoked.");
	}//method3
	
}//end class
