package Car;

import lombok.NoArgsConstructor;


@NoArgsConstructor
public class C03_Car {
	//필드 --> 클래스 블록 내에서 선언된 변수는 변수가 아닌 '필드'
	//현실세계의 객체의 속성을, 객체를 찍어내는 틀
		// 즉, 클래스에 필드로 선언
	String company = "현대자동차";
	String model = "그렌저";
	String color = "검정";
	int maxSpeed = 350;
	int speed;
}
