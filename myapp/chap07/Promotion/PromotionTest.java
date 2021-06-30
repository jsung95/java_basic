package Promotion;

public class PromotionTest {
	public static void main(String[] args) {
		B b = new B(); // B 타입 객체 생성
		C c = new C(); // C 타입 객체 생성
		D d = new D(); // D 타입 객체 생성
		E e = new E(); // E 타입 객체 생성
		
		//A타입은, 상속계층구조에서, 가장 큰 타입
		A a1 = b;	// 다형성-1 : 아들이 부모품에 안깁니다.
		A a2 = c;	// 다형성-1 : 딸이 부모품에 안깁니다.
		A a3 = d;	// 다형성-1 : 손자가 할아버지 품에 안깁니다.
		A a4 = e;	// 다형성-1 : 손자가 할머니 품에 안깁니다.
		
		B b1 = d;	// 다형성-1 : B 타입에 D 자식객체가 대입 
		C c1 = e;	// 다형성-1 : C 타입에 E 자식객체가 대입 
		
		// 상속관계가 형성되어 있지 않은, 두 타입 간에는, 절대로
		// 다형성-1이 발생할 수 없다.(즉, 부모타입 변수에 자식객체가 대입된다라는 조건자체가 없음)
//		B b3 = e;
//		C c2 = d;
		
	}
}
