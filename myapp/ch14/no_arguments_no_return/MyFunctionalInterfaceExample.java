package no_arguments_no_return;

import lombok.extern.log4j.Log4j2;

@Log4j2

//우리가 선언한 functional interface를 구현하는 람다식을 생성/실행 해보자
public class MyFunctionalInterfaceExample {
	
	public static void main(String[] args) {
		MyFunctionalInterface fi;		//람다식의 타겟타입 지역변수 선언 
		//----------------------------
		// 1. 람다식 구현 및 실행
		//----------------------------
//		fi = () -> {
//			String str = "method call 1";
//			log.info(str);
//		};
		

		
		//----------------------------
		// 2.익명구현객체코딩 기법으로 재구현 
		//----------------------------
		
		// 인터페이스는 new 연산자를 사용할 수 없지만 ..
		// 익명구현객체 코딩 기법으로재구현 해보면 가능
//		fi = new MyFunctionalInterface() {
//			
//			@Override
//			public void method() {
//				String str = "method call 1";
//				log.info(str);
//			}//method
//		};
		
		//----------------------------
		// 3. 구현 클래스에서 구현객체 생성 
		//----------------------------
		fi = new MyFunctionalInterfaceImpl();
		
		log.info(">>>>> fi : " + fi);
		
		fi.method();		// Overriding 한 메소드 호출 (다형성-2)
		
		//---------------------------------------//
		
		// 생략조건 1.
		// 람다식의 중괄호 블록 안에서 수행할 문장이 오직 1개만 있으면, 
		// 					---> {} 기호 생략!!
		fi = () -> log.info("method call 2");// (다형성-1)
		
		fi.method();		// Overriding 한 메소드 호출 (다형성-2)
		
		//---------------------------------------//
		
		
		
		
	}//main
	
}//end interface
