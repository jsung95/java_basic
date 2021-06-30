package Student;

import lombok.extern.log4j.Log4j;


@Log4j
public class C02_StudentTest {
	public static void main(String[] args) {
		// Lvalue(클래스 타입의 참조변수 준비) = Rvalue(new 연산자와 생성자로 객체 생성)
		
		//객체 생성방법 : new 연산자를 사용(-> 객체 생성 연산자)
		C01_Student s1 = new C01_Student();
		log.info("s1 변수가 Student 객체를 참조합니다");
		log.info(s1);
		
		
		C01_Student s2 = new C01_Student();
		log.info("s2 변수가 Student 객체를 참조합니다");
		log.info(s2);
	}//main
	
}//end class
