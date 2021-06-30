package Calculator;

import lombok.extern.log4j.Log4j;

@Log4j
public class CalculatorTest {
	public static void main(String[] args) {
		Calculator myCalc = new Calculator();		//전자계산기 객체 생성 
		
		myCalc.powerOn();							//메소드 호출 
		
		int result1 = myCalc.plus(5, 6);			//메소드 호출 	
		log.info("result1 : " + result1);
		
		byte x = 10;
		byte y = 4;
		
		double result2 = myCalc.divide(x, y);		//메소드 호출 
		log.info("result2 : " + result2);
		
		myCalc.powerOff();							//메소드 호출 
	}//main
}//end class
