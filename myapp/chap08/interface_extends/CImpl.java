package interface_extends;

import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j;


@Log4j
@NoArgsConstructor
public class CImpl 
	extends Parent			//클래스를 상속도 받
	implements IC {			//인터페이스를 다중상속도 받는 것은 당연히 가능하고,
							//또 이렇게 클래스를 선언하는 경우가 다수임!
	
	@Override
	public void methodA() {
		log.debug("methodA() invoked.");
	}// methodA

	@Override
	public void methodB() {
		log.debug("methodB() invoked.");
	}// methodB

	@Override
	public void methodC() {
		log.debug("methodC() invoked.");
	}// methodC
	

}//end class
