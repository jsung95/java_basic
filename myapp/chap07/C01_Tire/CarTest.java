package C01_Tire;

import lombok.extern.log4j.Log4j;


@Log4j
public class CarTest {
	
	public static void main(String[] args) {
		Car car = new Car();		// 자동차 객체(완성객체) 생성 
		
		//자동차의 타이어를 최대 5번 회전시킴(car.run() 메소드에 의해서 )
		for(int i=1; i<=5; i++) {
			int problemLocation = car.run();	//달려라! -> 그럼, 타이어 부품필드의 객체의 roll()메소드 수행 
			
			// 총5번 회전시키다가 어느 위치의 타이어에서 펑크가 발생한다면 
			switch(problemLocation) {
				case 1: //전방 좌측 타이어 펑크 
					log.info("앞왼쪽 HankookTire로 교체");
					car.frontLeftTire = new HankookTire("앞왼쪽", 15);	//다형성-1. 즉, 타이어 교체 
					break;
				case 2: //전방 우측 타이어 펑크 
					log.info("앞오른쪽 KumhoTire로 교체");
					car.frontRightTire = new KumhoTire("앞오른쪽", 13);
					break;
				case 3: //후방 좌측 타이어 펑크 
					log.info("뒤왼쪽 HankookTire로 교체");
					car.backLeftTire = new HankookTire("뒤왼쪽", 14);
					break;
				case 4: //후방 우측 타이어 펑크 
					log.info("뒤오른쪽 KumhoTire로 교체");
					car.backRightTire = new KumhoTire("뒤오른쪽", 17);
					break;
			}//switch
			log.info("---------------------------");
		}//for
	}
}
