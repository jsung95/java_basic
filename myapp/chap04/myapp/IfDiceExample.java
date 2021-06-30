package myapp;

import java.util.Random;

import lombok.extern.log4j.Log4j;


@Log4j
public class IfDiceExample {
	public static void main(String[] args) {
		int num = (int)(Math.random()*6) + 1;
		// Math.random() 메소드 : 0.0 <= x < 1.0 범위의 실수값을 무작위로 반환
		// 0 <= x < 1  ---> Half-open --> [0 , 1)
		// 0 <= x <= 1 ----> full closed --> [0 , 1]
		
		// 
		
		if(num == 1) {
			log.info("1번이 나왔습니다.");
		}
		else if(num == 2) {
			log.info("2번이 나왔습니다.");
		}
		else if(num == 3) {
			log.info("3번이 나왔습니다.");
		}
		else if(num == 4) {
			log.info("4번이 나왔습니다.");
		}
		else if(num == 5) {
			log.info("5번이 나왔습니다.");
		}
		else {
			log.info("6번이 나왔습니다.");
		}
		
	}
}
