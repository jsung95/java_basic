package myapp;

import java.util.Arrays;

import lombok.extern.log4j.Log4j;


@Log4j
public class C12_ArrayCopy2 {
	public static void main(String[] args) {
		String[] oldStrArray = {"java", "array", "copy"};
		String[] newStrArray = new String[5];
		
		// void System.arraycopy(
		//			Object  src,		//소스객체(소스배열)
		//			int     srcPos,		//offset(시작인덱스)
		//			Object  dest,		//타겟객체(타겟배열)
		//			int     destPos,	//offset(시작인덱스)
		//			int     length		//복사할 요소의 갯수(=length)
		// )
		
		System.arraycopy(oldStrArray, 
						 0, 
						 newStrArray, 
						 0, 
						 oldStrArray.length
		);
		
		
		oldStrArray[0] = "Yoseph";
		
		log.info("원본 " + Arrays.toString(oldStrArray));
		log.info("타겟 " + Arrays.toString(newStrArray));
		
		
		int[] sourceArray = {1,2,3};
		int[] targetArray = Arrays.copyOf(sourceArray, sourceArray.length);
		
		sourceArray[0] = 100;
		
		log.info("원본 " + Arrays.toString(sourceArray));
		log.info("타겟 " + Arrays.toString(targetArray));
		
	}
}
