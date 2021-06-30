package Car;

import lombok.extern.log4j.Log4j;


@Log4j
public class C08_CarTest {
	public static void main(String[] args) {
		//new 연산자 + 생성자 호출 => 객체 생성
		//new 연산자가 뒤에오는 생성자를 호출하는 것입니다. (자바컴파일러가 아니라..)
		C07_Car myCar = new C07_Car("검정", 3000);
	
		//C07_Car myCar =new Car(); ----> (X)
		
		
		
		log.info("myCar : " + myCar);
		
	}
}
