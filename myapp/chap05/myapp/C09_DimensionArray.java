package myapp;

import lombok.extern.log4j.Log4j;


@Log4j
public class C09_DimensionArray {
	public static void main(String[] args) {
		
		int[]     intArray1 = {1, 2, 3, 4, 5, 6}; //1차원 배열
		log.info(intArray1[0]);
		
		
		int[][]   intArray2 = { {1, 2, 3}, {4, 5, 6}, {7, 8} }; //2차원 배열
		log.info(intArray2[0][0]);
		log.info(intArray2[1][2]);
		log.info(intArray2);
		
		//값의 목록이 없을 때 배열객체를 생성
		// 1차원 배열
		int[] arr1 = new int[5];
		
		// 2차원 배열
		int[][] arr2 = new int[2][4];
		int[][] arr2_1 = new int[2][];
		
		// 3차원 배열
		int[][][] arr3 = new int[3][][];
		
		
		
		
		
//		int[][][] intArray3 = { { {1}, {2}, {3} }, { {4}, {5}, {6} } }; //3차원 배열
//		log.info(intArray3[0][0][0]);
		
		
		
	} //main
} //end class
