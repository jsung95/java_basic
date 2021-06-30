package Parent;

import lombok.extern.log4j.Log4j;


@Log4j
public class ChildTest {
	public static void main(String[] args) {
		//--1. 자식객체 생성 
		Child child = new Child();
		
		//--2. 다형성-1 : 부모타입변수에 자식객체 대입 (자동 형변환 발생)
		//				이때 한번 부모품에 안기면, 자식객체는 털끝하나 보이지 않음. 
		//				오로지 부모만 보임. 즉, 이 참조변수로 사용가능한 멤버는, 부모타입의 멤버만 사용가능!!(자식이 아니라 ..)
		Parent parent = child;
		log.info("*********** parent: " + parent);
		
		//부모타입에 선언된 메소드 호출 
		parent.method1();	//호출 ok!
		parent.method2();	//호출 ok!
		
		//자식타입에 선언된 메소드 호출 
//		parent.method3();	//호출 불가능 !
		
		//자식을 부모로부터 빼내오는 방법 
		Child ch = (Child)parent;
		log.info("*********** ch: " + ch);
		ch.method3();
		
	}//main
	
}//end class
