package bounded_type;

import lombok.extern.log4j.Log4j2;


@Log4j2
public class Util {

	public void method() {
		Byte t1;
		Short t2;
		Integer t3;
		Long t4;
		
		//자바 언어에서, compare(value1, value2) 메소드는, 
		// 1) 두 값의 대소를비교해서 
		// 2) 비교겨로가를 아래와 같이 반환하도록 이미 정해져 있음:
		//		if value1 > value 라면, +양수를 반환 (통상, +1을 반환)
		//		if value1 == value2 라면, 0을 반환
		//		if value1 < value2 라면, -음수를 반환 (통상, -1을 반환) 
		
		
	}//method
	
	
	
	//타입 파라미터 T에 지정가능한 구체타입의 범위를 제약하겠다 !! --> extends 키워드를 사용!
	// <T extends 부모타입> : 지정 가능한 구체타입은, 부모타입이거나 부모타입을 상속받는 자식타입들만 가능하다 
	//														(이렇게 구체타입 지정을 제약하겠다!)
	public static <T extends Number> int compare(T t1, T t2) {
		double v1 = t1.doubleValue();
		log.info(t1.getClass().getName());
		
		double v2 = t2.doubleValue();
		log.info(t2.getClass().getName());
		
		
		return Double.compare(v1, v2);
	}//compare
	
}//end class
