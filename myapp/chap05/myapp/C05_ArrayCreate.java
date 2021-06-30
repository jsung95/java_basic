package myapp;

import lombok.extern.log4j.Log4j;


@Log4j
public class C05_ArrayCreate {
	public static void main(String[] args) {
		int[] score = {83, 90, 87};
		
		log.info("배열의 크기 : " + score.length);
		
		log.info("scores[0] : " + score[0]);
		log.info("scores[1] : " + score[1]);
		log.info("scores[2] : " + score[2]);
		
		
		int sum = 0;
		
		//배열을 포함한 자료구조의 모든 요소의 값을 차레차례 사용하는행위
				// --> traverse(순화) 라고 부른다
//		for(int i=0; i<3; i++) {
//			sum += score[i];
//		} //for (Classical for)
		
		
		// enhance for 문에 사용가능한 자료구조는
		// 기본적으로 배열객체 + Iterable 객체만이 사용 가능 
		for( int elements : score ) {
			sum += elements;
		} // enhanced for
		
		
		
		log.info("배열의 총 합 : " + sum);
		
		double avg = (double)sum/score.length;
		
		log.info("배열의 평균 : " + avg);
		
		
		
		//-----------------------------------//
		
		
		// 두 개의 실행문장으로 "분리" 되면, 배열객체의 생성시, 반드시
		// 아래와 같이 new 연산자로 배열객체를 생성해야함
		int[] scores;
		scores = new int[] {83, 90, 87};
		
		int sum1 = 0;
		
		for(int i=0; i<3; i++){
			sum1 += scores[i];
		}
		
		log.info("총 합1 : " + sum1);
		
		
		//---------------------------------//
		
		
		int sum2 = add(new int[] {83, 90, 87});
		log.info("총 합2 : " + sum2);
		
		
		int[] intArray = {83, 90, 87};
		int sum3 = add(10,20,30);
		log.info("총 합3 : " + sum3);
		
	} //main
	
	
	public static int add(int... scores) {
		int sum = 0;
		for(int i=0; i<scores.length; i++) {
			sum += scores[i];
		}
		return sum;
	}
	
}// end class
