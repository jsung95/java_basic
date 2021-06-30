package abstract_Ex;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;


@Log4j
@AllArgsConstructor
public abstract class Phone {	//추상클래스 : new 연산자로 객체를 생성할 수 없다. 
	//필드
	public String owner;
	
	//생성자
//	public Phone(String owner) {
//		this.owner = owner;
//	}
	
	//메소드 
	public abstract void turnOn();	//전원을 켜고 
	public abstract void turnOff(); //전원을 끄고 
	
	
	public void phoneMethod() {
		log.debug("phoneMethod() invoked.");
	}//phoneMethod
	
}//end class 
