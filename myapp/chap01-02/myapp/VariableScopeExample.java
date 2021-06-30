package myapp;

public class VariableScopeExample {
	
	static {;;} // User-defineded block
	
	// 변수사용의 대전제 : 변수가 "정의"되어 있어야, 변수를 사용가능하다
	public static void main(String[] args) {
		int var1; // <--- 변수가 선언만 되고, 초기값이 주어지지 않았음(즉, 변수선언
		
		if(true) {
			int var2; // <-- 이 변수역시, 변수 "정의"가 아니라, "선언" (초기화가 안됨)
			var1 = 10; // <-- 바로 여기서, 선언만 된 변수의 초기화를 수행
			var2 = 20;
			
			
			
		} // if
		
		var1 = 10; // 이 문장은 변수의 "정의"가 아니라 변수의 "사용"
		
		for(int i=0; i<1; i++) {
			int var3; // <-- 이 변수역시, 변수 "정의"가 아니라, "선언" (초기화가 안됨)
			
			var1 = 10; // 이 문장은 변수의 "정의"가 아니라 변수의 "사용"
			var3 = 30; // <-- 바로 여기서, 선언만 된 변수의 초기화를 수행 (변수의 정의)
		}
		
		
		var1 = 10; // 이 문장은 변수의 "정의"가 아니라 변수의 "사용"
		
	} // main
	
	
} // end class
