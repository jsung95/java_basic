package myapp;

import lombok.extern.log4j.Log4j2;


@Log4j2
public class bubbleSort {
	public static void main(String[] args) {

		//크기가 5인 배열 선언
		int[] arr = new int[5];
		
		System.out.println("정렬 전");
		for(int i=0; i<5; i++) {
			//반복문을 통해 1 ~ 20 사이의 난수값을 배열에 대입
			arr[i] = (int)(Math.random() * 20) + 1;
			
			//정렬 전 배열 요소 출력
			System.out.print(arr[i] + " ");
		}
		
		//SWAP을 위한 변수 선언
		int a;
		int b;
		
		//배열의 전체크기 - 1 만큼 반복 수행 
		for(int i=0; i<arr.length-1; i++) {
			//가장 큰 숫자가 결정되면 비교할 필요가 없기 때문에
			//배열 전체크기 - 1 - i 만큼 반복 수행 
			for(int j=0; j<arr.length-1-i; j++) {
				//비교할 배열의 첫번째 요소가 두번째 요소보다 크다면 SWAP 수행 
				if(arr[j] > arr[j+1]) {
					//1. 변수사용하는 로직 
//					//SWAP을 위해 선언한 변수 a, b에
//					//SWAP을 수행한 결과를 대입. 
//					a = (arr[j] + arr[j+1]) - arr[j];
//					b = (arr[j] + arr[j+1]) - arr[j+1];
//					
//					//각 요소에 변수 a, b 대입  
//					arr[j] = a;
//					arr[j+1] = b;
					
					//2. 변수없이 바로 대입
					// (1) a = (a + b)
					arr[j] = (arr[j] + arr[j+1]);
					// (2) b = (a + b)
					arr[j+1] = (arr[j] + arr[j+1]);
					// (3) b = 2a - b
					arr[j+1] = (arr[j] * 2) - arr[j+1];
					// (4) a = a - b
					arr[j] = arr[j] - arr[j+1];
					
				}//if
				 
			}//inner for
			
		}//outer for
		
		
		System.out.println();
		System.out.println("정렬 후");
		for(int i=0; i<arr.length; i++) { //정렬 후 배열 요소 출력 
			System.out.print(arr[i] + " ");
		}//for
		
		
	}//main
}//end class
