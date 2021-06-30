package myapp;

import lombok.extern.log4j.Log4j;


@Log4j
public class IfElseIfExample {
	public static void main(String[] args) {
		int score = 75;
		
		if(score >= 90) {
			log.info("점수가 100 - 90 입니다.");
			log.info("등급은 A 입니다");
		}
		else if(score >= 80) {
			log.info("점수가 80 - 89 입니다.");
			log.info("등급은 B 입니다");
		}
		else if(score >= 70) {
			log.info("점수가 70 - 79 입니다.");
			log.info("등급은 C 입니다");
		}
		else {
			log.info("점수가 70 미만 입니다.");
			log.info("등급은 D 입니다");
		}
		
		
		
	}
	
}
