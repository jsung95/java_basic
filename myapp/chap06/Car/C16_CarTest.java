package Car;

import lombok.extern.log4j.Log4j;


@Log4j
public class C16_CarTest {
	int speed;
	
	void run() {
		log.debug("run() invoked");
		
		log.info(speed + "으로 달립니다.");
	}//run
	
	public static void main(String[] args) {
		log.debug("main(args) invoked.");
		
		C16_CarTest myCar = new C16_CarTest();
		
		//인스턴스 필드와 메소드 사용 
		myCar.speed = 60;
		
		myCar.run();
	}//main
	
}//end class
