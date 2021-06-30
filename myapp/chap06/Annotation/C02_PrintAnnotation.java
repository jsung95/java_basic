package Annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)


//우리가 선언한 어노테이션을, 클래스의 어느 부분에 붙일 수 있는지를 ElementType으로 지정 
@Target({
	ElementType.METHOD,		 // 우리가 만든 어노테이션은, 메소드에만 붙일 수 있다.
//	ElementType.TYPE,		 // 타입선언부에도 붙일 수 있다.
//	ElementType.FIELD,		 // 필드에도 붙일 수 있다.
//	ElementType.PARAMETER,   // 매개변수 값에도 붙일 수 있다.
//	ElementType.CONSTRUCTOR, // 생성자에도 붙일 수 있다.
//	ElementType.LOCAL_VARIABLE, // 지역변수에도 붙일 수 있다.
//	ElementType.ANNOTATION_TYPE, // 어노테이션 타입에도 붙일 수 있다.
//	ElementType.PACKAGE,		 // 패키지에도 붙일 수 있다.
//	ElementType.TYPE_USE		// 메소드만 제외하고 나머지(위)에 붙이게끔 가능 
})

//@C02_PrintAnnotation	// ElementType.ANNOTATION_TYPE
public @interface C02_PrintAnnotation {
	
	// 어노테이션 속성의 타입으로는 아래만 가능 : 
	//		1) 기본타입(primitive type)
	//		2) String
	//		3) 열거타입(Enumeration type)
	//		4) Class 타입 (Clazz)
	//		5) 위의 1) ~ 4) 까지의 타입으로 구성된 배열(Array)도 가능 
	
	String value() default "-";		// 기본 속성 (value 이름을 가지는 속성, 타입은 무관) 
	int number() default 15;
	
}// end @interface
