package myapp;

import lombok.extern.log4j.Log4j;


@Log4j
public class ForLoopLabel {
	
	public static void main(String[] args) {
		
		Outter: for(char counter='A'; counter<='Z'; counter++) {
			System.out.println('.');
			for(char lower='a'; lower<='z'; lower++) {
				log.info(counter + "-" + lower);
				if(lower == 'g') {
					break Outter;
				} //if
			} //inner for
		} // outter for
		
		
		int i = 1;
		boolean flag = true;
		while(flag) {
			if(i > 10) {
				flag = !flag;
			}
			log.info(i);
			i++;
		}
		
		
		
		
	} // main
	
} // end class
