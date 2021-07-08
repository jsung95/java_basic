package Function;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.ToIntFunction;

import lombok.extern.log4j.Log4j2;


@Log4j2
public class FunctionExample {

	//List<T> 타입의 리스트 객체를 생성
	private static List<Student> list 
			= Arrays.asList(
					new Student("홍길동", 90, 96),
					new Student("신용권", 95, 93) 
			); //Arrays helpler class 의 asList(가변인자)메소드를 이용해서, List객체를 생성 
			
	//Student => String으로 매핑하여 반환 
	public static void printString(Function<Student, String> function) {
		for(Student student : list) {
			log.info(function.apply(student) + " ");	//매핑 메소드 호출 
		}
		log.info("");
	}
	
	//Student => int 으로 매핑하여 반환 
	public static void printInt(ToIntFunction<Student> function) {
		for(Student student : list) {
			log.info(function.applyAsInt(student) + " ");	//매핑 메소드 호출 
		}
		log.info("");
	}
	
	
	public static void main(String[] args) {
		
		
		
		
		
		log.info("[학생 이름]");
		
		//람다식을 호출메소드의 전달인자로 던짐!! (던진다! 라고 표현)
		// R apply(T t);
		FunctionExample.printString(t -> t.getName());
		
		
		//--------------------------------------------//
		
		
		log.info("[영어 점수]");
		FunctionExample.printInt(t -> t.getEnglishScore());
		
		log.info("[수학 점수]");
		FunctionExample.printInt(t -> t.getMathScore());
		
		//--------------------------------------------//
		
		
		
		
		
		
		//지역변수로 Function<T, R> 타입의 변수를 선언하였습니다.
		Function<Student, String> func;
		
		//위 지역변수에 람다식으로 익명구현객체를 만들어 초기화 .
		
		//추상메소드의 시그니처
			// R apply(T t); ====> String apply(Student studnet)
		func = (Student student) -> {
			return student.getName();
		};
		
		//위의 람다식 생략조건 적용 하면 
		func = student -> student.getName();
		
		//변수명 또한 더 간략하세 적용하면 
		func = s -> s.getName();
		
		
		String name = func.apply(new Student("Yoseph", 82, 76));
		log.info("- name : " + name);
		
	}//main

}//end class
