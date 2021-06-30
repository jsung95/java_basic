package Person;

public class Person {
	// 자바언어에서는 전역변수란 존재하지 않다.
	// 필드와 지역변수만이 존재한다.
	// static 변수 또한 가져다 쓰는 것 일 뿐, 전역변수가 아님.
	
	// 즉, 아래 멤버변수(필드) 또한 지역변수 
	int age;
	String name;
	
	static int count;
	static final double PI = 3.141592; //진정한 진리값을 가지는 상수라는 의미 
	
	static {
		Person.count = 0;
	} // static initializer
	
	
	public Person() {
		++Person.count;
	} //default constructor
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	} // user defined constructor
	
	int walk(int speed) { // 매개변수 int speed는 지역변수 
		//인스턴스 필드의 사용 
		System.out.println(this.name);
		System.out.println(this.age);
		
		//정적 필드의 사용 
		System.out.println(Person.count);
		
		return speed;
	} //walk
	
	static int getPersonCount() {
	//Static Reference 에서 인스턴스 필드를 사용할 수 없다 
	// 인스턴스 멤버 = 인스턴스 멤버 + 정적 멤버 모두 사용 가능
	// 정적 멤버 = 오로지 정적 멤버만 사용 가능 
		
//		System.out.println(this.name);
//		System.out.println(this.age);
//		System.out.println(name);
//		System.out.println(age);
		
		return Person.count;
	}
	
	
} //end class
