package myapp;

import lombok.extern.log4j.Log4j;


@Log4j
public class InfinityAndNaNCheckExample {
	
	// Nan (Not a Number) : 숫자로 표현할 수 없는 값을 의미
	// Infinity : 무한대를 의미
	public static void main(String[] args) {
//		int x = 5;
//		double y = 0.0;
//		
//		double z = x / y;
//		
//		log.info("z = " + z);
//		
//		log.info(Double.isInfinite(z));
//		log.info(Double.isNaN(z));
//		
//		
//		
//		
//		// 복잡한 표현식의 결과일 수록, 반드시 check 메소드로 확인하고 사용
//		
//		//잘못된 코드
//		log.info(z + 2);
//		
//		//알맞은 코드
//		if(Double.isFinite(z) || Double.isNaN(z)) {
//			log.info("값 산출 불가");
//		}
//		else {
//			log.info(z + 2);
//		} // if - else
//		
//		
		
		
		int x = 5;
		int y = 0;
		
		
		// 정확힣 정수 0으로 나누는 연산은 허용불가 -> 예외발생
		// 실수 0.0으로 나누는 연산은 허용, 부작용(무한대) 발생
		try {
			int z = x / y;
			log.info("z : " + z);
		} catch(ArithmeticException e) {
			log.info("0으로 나누면 안됨");
		} // try - catch
		
		
		
		
		
		
	} // main
	
	
} // end class
