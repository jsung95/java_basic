package myapp;

import lombok.extern.log4j.Log4j;


@Log4j
public class BooleanExample {
	
	public static void main(String[] args) {
		boolean stop = true;
		
		if(stop) {
			log.info("Stopped.");
		}
		else {
			log.info("Started.");
		} // if-else
		
		
	} // main
} // end class
