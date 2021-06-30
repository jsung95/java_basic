package myapp;

import lombok.extern.log4j.Log4j;

@Log4j
public class randArray {
	public static void main(String[] args) {
		int min = 10;
		int max = 25;
		
		
		
		for(int i=0; i<max; i++) {
			int randNum = (int)(Math.random() * (max - min)) + min;
			
			log.info(randNum);
			
		}
		
	}
}
