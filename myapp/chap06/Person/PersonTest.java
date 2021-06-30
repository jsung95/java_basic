package Person;
import java.lang.reflect.*;
import java.util.Arrays;

import lombok.extern.log4j.Log4j;


@Log4j
public class PersonTest {
	public static void main(String[] args) throws ClassNotFoundException {
	// 메소드 영역의 Clazz 객체를 직접 얻어보
		//1st. method
//		Class clazz = Person.class;		
		
		//2nd. method
//		Person person = new Person();
//		Class clazz = person.getClass();
		
		//3rd. method
//		Class clazz = Class.forName("myapp.Person");
//		
//		System.out.println("clazz : " + clazz);
//		System.out.println("type : " + clazz.getName());
//
//		Field[] field = clazz.getDeclaredFields();
//		System.out.println(Arrays.toString(field));
		
		/////////////////////////////////////////////////////
		
//		Person p1 = new Person();
//		Person p2 = new Person();
//		
//		System.out.println(p1.count); // 실행에 문제는 없지만 이클립스가 정적 멤버를 사용하는 방식의 문제를 제
//		System.out.println(Person.count); // 따라서 이와 같이 클래스명으로 정적 멤버에 접근 
		
		
		Person p1 = new Person("Yoseph", 23);
		Person p2 = new Person("Trinity", 24);
		
		
		
		
	} //main
	
} //end class
