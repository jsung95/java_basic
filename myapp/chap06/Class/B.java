package Class;

public class B {
	public B() {
		A a = new A();	//같은 패키지의 A타입의 객체 생성 
		
		a.field1 = 1;	//필드 접근 역시 접근제한자의 제약을 받지 않음 .
		a.field2 = 1;	//B클래스 역시 같은 패키지 안에 있으니 가
//		a.field3 = 1;	//접근제한자가 private라서 접근 불가 
		
		a.method1();	//public method
		a.method2();	//default method 같은 패키지 내부에 있으니 가능 
//		a.method3();	//private method 외부에서 접근 불가 
	}
}//end class
