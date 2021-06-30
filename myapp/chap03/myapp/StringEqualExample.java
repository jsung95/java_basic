package myapp;

import lombok.extern.log4j.Log4j;


@Log4j
public class StringEqualExample {
	public static void main(String[] args) {
		String strVar1 = "신민철"; // 문자열 리터럴 저장
		String strVar2 = "신민철"; // 문자열 리터럴 저장
		
		//새로운 문자열 객체 생성
		String strVar3 = new String("신민철");
		
		// [ new 연산자 ]
		//지정된 타입의 클래스로부터 객체를 힙메모리 영역에 생성
		//new 뒤에 나오는 String() 생성자이다. 즉 생성자를 호출
		//초기화까지 끝낸 객체의 주소를 반환한다.
		
		
		log.info(strVar1 == strVar2);
		log.info(strVar1 == strVar3);
		
		log.info("");
		
		log.info(strVar1.equals(strVar2));
		log.info(strVar1.equals(strVar3));
		
		
	} //main
} //end class
