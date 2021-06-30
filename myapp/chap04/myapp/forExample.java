package myapp;

import lombok.extern.log4j.Log4j;


@Log4j
public class forExample {
	public static void main(String[] args) {
		
		int sum = 0;
		
		for(int i=1; i<=100; i++) {
			sum += i;
		}
		
		log.info(sum);
		
		int i = 1;
		while(i<=10) {
			log.info(i);
			i++;
		}
		
		log.info("-------------");
		
		for(int j=1; j<=10; j++) {
			if(j % 2 != 0) {
				continue;
			}
			log.info(j);
		}
		
		
		
	}
}
