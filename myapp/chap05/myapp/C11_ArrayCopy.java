package myapp;

import java.util.Arrays;

import lombok.extern.log4j.Log4j;


@Log4j
public class C11_ArrayCopy {
	public static void main(String[] args) {
		int[] oldIntArray = {1,2,3};
		int[] newIntArray = new int[5];
		
		for(int i=0; i<oldIntArray.length; i++) {
			newIntArray[i] = oldIntArray[i];
		}
		
		oldIntArray[0] = 100;
		log.info("원본 " + Arrays.toString(oldIntArray));
		log.info("타겟 " + Arrays.toString(newIntArray));
		
		
		
		
	}
}
