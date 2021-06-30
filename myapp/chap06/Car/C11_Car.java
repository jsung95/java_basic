package Car;

import lombok.ToString;
import lombok.extern.log4j.Log4j;

// 우리가 배열을 이쁘게 출력하려면, Arrays.toString() 이용
// 클래스로부터 생성한 객체의 필드를 이쁘게 출력해주는 용도로
// 조상클래스인 Object.toString() 메소드를 자동으로 Overriding해서
// 객체를 출력할 때, 객체의 레퍼런스를 출력하는게 아니라,

@ToString
@Log4j
public class C11_Car {
	//필드
	String company = "현대자동차";
	String model;
	String color;
	
	int maxSpeed;
	
	
	//생성자
	C11_Car() {
		this(null, null, 0);
		
		log.debug("Default constructor invoked");
	} // default constructor
	
	
	C11_Car(String model){
		this(model, null, 0);
		
		log.debug("constructor(model) invoked");
	} // user-defined constructor
	
	
	C11_Car(String model, String color){
		this(model, color, 0);
		
		log.debug("constructor(model, color) invoked");
	} // user-defined constructor
	
	
	C11_Car(String model, String color, int maxSpeed){
		log.debug("constructor(model, color, maxSpeed) invoked");
		
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	} // user-defined constructor
	
	
	
}
