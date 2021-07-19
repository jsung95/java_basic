package hashset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import lombok.extern.log4j.Log4j2;


@Log4j2
public class HashSetExample1 {

	// Set collection 특징 :
	//   1) 수학의 집합성질을 따른다:
	//		- 중복을 비허용
	//		- 순서를 보장하지 않는다
	
	public static void main(String[] args) {
		
		//--1. Set 객체 생성 
//		Set<String> set = new HashSet<>();
		Set<Member> set = new HashSet<>();
		
		//--2. 구술주머니에 구슬들을 넣자 
//		set.add("JAVA");	// add 할 때마다, 요소에 대해 2단계 알고리즘을 수행 
//		set.add("JDBC");
//		set.add("Servlet/JSP");
//		set.add("Java");
//		set.add("iBATIS");
		
		
		Member member1 = new Member("Yoseph", 23);
		Member member2 = new Member("Yoseph", 23);
		
		
		log.info("member1 >>> : " + member1);
		log.info("member2 >>> : " + member2);
		
		set.add(member1);
		set.add(member2);
		
		log.info(set);
		
		
		//--3. 구슬주머니의 크기 = 구슬이 몇개들어있느냐? 
		int size = set.size();
		log.info("총 객체 수 : " + size);
		
		
		//--4. 구슬주머니 전체를 순회
		//	   Set은 전체 구슬을 고유하게 순회하기 위해서,
		//	   소위 "반복자(iterator)" 객체를 제공하고,
		//	   이 반복자를 이용해서 순회하도록 되어있다.
		Iterator<Member> iterator = set.iterator();		//Iterator(반복자) 객체반환 
		
		
		//--5. 반복자의 hasNext()메소드로 우선 순회할 요소가 남아있는지 확인하고
		//		있다면(true이면), 반복자의 next() 메소드로 해당 구슬을 얻어낼 수가 있다.
		while(iterator.hasNext()) {
			Member element = iterator.next();
			log.info("\t" + element);
		}//while
				
		
		//--6. 구슬주머니에서 지정된 구슬을 제거 
//		set.remove("JDBC");
//		set.remove("iBATIS");
		
		
		//--7. 마지막으로 삭제 후, 다시한번 순회 
		log.info("총 객체 수 : " + set.size());
		
		
//		for(String element : set) {
//			log.info("\t" + element);
//		}//enhanced for
		
		
		//--8. 자원해제 
		//		구슬주머니를 용도에 맞게 다 사용하고나면, 
		//		"반드시" 구슬주머니를 깨끗이 비워줘야 함(대용량 메모리 누수 예방) 
		set.clear();
		if(set.isEmpty()) {
			log.info("비어 있음");
		}//if
		
		
	}//main

}//end class
