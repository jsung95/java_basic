package Car;

//객체의 모델링과 상관 없이, 객체가 가지고 있는 필드에 대해서 
//	1) Getter 메소드는 => 필드의 값을 반환해주는 메소드
//		* 메소드 이름의 관례 :
//			가. get + 필드명
//			나. 예외 : 만일 필드의 타입이 논리타입(boolean)이라면, is + 필드명 
//  2) Setter 메소드는 => 필드의 값을 변경해주는 메소드 
//			가. set + 필드명(매개변수 선언부 - 매개변수명을 필드명과 동일하게 지정 )


//Getter / Setter 메소드 사용 
public class C17_Car {
	//필드 
	private int speed;
	private boolean stop;
	
	//생성자 
	
	//메소드
	public int getSpeed() {
		return this.speed;
	} //getSpeed
	
	// Setter 메소드의 역할 : 외부에서 준 전달인자로 필드의 값을 변경하기 전에, 무결성을 체크 
	public void setSpeed(int speed) {
		if(speed < 0) {
			this.speed = 0;
			return;
		}
		else {
			this.speed = speed;
		}//if-else
	}//setSpeed
	
	public boolean isStop() {
		return stop;
	}//isStop
	
	public void setStop(boolean stop) {
		this.stop = stop;
		this.speed = speed;
	}//setStop
	
}//end class
