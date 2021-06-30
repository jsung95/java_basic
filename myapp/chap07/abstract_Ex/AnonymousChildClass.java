package abstract_Ex;

import lombok.extern.log4j.Log4j;


@Log4j
public class AnonymousChildClass {
	
	public static void main(String[] args) {
		
		//다형성-1: 부모타입에 자식객체를 생성해서 대입 
		Phone phone = new Phone("Yoseph") {
			
			public int age = 23;
			
			//익명 클래스는 자바 컴파일러가 자동으로 만들기 때문에,
			//생성자의 규칙상, 클래스의 이름과 동일하게 선언해야 하나,
			//말 그대로 익명클래스이기 때문에, 자체 생성자를 선언하는 것은 불가능하다 
			
			@Override
			public void turnOn() {
				log.debug("turnOn() invoked.");
				log.info("\t+ owner : " + owner);
			}//turnOn

			@Override
			public void turnOff() {
				log.debug("turnOff() invoked.");
				log.info("\t+ owner : " + owner);
			}//turnOff

			@Override
			public void phoneMethod() {
				log.debug("phoneMethod() invoked.");
				
				anonymousMethod();
			}//phoneMethod
			
			public void anonymousMethod() {
				log.debug("anonymousMethod() invoked.");
				
				log.info("\t+ age : " + age);
			}//anonymousMethod
			
			
		}; //익명자식객체 구현 코딩 기법 
		
		Class clazz = phone.getClass();
		log.info(" - clazz : " + clazz);
		
		
		phone.turnOn();
		phone.turnOn();
		
		phone.phoneMethod();
		
		//익명자식객체 내의 자체적으로 생성한 메소드 및 필드는 외부에서 사용 불가능하다
		
//		phone.anonymousMethod(); //익명자식객체에 선언한 메소드는 지역적으로만 사용되기때문에
								 //익명자식객체 블록 내에서는 사용 가능하지만 그 외에서는 사용 불가능
		
//		phone.age;				 //마찬가지로 익명자식객체 내에 선언한 필드 또한 지역적으로만 사용 가능 
		
	}//main
	
}//end class
