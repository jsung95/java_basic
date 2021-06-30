package interface_Car;

import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j;


@Log4j
@NoArgsConstructor
public class Car {
	
	// Lvalue 참조변수의 타입은 "interface"임
	// Rvalue는 Lvalue의 interface를 implements 한 타입의 객체임 
	// 다형성-1
	Tire frontLeftTire = new HankookTire();
	Tire frontRightTire = new HankookTire();
	Tire backLeftTire = new HankookTire();
	Tire backRightTire = new HankookTire();
	
	void run() {
		log.info("run() invoked.");
		
		// 다형성-2 
		frontLeftTire.roll();
		frontRightTire.roll();
		backLeftTire.roll();
		backRightTire.roll();
	}// run
	
}// end class 
