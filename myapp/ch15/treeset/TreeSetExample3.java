package treeset;

import java.util.NavigableSet;
import java.util.TreeSet;

import lombok.extern.log4j.Log4j2;


@Log4j2
public class TreeSetExample3 {

	// TreeSet의 요소로 문자열(String)을 사용해보자
	// 단, 정렬은 사전순으로 자동정렬(기본 : 오름차순)
	public static void main(String[] args) {
		//--1. TreeSet<String> 객체 생성 
		TreeSet<String> treeset = new TreeSet<>();
		
		//--2. 새로운 요소추가 --> 이진트리가 형성 --> 자동 정렬 !
		treeset.add("apple");
		treeset.add("forever");
		treeset.add("description");
		treeset.add("ever");
		treeset.add("zoo");
		treeset.add("base");
		treeset.add("guess");
		treeset.add("cherry");

		//--3. 범위검색 메소드의 활용(TreeSet.subSet() 메소드)
		log.info("[c~f 사이의 단어 검색]");
		NavigableSet<String> rangeSet = 
				// 요소 값을 완전하게 지정해줘야한다. -> "c", true, "f", true 는 값이 제대로 출력이 안됨 
				treeset.subSet("cherry", true, "forever", true);
		
		for(String word : rangeSet) {
			log.info(word);
		}//enhanced for
		
		rangeSet.forEach(log::info); //메소드 참조 
		
	}//main

}//end class
