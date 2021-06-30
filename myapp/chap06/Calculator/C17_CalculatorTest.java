package Calculator;

import lombok.extern.log4j.Log4j;


@Log4j
public class C17_CalculatorTest {
	public static void main(String[] args) {
		
		double result1 = 10 * 10 * C16_Calculator.pi; 		//정적필드의 사용 
		
		int result2 = C16_Calculator.plus(10, 5);			//정적메소드의 호
		int result3 = C16_Calculator.minus(10, 5);			//정적메소드의 호
		
		log.info("result1 : " + result1);
		log.info("result2 : " + result2);
		log.info("result3 : " + result3);
		
		//////////////////////////////////////////
		C16_Calculator calc = new C16_Calculator();
		log.info(calc.pi);
		log.info(calc.plus(1, 2));
	}
}
