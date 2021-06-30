package Television;

import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.extern.log4j.Log4j;


@Log4j
@ToString
@NoArgsConstructor
public class Television {
	static String company = "Samsung";
	static String model = "LCD";
	static String info;
	
	
	// static initializer는 Class loader에 의해서, 
	//이 Television.class 파일을 찾아서 바이트코드를 읽어다가, 
	//Class 타입의 객체(Clazz 객체)로 만들어 메소드 영역에 집어 넣기전에, 
	//오로지 단 한번 호출되는게, 바로 static initializer 이다. 
	
	//생성자 						   --> 객체 생성시, 인스턴스 필드의 초기화 역할을 수행
	//정적초기자(static initializer)  --> 클래스에 선언된 static field의 초기화 역할 
	static {
		log.info(">>> static initializer invoked.");
		
		company = "Samsung";
		model = "LCD";
		
		info = company + "-" + model;
	} //static initializer
	
}//end class
