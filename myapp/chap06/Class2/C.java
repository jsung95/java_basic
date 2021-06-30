package Class2;

import Class.A;

public class C {
	public C() {
		A a = new A();	//public class이므로 객체 생성 가능 
		
		a.field1 = 1;	//public 필드이므로 접근 가능 
//		a.field2 = 1;	//default 다른 패키지에 있으므로 접근 불가 
//		a.field3 = 1;	//private 외부 클래스에있으므로 접근 불가 
		
		a.method1();	//public method
//		a.method2();	//default method 다른패키지에 있으므로 접근 불가 
//		a.method3();	//private method 외부 클래스에 있으므로 접근 불가 
	}
	
}
