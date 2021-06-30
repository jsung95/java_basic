package myapp;

import lombok.extern.log4j.Log4j;


@Log4j
public class BooleanExample1 {
	public static void main(String[] args) {
		boolean stop = true;
		
		stop = !stop;
		log.info(stop);
		
		stop = !stop;
		log.info(stop);
		
	} // main
} // end class
