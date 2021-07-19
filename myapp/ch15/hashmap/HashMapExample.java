package hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.function.BiConsumer;

import lombok.extern.log4j.Log4j2;


@Log4j2
public class HashMapExample {

	//Map 컬렉션 특징  
	//	1) 하나의 요소를 넣을 때, [ 키 / 값 ] 쌍으로(pair) 넣는다.
	//				put(K, V) 메소드 사용
	//  2) 실제 저장되는 객체는 키/값 쌍의 객체를 보관하고 있는 Map.Entry타입의 객체로 저장
	
	public static void main(String[] args) {
		//--1. Map 컬렉션 생성
		// Map 요소의 키의 타입 -> String / 값의 타입 = Integer
		Map<String, Integer> map = new HashMap<>();

		//--2. 요소객체 저장 
		map.put("name1", 85);	// 실제로는 Map.Entry 객체로 저장 
		map.put("홍길동", 90);
		map.put("name3", 80);
		map.put("홍길동", 95);
		
		log.info("총 Entry 수 : " + map.size());
		log.info("- map : " + map);
		
		
		// void accept(T t, U u);  ---> 타겟타입의 시그니처 메소드
		// 람다식으로 만들어보자! 
		
		
		
		
		//--3. 객체 찾기
		log.info("\t@홍길동 : " + map.get("홍길동"));
		
		
		//--4. 객체 삭제 
		map.remove("홍길동");
		log.info("총 Entry수 : " + map.size());
		
		
		
		//----------------------------------------------
		
		// || Map 컬렉션의 순회 ||
		
		//--1st. method
		map.forEach( 
			(k, v) -> { 
				// 과연 이 람다식 안에서 Map 요소의 value를 변경시킬 수 있을까 ?
				v = v+1; //value의 값을 1 증가시켜본다면 ??
				
				//String format으로 값을 찍어보면 증가된 것 처럼보이지만
				//실제 Original 값은 변경되지 않음을 알 수 있다.
				String formatted = String.format("- name : %s, vlaue : %s", k, v);
				log.info(formatted);
			} // BiConsumer<K, V>의 람다식  
		);
		
		
		//--2st. method : 객체를 하나씩 처리
		Set<String> keySet = map.keySet();
		
		Iterator<String> keyIterator = keySet.iterator();
		
		while(keyIterator.hasNext()) {
			String key = keyIterator.next();
			Integer value = map.get(key);
			
			log.info("\t" + key + " : " + value);
		}//while
		
		
		//--3rd. method : 객체를 하나씩 처리
		Set< Map.Entry<String, Integer> > entrySet = map.entrySet();
		Iterator< Map.Entry<String, Integer> > entryIterator = entrySet.iterator();
		
		while(entryIterator.hasNext()) {
			Map.Entry entry = (Map.Entry) entryIterator.next();
			
			String key = (String) entry.getKey();
			Integer value = (Integer) entry.getValue();
			
			log.info("\t" + key + " : " + value);
		}//while
		
		//----------------------------------------------
		
		
		//객체 전체 삭제 (자원해제)
		Objects.requireNonNull(map);
		map.clear();
		
		log.info(" Entry 수 : " + map.size());
		
	}//main

}//end class
