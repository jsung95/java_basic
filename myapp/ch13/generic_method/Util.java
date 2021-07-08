package generic_method;

import generic_type.Box;
import lombok.extern.log4j.Log4j2;


/*
 보통 현실세계의 객체를 모델링해서 만든 클래스가 아니라,
 오로지 특수한 여러 도움이될만한 기능을 제공하는 목적으로 만든 클래스를
 1) Utility class or Helper class 라고 부르며
 2) 구성 메소드는 대부분 정적 메소드로 선언한다
 3) 때문에 거의 필드도없고 따라서 생성자도 선언하지 않는다 .
 */


@Log4j2
public class Util {
	//제네릭 메소드임, 타입파라미터를 T를 가지고 있기 때문에 
	public static <T> Box<T> boxing(T t){
		log.info("boxing(t) invoked.");
		Box<T> box = new Box<T>();
		box.set(t);
		return box;
	}
	
	public <T> void method(T t) {
		;;
	}
}
