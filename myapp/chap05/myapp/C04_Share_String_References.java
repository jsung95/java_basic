package myapp;

import lombok.extern.log4j.Log4j;


@Log4j
public class C04_Share_String_References {
	public static void main(String[] args) {
		// 문자열 리터럴이 동일하다면 String 객체 공유
		String s1 = "Yoseph";
		String s2 = "Yoseph";
		String s3 = "Yoseph";
		
		assert s1 == s2;
		assert s2 == s3;
		
		// new 연산자를 이용해서 새로운 String 객체를 생성하면
		// 주소또한 모두 각각 다름
		String s4 = new String("Yoseph");
		String s5 = new String("Yoseph");
		String s6 = new String("Yoseph");
		
		assert s4 == s5;
		assert s5 == s6;
		
	}
}
