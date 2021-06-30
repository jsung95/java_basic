package runtime_exception;

import lombok.extern.log4j.Log4j2;


//@Log4j
@Log4j2
public class ClassCastException_Ex {
	public static void main(String[] args) {
		Dog dog = new Dog();
		changeDog(dog);
		
		Cat cat = new Cat();
		changeDog(cat);
		
	}
	
	public static void changeDog(Animal animal) {
		log.debug("changeDog(animal invoked.");
		
		log.info("\t+ animal : " + animal);
		
		if(animal instanceof Dog) {	//안전한 형변환
			
			//다형성-1에 의해, 부모타입의 참조변수에 대입된,
			//자식객체를 부모품에서 다시 강제로 빼낼 때, 강제형변환 필요,
			Dog dog = (Dog) animal;
			
		}//if
		
	}//changeDog
	
}//end class



//Dummy class or Mock class
class Animal {;;}	//end class
class Dog extends Animal {;;} //end class
class Cat extends Animal {;;} //end class 