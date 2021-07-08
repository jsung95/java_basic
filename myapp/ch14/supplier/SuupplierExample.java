package supplier;

import java.util.function.IntSupplier;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class SuupplierExample {

	public static void main(String[] args) {
		IntSupplier intSupplier = () -> {		// 다형성-1 : 함수적인터페이스 타입의 참조변수에 익명객체 대입 
			int num = (int) (Math.random() * 6) + 1;
			
			return num;
		}; // 람다식을 이용하여 익명함수(=익명구현객체) 생성
		
		
		//생략조건 적용 
		IntSupplier intSupplier2 = () -> (int) (Math.random() * 6) + 1;
		
		
		
		int num = intSupplier2.getAsInt(); 		// 다형성-2: 오버라이딩된 메소드 호출 
		
		log.info("눈의 수 : " + num);

	}//main

}//end class
