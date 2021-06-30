package Korean;

public class C09_Korean {
	//필드
	String nation = "대한민국";
	String name;
	String ssn;
	
	
	public C09_Korean(String name, String ssn) {
		this.name = name;
		this.ssn = ssn;
	} //User-defined constructor
	
	
	//생성자 오버로딩이든, 메소드 오버로딩이든, 오버로딩의 규칙은 같다
	// 매개변수의 (개수, 순서, 타입) 이 세가지 중에 하나라도 달라야 된다!
	// 따라서 아래의 생성자는 위 조건중 하나라도 만족하지 못 하기 때문에 오류 발생
	
//	public C09_Korean(String n, String s) {
//		this.name = n;
//		this.ssn = s;
//	}
	
	
	
	
	
	
} //end class
