package Airplane;

public class SupersonicAirplaneTest {
	public static void main(String[] args) {
		
		//자식객체 생성(부모객체 생성이 아님)
		SupersonicAirplane sa = new SupersonicAirplane();
		
		sa.takeOff();
		sa.fly();
		
		sa.flyMode = SupersonicAirplane.SUPERSONIC;
		sa.fly();
		
		sa.flyMode = SupersonicAirplane.NORMAL;
		sa.fly();
		sa.land();
	}//main
}//end class
