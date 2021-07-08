package generic_method2;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class Test {

	public static void main(String[] args) {
		//Generic Type Pair 객체를 2개 생성 ==> 이때, 구체타입을 지정 (K, V)
		//Pair<K, V> : K --> key 필드의 타입, V --> value 필드의 타입
		
		//그런데 이미 우리가 배웠다 싶히, 구체타입을 지정할 때, Lvalue와 Rvalue
		//양쪽에 두번 지정할 필요는 없다 --> Rvalue의 구체 타입은 생략한다 !
//		Pair<Integer, String> p1 = new Pair<Integer, String>(1, "사과");
//		Pair<Integer, String> p2 = new Pair<Integer, String>(1, "사과");

		Pair<Integer, String> p1 = new Pair<>(1, "사과");
		Pair<Integer, String> p2 = new Pair<>(1, "사과");
		
		//제네릭 메소드를호출 
		boolean result1 = Util.<Integer, String>compare(p1, p2);
		
		if(result1) {
			log.info("논리적으로 동등한 객체입니다.");
		} else {
			log.info("논리적으로 다른 객체입니다.");
		}//if-else
	
		
		Pair<Integer, String> p3 = new Pair<Integer, String>(1, "사과");
		Pair<Integer, String> p4 = new Pair<Integer, String>(1, "사과");
		
		boolean result2 = Util./* <Integer, String> */compare(p3, p4); //타입 추
		
		if(result2) {
			log.info("논리적으로 동등한 객체입니다.");
		} else {
			log.info("논리적으로 다른 객체입니다.");
		}//if-else
		
		
	}

}
