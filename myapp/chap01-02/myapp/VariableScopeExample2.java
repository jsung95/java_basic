package myapp;

public class VariableScopeExample2 {
	public static void main(String[] args) {
		int v1 = 15; 		// 변수의 "정의"
		
		if(v1 > 10) { 		// 변수의 "사용"
			int v2; 		// 변수의 "선언"
			v2 = v1 - 10; 	// 변수의 "정의"
		} // if
		

		// int v3 = v1 + v2 + 5; 		// v2 변수를 사용할 수 없기 때문에 컴파일 에러가 생김
		
		
	} // main
	
} // end class
