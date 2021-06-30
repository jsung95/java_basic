package Annotation;

import java.lang.reflect.Method;
import java.util.Arrays;

import lombok.extern.log4j.Log4j;


@Log4j
public class C03_PrintAnnotationTest {
	
	//Service 클래스에 붙인, 어노테이션 정보를 이용해서, 
	//어노테이션이 장착된 메소드에 대해서 특수한 기능을 수행하
	public static void main(String[] args) {
		
		// --1. Service 클래스의 Clazz 캑체를 얻어냄 
		Class<C01_Service> clazz = C01_Service.class;
		
		// --2. Clazz 객체로부터, Service 클래스에 선언된 모든 메소드 정보를 배열로 획득 
		Method[] declaredMethods = clazz.getDeclaredMethods();
		System.out.println(">>>>" + Arrays.toString(declaredMethods));
		
		// --3. Method 객체를 하나씩 처리 
		for(Method method : declaredMethods) {
			// --4. @PrintAnnotation이 적용되었는지 확인
			if(method.isAnnotationPresent(C02_PrintAnnotation.class)) {
				
				// 4-1. PrintAnnotation 객체얻기 
				C02_PrintAnnotation printAnnotation = 
						// Method 타입의 메소드 중에, 어노테이션을 반환하는 메소드가 있음 
						// 즉, Method.getAnnotation(Clazz)
						method.getAnnotation(C02_PrintAnnotation.class);
				
				// 4-2. 메소드 이름 출력
				System.out.println("[" + method.getName() + "]");
				
				// 4-3. 구분선 출력
				// PrintAnnotation 의 속성 중에, number() 속성 값을 이용 
											// -- 메소드가 아니라 어노테이션이기 때문에 ()를 붙임 
				for(int i=0; i<printAnnotation.number(); i++) {
					System.out.print(printAnnotation.value());
				}// for
				
				System.out.println("");
				
				// 4-4. Method 타입의 객체를 가지고, Service 클래스에 선언된 메소드를 실제 호출 
				try {
					//메소드 호출
					method.invoke(new C01_Service());
				}catch (Exception e) {
					;; 
				} //try-catch
				
				System.out.println("");
				
			}// if
			
		}// enhanced for
		
		
	}// main
	
}// end class
