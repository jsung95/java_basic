package interface_extends;

public interface IC 
//	인터페이스의 다중상속 ----- extends 키워드를 사용한다!! (implements 키워드가 아니다!)
	extends IA, IB {
	
	public abstract void methodC();
	
}// end interface
