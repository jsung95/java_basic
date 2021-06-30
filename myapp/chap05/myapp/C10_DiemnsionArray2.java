package myapp;

import lombok.extern.log4j.Log4j;


@Log4j
public class C10_DiemnsionArray2 {
	public static void main(String[] args) {
//		int[][] mathScore = new int[2][3];
//		
//		//2차원배열의 각 요소를 traverse(순화) 하자
//		for(int i=0; i<mathScore.length; i++) {
//			
//			//안쪽 요소 배열을 traverse
//			for(int k=0; k<mathScore[i].length; k++) {
//				log.info("mathScores[" + i + "][" + k + "] = " + mathScore[i][k]);
//			}//inner for
//			
//		}//outer for
//		
//		log.info("=====================");
//		
//		
//		int[][] mathScore2 = { {1,2,3}, {4,5,6,7} };
//		
//		
//		
//		int i=0; //바깥쪽 배열의 인덱스
//		
//		for (int[] score : mathScore2) {
//			
//			int k=0; //안쪽 요소배열의 인덱스
//			
//			for (int number : score) {
//				String s = String.format("mathScores[%d][%d] = ", i, k);
//				k++;
//				log.info(s + number);
//				
//			}
//			i++;
//			
//		}//enhanced for
		
		int[][] englishScores = new int[2][];
		
		englishScores[0] = new int[2];
		englishScores[1] = new int[3];
		
		for(int i=0; i<englishScores.length; i++) {
			
			
			for(int k=0; k<englishScores[i].length; k++) {
				log.info("englishScores[" + i + "][" + k + "] = " + englishScores[i][k]);
			}//inner for
			
		}//outer for
		
		
		
		
	}//main
	
}//end class
