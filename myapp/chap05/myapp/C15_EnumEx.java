package myapp;

import lombok.extern.log4j.Log4j;

/*
 성별을 저장할 수 있는 열거타입을 선언
 성별을 저장하는 변수를 생성하고 출력
 단, 현재의 자바소스 파일 안에서 열거타입을 만드시오
 */

@Log4j
public class C15_EnumEx {
	
	public enum Gender{
		MALE,
		FEMALE
	} //end enum
	
	public static void main(String[] args) {
		Gender gender = null;
		
		gender = Gender.FEMALE;
		
		log.info(gender);
		
		
		
		Grade grade = Grade.가;
		
		
		
		
	}//main
	
	
} //end class


enum Grade{
	수,
	우,
	미,
	양,
	가
}
