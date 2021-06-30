package Car;

import lombok.extern.log4j.Log4j;


@Log4j
public class C14_CarTest {
	public static void main(String[] args) {
		C13_Car myCar = new C13_Car();				//객체 생성 
		//객체를 생성하지않고는 인스턴스멤버가 존재할 수 없기 때문에 객체를 생성한다.
		
		myCar.setGas(5); 							//메소드 호출
		
		boolean gasState = myCar.isLeftGas();		//메소드 호출
		
		if(gasState) {
			log.info("출발합니다 ");
			
			myCar.run();							//메소드 호출
		}//if
		
		if(myCar.isLeftGas()) {						//메소드 호출
			log.info("gas를 주입할 필요가 없습니다.");
		}
		else {
			log.info("gas를 주입하세요 ");
		}//if-else
		
	}//main
	
}//end class
