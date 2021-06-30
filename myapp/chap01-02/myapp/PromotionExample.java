package myapp;

import lombok.extern.log4j.Log4j;


@Log4j
public class PromotionExample {
	public static void main(String[] args) {
		
		//-자동형변환-
		byte byteValue = 10;		// 1바이트 타입의 변수 정의
		int intValue = byteValue;	// 1바이트 변수를 4바이트 변수에 대입
		log.info(intValue);
		
		char charValue = '가';
		intValue = charValue;
		log.info("가의 유니코드 = " + intValue);
		
		intValue = 500;
		long longValue = intValue;
		log.info(longValue);
		
		intValue = 200;
		double doubleValue = intValue;
		log.info(doubleValue);
		
		
		
	} // main
	
} // end class
