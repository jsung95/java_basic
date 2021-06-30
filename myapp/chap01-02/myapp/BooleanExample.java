package myapp;

import lombok.extern.log4j.Log4j;
import lombok.extern.log4j.Log4j2;


@Log4j
public class BooleanExample {
	
	public static void main(String[] args) {
		boolean stop = true;
		
		if(stop) {
			log.info("Stopped.");
			log.info("as22d333344444555");
		}
		else {
			log.info("Started.");
		} // if-else
		
		
	} // main
} // end class
