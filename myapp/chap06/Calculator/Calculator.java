package Calculator;

import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j;


@Log4j
@NoArgsConstructor(access=lombok.AccessLevel.PUBLIC) //디폴트 생성자 (접근제어자를 자동 생성해주거나 매개변수값 처럼 직접 지정 가능) 
public class Calculator {
	//인스턴스 필드는 객체(인스턴스)가 생성되어야만 짠! 하고 나타나는데 
	static double pi; //pi 변수가 static인 이유 : 정적필드인 파이는 객체가 생성될때 나타날 것이 아니라 
						// 원래 파이의 고유의 3.14라는 값이 있기 때문에 정적 필드로 생성한 것 
	
	
	static {
		Calculator.pi = 3.14;
	}
	
	
	//method
	void powerOn() {
		log.info("Power On");
	} //powerOn
	
	int plus(int x, int y) {
		int result = x + y;
		return result;
	}//plus
	
	double divide(int x, int y) {
		double result = (double)x / (double)y;
		return result;
	}//divide
	
	void powerOff() {
		log.info("power Off");
	}//powerOff
	
	
	
} //end class
