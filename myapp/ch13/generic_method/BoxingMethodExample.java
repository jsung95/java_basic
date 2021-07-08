package generic_method;

import generic_type.Box;

public class BoxingMethodExample {
	public static void main(String[] args) {
		
		//Util.boxing 메소드는 (Generic method 이기때문에,
		// 이메소드를 호출할 때 (즉 사용할때) 타입파라미터에 구체타입을 지정해서 호출해야함 
		Box<Integer> box1 = Util.<Integer>boxing(100);
		Integer intValue = box1.get();
		
		
		Box<String> box2 = Util.<String>boxing("홍길동");
		String strValue = box2.get();
		
	}
}
