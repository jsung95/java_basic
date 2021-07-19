package treeset;

import java.util.NavigableSet;
import java.util.TreeSet;

import lombok.extern.log4j.Log4j2;


@Log4j2
public class TreeSetExample2 {
	
	//TreeSet의 이진트리를 역으로 순회해서, 내림차순으로 출력해보자 
	public static void main(String[] args) {
		//--1. TreeSet 객체 생성 
		TreeSet<Integer> scores = new TreeSet<>(); //타입추론 
		
		//--2. 새로운 요소 추가 ----> 이진트리가 확장 ---> 정렬된다! 
		scores.add(87);
		scores.add(98);
		scores.add(75);
		scores.add(95);
		scores.add(80);
		
		
		//--3. TreeSet.descendingSet() 메소드로, 내림차순으로 정렬된 Set객체를 반환 
		NavigableSet<Integer> descendingSet = scores.descendingSet();

		//--4.순회 (내림차순으로)
		for(int score : descendingSet) {
			log.info(score + " ");
		}//enhanced for
		
		
		log.info("================");
		
		//위에서 순회한 descendingSet을 한번 더 descendingSet 메소드를 사용해주면,
		//내림차순이 두번 수행되서 오름차순으로 바뀜
		//즉 descendingSet 메소드가 호출될때마다 차순이 바뀌게 된다.
		NavigableSet<Integer> ascendingSet = descendingSet.descendingSet();
		
		for(int score : ascendingSet) {
			log.info(score + " ");
		}//enhanced for
		
		
		ascendingSet.forEach(log::info);
		
	}//main

}//end class
