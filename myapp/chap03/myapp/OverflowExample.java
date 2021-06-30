package myapp;

import lombok.extern.log4j.Log4j;


@Log4j
public class OverflowExample {

	public static void main(String[] args) {
		
		int x = 1000000;
		int y = 1000000;
		int z = x * y;
		log.info(z);
		
		
		
//		long x = 1000000;
//		long y = 1000000;
//		
//		// long 타입은 8바이트로, 저장가능한 숫자의 범위에 한게가 있음
//		// 그럼 과연 이 두 큰 숫자의 곱셈결과를 저장할 수 있을까?
//		long z = x * y;
//		
//		log.info(z);
		
		
	} // main
	
} // end class
