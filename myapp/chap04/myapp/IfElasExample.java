package myapp;

import lombok.extern.log4j.Log4j;


@Log4j
public class IfElasExample {
	public static void main(String[] args) {
		int score = 85;
		
		if(score >= 90) {
			log.info("점수가 90보다 큽니다");
			log.info("등급은 A 입니다");
		}
		else {
			log.info("점수가 90보다 작습니다");
			log.info("등급은 B 입니다");
		}
		
		
	}
}
