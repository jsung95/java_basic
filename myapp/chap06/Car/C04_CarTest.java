package Car;

import lombok.extern.log4j.Log4j;


@Log4j
public class C04_CarTest {
	public static void main(String[] args) {
		//객체 생성 -> new 연산자(객체생성연산자)와 클래스에 선언한 "생성자"를 이용
		C03_Car myCar = new C03_Car();
		C03_Car myCar2 = new C03_Car();
		log.info("제작회사1 : " + myCar.company);
		log.info("제작회사2 : " + myCar2.company);
		
		//필드의 사용방법 -> 도트연산자(.)를 이용
		//문법 : 참조변수명.필드명 해서 사용
		log.info("제작회사 : " + myCar.company);
		log.info("모델명 : " + myCar.model);
		log.info("색깔 : " + myCar.color);
		log.info("최고속도 : " + myCar.maxSpeed);
		log.info("현재속도 : " + myCar.speed);
		
		//필드 값 변경
		myCar.speed = 60;
		
		log.info("수정된 속도 : " + myCar.speed);
	} //main
	
}//end class
