package myapp;

import lombok.extern.log4j.Log4j;


@Log4j
public class AccuracyExample2 {
	
	public static void main(String[] args) {
		int apple = 1;
		
		//컴퓨터는 실수를 근사치로 표현하기 때문에,
		//정화한 실수연산값을 계산하려면, 우선 "정수연산"으로 변경해서 수행시킨다음에, 실수로 변환
		int totalPieces = apple * 10;
		int number = 7;
		int temp = totalPieces - number;
		
		double result = temp / 10.0;
		
		log.info("사과 한개에서 ");
		log.info("0.7 조각을 빼면, ");
		log.info(result + " 조각이 남는다.");
		
	} // main

} // end class
