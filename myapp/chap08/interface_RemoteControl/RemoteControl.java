package interface_RemoteControl;

public interface RemoteControl {		
	// (public static final) int MAX_VOLUME;
			// (public static final)을 부분적으로 생략하든, 전체를 생략하든,
			// 자바 컴파일러가 대신 자동으로 생성한다.
			// 하지만 절때 생략하지 말라 
	
	//--1. 상수
	public static final int MAX_VOLUME = 10;
	public static final int MIN_VOLUME = 0;
	

	//--2. 추상 메소드 선언 ==> 다형성-2와 직접 관련있음 
	//     이 추상메소드가 곧 규격이자, 자식 타입에서 반드시 재정의 해야하는 강제성을 부여하는 수단.
	// 	   컴파일러가 자동으로 생성해주지만, public abstract 키워드를 절대 생략하지 마라 !!
	public abstract void turnOn();
	public abstract void turnOff();
	public abstract void setVolume(int volume);
	
	
	//--3. 디폴트 메소드
	//	   대상 객체의 기능을 확장하고자 할 때에, 추상메소드를 인터페이스에 추가하는 방식으로 
	// 	   기능을 확장하는 것은, 모든 구현 클래스의 소스에 새로이 추가된 추상메소드를 모두 구현(재정의)하지 않고서는,
	//	   장애가 발생할 수 있음.
	//	   때문에, 구현클래스를 건드리지 않고도, 기능을 확장할 수 있게 인터페이스의 멤버로 추가됨 .
	
	//	   *NOTE : 이 default 메소드는, 이 인터페이스를 implements 하는 구현 클래스에서
	//			   생성된 모든 자식타입객체의 기본(default) 인스턴스 메소드로써 동작함.
	
	// public 키워드를 생략하지 마라!
	public default void setMute(boolean mute) {
		if(mute) {
			System.out.println("무음 처리합니다.");
		}
		else {
			System.out.println("무음 해제합니다.");
		}// if-else
	}// setMute
	
	
	//--4. Static(정적) 메소드 --> 정적 메소드는 재정의를 할 수 없음.
	//							즉, static은 공유되는 개념이기 때문에 공유되는 대상을 재정의 한다는 건 모순적임 
	public static void changeBattery() {
		System.out.println("changeBattery() invoked.");
	}//changeBattery
	
}//end interface
