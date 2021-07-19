package treeset;

import java.util.TreeSet;

import lombok.extern.log4j.Log4j2;


@Log4j2
public class TreeSetExample {
	
	//이진트리를 활용한, 자동정렬 + 중복제거를 위한 TreeSet 사용 예제 
	public static void main(String[] args) {
		
		//--1. TreeSet 객체 생성 
		TreeSet<Integer> scores = new TreeSet<>(); //타입추론 
		
		//--2. 새로운 요소 추가 
		scores.add(87);
		scores.add(98);
		scores.add(75);
		scores.add(95);
		scores.add(80);
		
		//--3. TreeSet안에 구성된 이진트리를 탐색하는 메소드의 활용 
		Integer score = null;
		
		score = scores.first();
		log.info("가장 작은 점수 : " + score);
		
		score = scores.last();
		log.info("가장 큰 점수 : " + score + "\n");
		
		score = scores.lower(95); // 지정된 값(95)보다 작은 바로 아래의 하나의 값을 반환 ( < ) 
		log.info("95점 아래 점수 : " + score);
		
		score = scores.higher(95); // 지정된 값(95)보다 큰 바로 아래의 하나의 값을 반환 ( > )
		log.info("95점 위의 점수 : " + score);
		
		
		score = scores.floor(95); // 지정된 값(95)과 같고, 바로 아래 작은 하나의 값을 반환 ( <= )
		log.info("95점 아래 점수 : " + score);

		score = scores.ceiling(95); // 지정된 값(95)과 같거나, 바로 아래 큰 하나의 값을 반환 ( >= )
		log.info("95점 위의 점수 : " + score);
		
//		while(!scores.isEmpty()) {
//			score = scores.pollFirst(); // first() 메소드와 비슷하되, 노드까지 삭제해버림 
//			
//			log.info("(남은 객체 수 : " + scores.size() + ")");
//		}//while
		
		
		//------------------------------
		// 순회방법 -1. Classical For
		// TreeSet.size() 메소드로 반복횟수를 정해놓고 각 요소 값을 순회
//		for(int i=0; i<scores.size(); i++) {
//			log.info(">>" + scores.);
//		}
		
		
		
		
		//------------------------------
		// 순회방법 -2. Enhanced For
		// TreeSet을 순회하며 '오름차순'으로 정렬해 출력  
		for(int sc : scores) {
			log.info(sc);
		}//enhanced for
		
		
		
		//------------------------------
		// 순회방법 -3. forEach
		// forEach 람다식으로 

		//void accept(T t); 타겟타입의 시그니처 메소드 확인 후 람다식으로 구현 
		scores.forEach( s -> { log.info(s); } );
		scores.forEach(log::info);
		
		scores.clear(); 
		
	}//main

}//end class
