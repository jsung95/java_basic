package bounded_type;

import lombok.extern.log4j.Log4j2;


@Log4j2
public class Test {

	public static void main(String[] args) {
		
		int result0 = Util.<Number>compare(10, 20);	
		int result00 = Util.<Integer>compare(10, 20);
//		int result000 = Util.<Short>compare(10, 20);
//		int result0000 = Util.<Byte>compare(10, 20);
		
		
		int result1 = Util.compare(10, 20);	//타입추론(구체타입지정 생략)
		log.info(result1);
		
		
		int result2 = Util.compare(4.5, 3); //타입추론(구체타입지정 생략)
		log.info(result2);
		
		
	}//main

}//end class
