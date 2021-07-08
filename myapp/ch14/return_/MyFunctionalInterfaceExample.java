package return_;

import lombok.extern.log4j.Log4j2;


@Log4j2

//매개변수도 있고, 리턴타입도 있는 타겟 타입의 추상메소드를 람다식으로 구현 
public class MyFunctionalInterfaceExample {
	
	public static void main(String[] args) {
		MyFunctionalInterface fi;
		
		
		// int method(int x, int y);
		
		fi = (x, y) -> {		//매개변수타입 --> 생략가능 !
			int result = x + y;
			return result;
		}; //람다식 -> 익명구현객체의 생성 
		
		log.info(fi.method(2, 5));
	
		
		//------------------------------//
		
		fi = (x, y) -> { return x + y; };
		log.info(fi.method(2, 5));
		

		//------------------------------//
		
		//생략조건 4.
		// 구현할 추상메소드가 리턴타입이 있고, 람다식의 실행문장이 오직 1개이고,
		// 그 실행문장이 값을 반환하는 return 문장이라면 
		//   	--> return 키워드 조차 생략 !! 
		fi = (x, y) -> x + y;
		log.info(fi.method(2, 5));
		
		//------------------------------//
		
		//람다식을 보고, 이해하기 위해서는, 이 람다식의 타겟타입의 추상메소드의 시그니처를 반드시 확인하라!
		// int method(int x, int y);
		
		//얼마든지, 람다식의 실행블록에서, 라이브러리를 사용가능!
		fi = (x, y) -> sum(x, y);
		
		
	}// main
	
	
	
	public static int sum(int x, int y) {
		return (x + y);
	}//sum
	
	
}//end class
