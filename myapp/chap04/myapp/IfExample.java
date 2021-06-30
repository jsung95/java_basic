package myapp;

import lombok.extern.log4j.Log4j;


@Log4j
public class IfExample {
	public static void main(String[] args) {
		int score = 93;
		
		if(score >= 90) {
			log.info("점수가 90보다 큽니다.");
			log.info("등급은 A 입니다.");
		} // if
		
		if(score < 90) {
			log.info("점수가 90보다 작습니다.");
			log.info("등급은 B 입니다.");
		} // if
		
		if(score > 100) {	
			;;			// 아직 뭘 할지 결정하지 않은 상황 pass
		}
		
		
		
	} // main
	
} // end class
