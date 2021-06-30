package none_generic_type;

import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;


@Log4j2
@NoArgsConstructor
public class Box {
	
	private Object object;
	
	
	public void set(Object object) {
		log.debug("set(object) invoked.");
		
		this.object = object;
	}//set
	
	public Object get() {
		log.debug("set(object) invoked.");
		
		return object;
	}//get
	
}//end class
