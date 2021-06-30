package Singleton;

import lombok.extern.log4j.Log4j;


@Log4j
public class Singleton {
	// 외부에서 역시 접근 불가능하게 private '접근제한자(access modifier)'로 은닉화(캡슐화)
	// 단 한번 생성될 싱글톤 객체의 주소를 보관할 필드를 선언 ---------------------------(2)
	private static Singleton singleton;
	
	//--------------------------------------//
	//모든 쓰레드, 모든 객체에서 공유할 데이터를 보관할 필드를 선언 
	//--------------------------------------//
	private int[] intArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
	
	
	static { //JVM이 오직 단 한번만 호출되도록 보장하는 블
		log.debug(">>>>>>>>>>> static initializer invoked.");
		singleton = new Singleton();
	}//static initializer
	
	//외부외서 호출불가능하게 private '접근제한자'로 은닉화(캡슐화)
	private Singleton() {	// 외부에서 new연산자로 호출못하도록 private 로 막음 -----(1)
		log.info("default constructor invoked.");
	}//default constructor
	
	
	// 외부에서 언제든 호출가능하도록 하려면, 객체생성없이도 호출할 수 있도록 static 메소드로 선언 
	//싱글톤 객체의 주소를 보관하고 있는 필드의 값을, 언제든 필요로 하는 다른 객체에 줄 수 있도록
	//정적 메소드를 선언 --------------------------------------------------------(3)
	public static Singleton getInstance() {
		log.info("getInstance() invoked.");
		return singleton;
	}//getInstance
	
}//end class
