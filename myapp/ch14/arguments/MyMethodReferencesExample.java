package arguments;

import lombok.extern.log4j.Log4j2;

// 람다식의 구현 

@Log4j2
public class MyMethodReferencesExample {

	public static void main(String[] args) {
		MyFunctionalInterface fi;
		
		//----------------------------------------//
		// 생략조건 2.
		// 매개변수 선언부의, 각 매개변수의 타입은, 컴파일러의 타입추론 기능에 의해 생략가능하다!!
		//----------------------------------------//
		fi = (x) -> {
			int result = x * 5;
			log.info(result);
		}; //람다식으로 타겟타입의 추상메소드의 구현 -> 익명구현객체 생성
		
		fi.method(2);

		//----------------------------------------//
		
		//----------------------------------------//
		// 생략조건 3. 
		// 매개변수 선언부의 매개변수가 오직 1개이면 ---> () 기호 생략 가능!!
		//----------------------------------------//
		fi = x -> log.info(x * 5);
		fi.method(200);
		
		
		
		
	}//main

}//end class
