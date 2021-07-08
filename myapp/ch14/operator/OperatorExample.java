package operator;

import java.util.function.IntBinaryOperator;

import lombok.extern.log4j.Log4j2;


@Log4j2
public class OperatorExample {
	//배열 리터럴 
	private static int[] scores = { 92, 95, 87 };

	//----------------------------------------------------//
	//매개변수 타입이, java.util.function패키지의 IntBinaryOperator 함수적 인터페이스 타입임.
	//이 함수적 인터페이스는 2개의 int 값을 입력으로 줄테니, int 값 하나를 반환하라!는 추상메소드를 가지고 있음
	// 이 추상메소드는 : int applyAsInt(int left, int right);
	//----------------------------------------------------//
	
	//이 메소드는 배열의 원소중에, 최소 또는 최대값을 반환하는 기능을 수행하는 메소드임.
	public static int maxOrMin(IntBinaryOperator operator) {
		int result = scores[0]; //배열의 첫 번째 원소 
		
		for(int score : scores) {
			//우리가 던진 람다식의 블록 내의 구현에서, 큰 값/또는 작은 값을 반환하도록 구현 
			result = operator.applyAsInt(result, score);
		}//enhanced for
		
		return result;
		
	}//maxOrMin
	
	
	public static void main(String[] args) {
		
		//--1. 최대값 얻기 
		int max = maxOrMin(	(a, b) -> { if(a >= b) {
											return a;
										}
										else {
											return b;
										}//if-else					
									} //람다식을 통한 익명구현객체 생성 및 전달
							); //maxOrMin
		
		log.info("최대값 : " + max);
		
	}//main

}//end class
