package no_arguments_no_return;

@FunctionalInterface
public interface MyFunctionalInterface {
	//추상메소드가 오직 1개인 인터페이스 -> 함수적 인터페이스라고 한다.
	//컴파일러가 컴파일 시에, 이 인터페이스가 함수적 인지/아닌지 강하게 체크 할 수 있도록 
	// @FunctionalInterface 어노테이션을 붙여주는것을 권장한다.
	public abstract void method();
	
}//end interface
