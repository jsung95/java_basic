//@C02_PrintAnnotation 	// 패키지의 어노테이션을 붙이는 위치는 이곳이 아님 a.b.c 패키지 참고 
package Annotation;

import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j;


@Log4j
//@NoArgsConstructor(access = lombok.AccessLevel.PUBLIC)

//@C02_PrintAnnotation		// ElementType.TARGET
public class C01_Service {
	
//	@C02_PrintAnnotation 	// ElementType.FIELD
	private int  age;

//	@C02_PrintAnnotation 	// ElementType.FIELD
	private String  name;
	
	
	
//	@C02_PrintAnnotation	// ElementType.CONSTRUCTOR
	public C01_Service() {
		;;
	} //default constructor
	
//	@C02_PrintAnnotation
	public C01_Service(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	
	
	@C02_PrintAnnotation	// ElementType.METHOD
//	public void method1(@C02_PrintAnnotation String name, @C02_PrintAnnotation int age) { // ElementType.PARAMETER
	public void method1(String name, int age) { // ElementType.PARAMETER
		System.out.println("method1() invoked");
	}//method1
	
	@C02_PrintAnnotation("*")		//값을 하나만 전달 --> 기본속성(value)에 값을 전
	public void method2() {
		System.out.println("method2() invoked");
		
		// 매소드 내의 지역변수 선
//		@C02_PrintAnnotation int temp = 100;	//ElementType.LOCAL_VARIABLE
//		@C02_PrintAnnotation String tempName = "Yoseph";	//ElementType.LOCAL_VARIABLE
	}//method2
	
	@C02_PrintAnnotation(value="#", number=20)
	public void method3() {
		System.out.println("method3() invoked");
	}//method3
	
}//end class
