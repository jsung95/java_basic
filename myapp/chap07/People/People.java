package People;

import lombok.extern.log4j.Log4j;


@Log4j
public class People {
	public String name;
	public String ssn;
	
	
//	public People() {
//		log.debug("People() default constructor invoked.");
//
//	}//default constructor
	
	public People(String name, String ssn) {
		log.debug("People(name, ssn) constructor invoked.");
		
		this.name = name;
		this.ssn = ssn;
	}//constructor
	
}//end class
