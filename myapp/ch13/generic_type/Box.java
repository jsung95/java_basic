package generic_type;

import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;


@Log4j2
@NoArgsConstructor(access = lombok.AccessLevel.PUBLIC)
public class Box<T> {
	//필드 선언
	private T t;
	
	
	//메소드 선언
	public T get() {
		log.debug("set(object) invoked.");
		
		return t; 
	}//get
	
	
	public void set(T t) {
		log.debug("set(t) invoked.");
		
		this.t = t; 
	}//set
	
}//end class
