package myapp;

import lombok.extern.log4j.Log4j;


@Log4j
public class C02_Assert {
	public static void main(String[] args) {
		String name = "Yoseph";
		String address = null;
		
		log.info(address == null);
		
		// assert 조건식
		// assert 키워드는 조건식이 참이면 --> 무사통과
		//					   거직이면 --> AssertionError 발생
		
//		int age = 23;
//		
//		assert age == 23;
//		log.info("무사통과1");
//		
//		assert age == 66;
//		log.info("무사통과2");
		
		String strVar1 = "신민철";
		String strVar2 = "신민철";
		
		assert (strVar1 == strVar2);
		log.info("strVar1 은 strVar2 와 같은 객체 입니다.");
		
		
		
		
	}
	
}
