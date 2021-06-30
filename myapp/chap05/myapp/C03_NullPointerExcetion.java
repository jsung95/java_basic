package myapp;

import lombok.extern.log4j.Log4j;


@Log4j
public class C03_NullPointerExcetion {
	public static void main(String[] args) {
		
		String name = null;		//null 아무런 객체의 주소도 없다
		int nameLength = name.length();
		
		
		
	}
	
}
