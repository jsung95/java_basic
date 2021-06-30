package myapp;

import lombok.extern.log4j.Log4j;

// 강제형변환으로 데이터의 손실이 발생할 수도 있지만 무조건 발생하는 것은 아님.
@Log4j
public class CastingExample {
	public static void main(String[] args) {
		int intValue = 44032;
		char charValue = (char)intValue;
		log.info(charValue);
		
		long longValue = 500;
		intValue = (int) longValue;
		log.info(intValue);
		
		
	} // main
	
} // end class
