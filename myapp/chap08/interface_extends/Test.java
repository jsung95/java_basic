package interface_extends;

public class Test {
	public static void main(String[] args) {
		//다형성-1 : 부모타입의 참조변수에는, 자식타입의 객체가 대입된다!!
		
		CImpl cObj = new CImpl();
		
		IA ia = cObj;	//ok
		IB ib = cObj;	//ok
		IC ic = cObj;	//ok
		
		ia.methodA();
		ib.methodB();
		
		System.out.println();
		
		ic.methodA();
		ic.methodB();
		ic.methodC();
		
	}// main
	
}// end class
