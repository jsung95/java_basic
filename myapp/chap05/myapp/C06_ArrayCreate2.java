package myapp;

import lombok.extern.log4j.Log4j;


@Log4j
public class C06_ArrayCreate2 {
	public static void main(String[] args) {
		int[] arr1 = new int[3];
		
		for(int i=0; i<3; i++) {
			log.info("arr1[" + i + "] : " + arr1[i]);
		} //for
		
		
		// 배열의 각 원소에 값을 변경 (*유의 : 초기화가 아님)
		// 이미 초기값으로는 0이 들어가 있음
		arr1[0] = 10;
		arr1[1] = 20;
		arr1[2] = 30;
		
		for(int element : arr1) {
			log.info(element);
		} //enhanced for
		
		
		
		//-----------------------------//
		
		
		
		
		double[] arr2 = new double[3];
		
		for(int i=0; i<3; i++) {
			log.info("arr2[" + i + "] : " + arr2[i]);
		} // for
		
		for(double elemnet : arr2) {
			log.info(elemnet);
		} // enhanced for
		
		
		
		//------------------------------------//
		
		String[] arr3 = new String[3];
		
		for(String element : arr3) {
			log.info(element);
		}
		
		
		
		
		
		
	} //main
	
} //end class
