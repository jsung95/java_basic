package abstract_Ex;

import lombok.extern.log4j.Log4j;


@Log4j
public class SmartPhone 
	extends Phone {
	
	
	//생성자
	public SmartPhone(String owner) {
		super(owner);
		
		log.debug("SmartPhone(owner) constructor invoked.");
	}//constructor
	
	//메소드 
	public void internetSearch() {
		log.debug("internetSearch() invoked.");
		
		log.info("인터넷 검색을 합니다");
	}//internetSearch

	
	
	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		
	}
	
}//end class 
