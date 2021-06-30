package myapp;

import lombok.extern.log4j.Log4j;


@Log4j
public class threehang {
	public static void main(String[] args) {
		int num = 85;
		char grade = 
				(num > 90) ? 
					'A' : ( 
							(num  > 80) ? 'B' : 'C' 
						  );
		log.info(num + " 점은 " + grade + " 등급입니다");
		
	}
}
