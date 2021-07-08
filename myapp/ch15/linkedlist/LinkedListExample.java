package linkedlist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import lombok.extern.log4j.Log4j2;


@Log4j2
public class LinkedListExample {

	//LinkedList : 요소를 배열처럼 옆에 붙여놓지 않고, 이곳/저곳에 산발적으로 저장하기때문에,
	// 1) 인덱스 란 개념 자체가 없다
	// 2) 대신, 변경(추가/삭제) 이 자주 발생할 때 생기는 "밀고/땡기는 현상" 자체가 없다.
	public static void main(String[] args) {
		// ArrayList 컬렉션 생성 
		List<String> list1 = new ArrayList<>(); //타입추론
		
		// LinkedList 컬렉션 생성 
		List<String> list2 = new LinkedList<>(); //타입추론
		
		//-----------------------------------
		
		// 사용할 List의 소요시간을 체크해보자 
		long startTime; // 소요시간 측정을 위한 "시작" 시간 보관 변수선언 
		long endTime;	// 소요시간 측정을 위한 "종료" 시간 보관 변수선언 
		
		//nano seconds : 10억분의 1초 = 1ns.
		//milli seconds : 천분의 1초 = 1ms.
		startTime = System.nanoTime(); 		//"시작" 시간측정 변수 초기화 
		
			for(int i=0; i<1000000; i++) {
				//0번째 인덱스에 값을 계속 넣기 때문에 계속 밀리는 현상 발생
				list1.add(0, String.valueOf(i));  
			}//for

		
		endTime = System.nanoTime();
		log.info("ArrayList 걸린시간 : \t" + (endTime - startTime) + "ns");
		
		//-------------------------------------
		
		startTime = System.nanoTime();
		
			for(int i=0; i<1000000; i++) {
				list2.add(0, String.valueOf(i));
			}//for
		
		endTime = System.nanoTime();
		
		log.info("LinkedList 걸린시간 : \t" + (endTime - startTime) + "ns");
		
	}//main

}//end class
