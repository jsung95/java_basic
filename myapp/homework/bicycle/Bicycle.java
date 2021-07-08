package bicycle;

import brake.Brake;
import handle.Direction;
import handle.Handle;
import lombok.extern.log4j.Log4j;
import tire.ITire;
import tire.TireImpl1;
import tire.TireImpl2;
import java.util.Scanner;


@Log4j
public class Bicycle {
	

	Scanner sc = new Scanner(System.in);
	
	//필드
	private int distance; //100km 주행
	int rand = (int)(Math.random() * 100) + 1;
	
	String company;
	String model;
	String color;
	int price;
	
	int speed;
	
	Bicycle(){
		
	}// default constructor

	Bicycle(String company, String model, String color, int speed, int price) {
		this.company = company;
		this.model = model;
		this.color = color;
		this.price = price;
		
		this.speed = speed;
		//this.speed = speed * ITire.MIN_INCH * @#!#!@#@; //타이어 크기별 거리 다른거 구현
	}// constructor
	
	//Handle
	Handle handle = new Handle();
	
	
	//Brake
	Brake brake = new Brake();
	
	//Tire
	TireImpl1 tire = new TireImpl1();
	ITire tireImple1 = new TireImpl1();
	ITire tireImple2 = new TireImpl2();
	
	
	public void event(int rand) {
		log.debug("Event() invoked.");
		log.info(rand);
		if (rand >= 1 && rand < 6) {	//압정밟기
//			tire.pin();
			log.info("tire.pin() invoked");
		} else if (rand < 16) {		//넘어지기
			handle.breakDown();
			log.info("handle.breakDown() invoked");
		} else if (rand < 66) {		// 핸들조작
			handle.changeDir();		
			log.info("handle.changeDir() invoked");
		} else if (rand < 71) {		// 휴식
			;; 						//////* 휴식구현 어케함? *////
			log.info("휴식 invoked");	
		} else if (rand < 76) {		// 브레이크고장
			 brake.breakDown();
			 log.info("brake.breakDown() invoked");
		} else {					// 내리막길
			brake.operating(false, this.speed);	////*current speed 매개변수값???*////
			log.info("brake.operating(op, current) invoked");
		} // if-else	
	} //event
	
	
	public void run() {
		
		log.info("자전거 여행을 출발 합니다!");
		
		
		log.info("↓↓↓↓↓↓↓자전거 설명서↓↓↓↓↓↓↓");
	    log.info("큰자전거 : 블랙 색상, 29인치 타이어, 6km마다 타이어 내구도 소모");
	    log.info("작은 자전거 : 화이트 색상, 26인치 타이어, 4km마다 타이어 내구도 소모");
	    System.out.print("자전거를 선택하세요. 1 : 큰자전거 2 : 작은 자전거  ::  (1 / 2)");
	    int bicType = sc.nextInt();
		
		
		
		System.out.print("목적지까지 거리 설정(km) : ");
		setDistance(sc.nextInt());
		
		
		
		
//		while(distance > 0) {
//			   
//			log.info("목적지까지 남은거리는 " + getDistance() + "km 입니다.");
//	        handle.changeDir();
//	      
//	         
//	        if(bicType == 1 ) {         // 선택한 자전거 크기에따른 각각의 메소드 호출 
//	        this.distance = largeTire.roll(getDistance());
//	        
//	        }else {
//	           this.distance = smallTire.roll(getDistance());
//	        }
//	    }
//		
//		log.info("도착했다! 긴 여정이었다!");
		
		
		
		
		brake.operating(true, this.speed);
		
		tireImple1.roll();
		
		event(rand);
		
	}//run
	
	
	public void stop() {
		log.info("목적지 도착!");
	}//stop

	public int getDistance() {
		return distance;
	}//getDistance

	public void setDistance(int distance) {
		this.distance = distance;
	}//setDistance


	
}//end class