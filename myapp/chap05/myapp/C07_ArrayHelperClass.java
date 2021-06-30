package myapp;

import java.util.Arrays;

import lombok.extern.log4j.Log4j;


@Log4j
public class C07_ArrayHelperClass {
	public static void main(String[] args) {
		

		int[] ary = {3,5,2,4,1};
		
		
		//Helper Class		
		Arrays.sort(ary);
		
		for(int i=0; i<ary.length; i++) {
			System.out.print(ary[i] + " ");	
		}
		
	}
}
