package abstract_Ex;


public class PhoneTest {
	public static void main(String[] args) {
//		Phone phone = new Phone(); // (X) 추상클래스는 new연산자를 통해 객체 생성 불가 
		
		SmartPhone smartPhone = new SmartPhone("홍길동");	//실체클래스로부터 실체 새성 
		
		smartPhone.turnOn();							//추상클래스의 메소드 호출 
		
		smartPhone.internetSearch();					//실체클래스의 메소드 호출 
		
		smartPhone.turnOff();							//추상클래스의 메소드 호출 
		
	}//main
	
}//end class
