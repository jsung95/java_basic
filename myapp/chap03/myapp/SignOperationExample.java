package myapp;

import lombok.extern.log4j.Log4j;


@Log4j
public class SignOperationExample {
	
	public static void main(String[] args) {
		int x = -100;
		int result1 = +x; // 부호연산자 + 적용
		int result2 = -x; // 부호연산자 - 적용
		log.info("result1 = " + result1);
		log.info("result2 = " + result2);
		
		
		short s = 100;
		//short result3 = -s; 	// 컴파일 에러  - JAVA에서 정수타입의 연산은 무조건 int 형으로 반환하기 때문 
								// 따라서, short result3 = (short)-s; 로 명시적 형변환을 해주어야함
								// long 형은 int보다 큰 타입이기 때문에 해당안됨
		int result3 = -s;
		log.info("result3 = " + result3);
		
		
		
		int op1 = 1;
		int op2 = 3;
		log.info("op1 / op2 = " + (op1 / op2)); // 정수타입의 연산이므로 소수점을 발생하지 않는다.
												// 소수점을 출력하려면 변수 중 하나가 double 형으로 캐스팅
		
		
		
	} // main
	
	
} // end class
