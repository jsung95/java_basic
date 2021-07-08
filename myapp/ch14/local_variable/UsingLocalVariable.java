package local_variable;

import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;


@Log4j2
@NoArgsConstructor
public class UsingLocalVariable {

	void method2(int arg) {	//arg는 final 특성을 가짐
	
		log.debug("method2(arg) invoked.");
		
		int localVar = 40;	//localVar는 final 특성을 가짐 
		
//		arg = 31;			//final 특성 때문에 한번 초기화된 지역변수는 변경 불 
//		localVar = 41;		//final 특성 때문에 한번 초기화된 지역변수는 변경 불
		
		//-- 람다식 블록에서, 블록 바깥의 지역변수를 사용하게 되면
		//	 "Closure" 문제가 발생 ----> final 상수화 하여 해결 
		MyFunctionalInterface fi = () -> {
			log.info("arg : " + arg);					//지역변수 사용 
			log.info("localVar : " + localVar + "\n");  //지역변수 사용 
		};//람다식을 통한 익명구현객체 생성 
	
		fi.method();		//람다식으로 오버라이딩된 메소드 호출 
		
	}//method2
	
}//end class


class Calculator {
	
						//매개변수 전달을 받게되면 한번 받은 매개변수의 값을 변경하지 않겠다는 의미의 final
	public static int add(final int num1, final int num2) {
		return num1 + num2;
	}//add
	
}//end class