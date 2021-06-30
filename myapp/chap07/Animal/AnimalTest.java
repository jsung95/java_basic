package Animal;

import lombok.extern.log4j.Log4j;


@Log4j
public class AnimalTest {
	
	//다형성(polymorphism)이 발생하려면, 절대 잊지 맙시다!!
	//다형성-1 과 -2가 만드시 필요하다.
	public static void main(String[] args) {
		
		//--1. 강아지의 소리를 맞게 내게 하자!!
		Animal animal = new Dog();  //다형성-1. 부모타입에 자식타입의 객체가 대입 
		animal.sound();				//다형성-2. Overriding된 자식객체의 메소드 호출 
		
		//--2. 고양이 소리를 맞게 내게 하자!!
		animal = new Cat(); 		//다형성-1. 부모타입에 자식타입의 객체가 대입 
		animal.sound();				//다형성-2. Overriding된 자식객체의 메소드 호출 
		
		
		
	}//main
	
}//end class
