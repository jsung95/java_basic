package myapp;

import lombok.extern.log4j.Log4j;


@Log4j
public class bb {
	public static void main(String[] args) {
		// 주머니에 돈이 있으면 택시를 타고 없으면 걸어간다
		boolean isCard = true;
		
		if(isCard) {
			log.info("택시를 탄다");
		}
		else {
			log.info("걸어간다");
		}
		
		
		//학생의 점수가 76점입니다.
		//아래 기준에 따라, A/B/C/D 등급으로 구분하세요
		// A 등급 = 90 <= 점수 <= 100
		// B 등급 = 80 <= 점수 <= 89
		// C 등급 = 70 <= 점수 <= 79
		// D 등급 = 점수 < 70
		
		int score = 76;
		char grade = ' ';
		if(score >= 90 && score <= 100) {
			grade = 'A';
		}
		else if(score >= 80 && score <= 89) {
			grade = 'B';
		}
		else if(score >= 70 && score <= 79) {
			grade = 'C';
		}
		else if(score >= 0 && score < 70) {
			grade = 'D';
		}
		else {
			log.info("옳바른 점수를 기입");
		}
		
		log.info(score + " 점의 등급은 " + grade + " 입니다.");
		
		
		
		
		//이름이 "Yoseph" 이고, 나이가 25 이상이면
		//아주 잘생겼습니다 라고 출력
		//그렇지 않으면 아주 멋지십니다 라고 출력
		
		
		String name = "Yoseph";
		int age = 30;
		
		if(name == "Yoseph" && age >= 25) {
			log.info("아주 잘생겼습니다.");
		}
		else {
			log.info("아주 멋지십니다.");
		}
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
}
