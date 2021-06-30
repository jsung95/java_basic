package Car;

import lombok.extern.log4j.Log4j;

@Log4j
public class C07_Car {
	
	//생성자(Constructor)란...
	//클래스로부터 객체를 생성할 때, 생성된 객체의 필드를 초기화 해주는 역할을 하는 것
	
	//생성자의 종류에는 2가지가 있다
	// 1) Default Constructor - 기본 생성자
	//      - 클래스에 생성자가 선언되어 있지 않을 때, 자바 컴파일러가 대신 만들어 넣어주는 생성자
	// 2) User-defined Constructor - 사용자 정의 생성자
	//      -
	
	
	// - 생성자 이름은 무조건 클래스의 이름과 같아야한다.
	// - 생성자는 특수한 메소드
	// - 하나의 클래스 안에, 여러개의 생성자를 선언할 수 있다 --> 생성자 오버로딩
	
	public C07_Car() {
		;;
	} // 1.기본 생성자 (default constructor)
	
	
	// 생성자를 개발자가 직접 만들어 선언하는 순간 -> 자바 컴파일러는 절때 개입하지 않는다.
	String color; 	//색상
	int cc; 		//배기량
	
	C07_Car(String color, int cc){
		log.debug("Car(color, cc) invoked.");
		log.info("\t + this " + this);
		
		this.color = color;
		this.cc = cc;
	} // 2.사용자 정의 생성자 (user-defined constructor)
	
	
	C07_Car(String color){
		this.color = color;
	}
	
	
	
	
	
	
}// end class
