package myapp;

import lombok.extern.log4j.Log4j;

@Log4j
public class nonlee {
	public static void main(String[] args) {
		int charCode = 'A';
		
		if((charCode >= 65) & (charCode <= 90)) {
			log.info("대문자입니다.");
		}
		
		if((charCode >= 97) && (charCode <= 122)) {
			log.info("소문자입니다");
		}
		
		if( !(charCode < 48) && !(charCode > 57) ) {
			log.info("0~9");
		}
			
		
		
		
		int value = 6;
		
		if( (value%2 == 0) | (value%3 == 0) ) {
			log.info("2 또는 3의 배수");
		}
		
		if( (value%2 == 0) || (value%3 == 0) ) {
			log.info("2 또는 3의 배수");
		}
		
	}
}
