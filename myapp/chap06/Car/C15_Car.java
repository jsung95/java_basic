package Car;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor		// @NonNull 이 붙은 필드로 생성자를 만든다 
public class C15_Car {
	//-- 필드 : 	1) 고유속성   2) 시간에 따라 변하는 상태    3) 부품관게에 있는 다른 객체
	@NonNull String model; 		// 1)고유속성
	int speed; 					// 2)시간에 따라 변하는 상태
	
//	C15_Car(String model) {			// @RequiredArgsConstructor로 생성자를 만들었기 떄문에 사용하지 않음 
//		this.model = model;
//	}//constructor
	
	//Method
	void setSpeed(int speed) {
		this.speed = speed;
	}//setSpeed
	
	void run() {
		for(int i=10; i<50; i+=10) {
			this.setSpeed(i);
			
			System.out.println(this.model + "가 달립니다. (시속 : " + this.speed + "km/h)");
		} //for
	} // run
	
}//end class
