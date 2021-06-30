package interface_RemoteControl;

import lombok.extern.log4j.Log4j;


@Log4j
public class RemoteControlTest_Anonymous {

	//두번째, "익명구현객체생성 코딩기법"을 배우자!!
	public static void main(String[] args) {
		RemoteControl rc = new RemoteControl() {

			//익명구현객체에서는 자기 자신만의 필드와 메소드를 가질 수 있다.
			//하지만 익명구현객체 블록 내에서'만' 지역적으로 사용할 수 있음 
			String name = "lee";
			
			void method() {
				
			}
			//하지만 생성자는 선언할 수 없다. ----> 왜? - 클래스의 이름을 알 수 없으니까...
			
			
			@Override
			public void turnOn() {
				log.info("turnOn() invoked.");
				
				log.info("\t+ this : " + this);
				log.info("\t+ type : " + this.getClass().getName());
			}//turnOn

			@Override
			public void turnOff() {
				log.info("turnOff() invoked.");
			}//turnOff

			@Override
			public void setVolume(int volume) {
				log.info("setVolume(volume) invoked.");
			}//setVolume
			
		};//"익명구현객체 생성"
		
		rc.turnOn();			//다형성-2: 재정의된 자식객체의 메소드 호출 
		rc.setVolume(10);		//다형성-2: 재정의된 자식객체의 메소드 호출 
		rc.setMute(true);		//**** 인터페이스에 선언된 default 메소드 호출 ****
		rc.turnOff();			//다형성-2: 재정의된 자식객체의 메소드 호출 
		
		RemoteControl.changeBattery();	//인터페이스에 선언된 정적 메소드 호출 
		
		
	}// main
	
}// end class
