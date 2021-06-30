package Korean;

import lombok.extern.log4j.Log4j;


@Log4j
public class C10_KoreanTest {
	public static void main(String[] args) {
		C09_Korean k1 = new C09_Korean("박자바", "011225-1234567");
		log.info("k1.name : " + k1.name);
		log.info("k1.ssn : " + k1.ssn);
		
		
		
		C09_Korean k2 = new C09_Korean("김자바", "930525-0023567");
		log.info("k2.name : " + k2.name);
		log.info("k2.ssn : " + k2.ssn);
		
		
	}
	
	
}
