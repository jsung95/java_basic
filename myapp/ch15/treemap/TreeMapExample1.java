package treemap;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

import lombok.extern.log4j.Log4j2;


@Log4j2
public class TreeMapExample1 {
	
	// TreeMap 을 이용한 자동정렬 (순서자체가 없다)
	public static void main(String[] args) {
		
		//--1. TreeMap<Key, Value> 객체 생성 
		TreeMap<Integer, String> scores = new TreeMap<>();
		
		//--2. 새로운 요소를 추가(Key/Value쌍으로 넣어도, 실제 저장되는 요소의 타입은 Map.Entry 객체임)
		scores.put(87, "홍길동");
		scores.put(98, "이동수");
		scores.put(75, "박길순");
		scores.put(95, "신용권");
		scores.put(80, "김자바");

		//--3. 이진트리를 탐색하는 다양한 메소드 
		Map.Entry<Integer, String> entry = null;
		
		//키값이 가장 낮은 요소 획득 
		entry = scores.firstEntry();
		log.info("가장 낮은 점수 : " + entry.getKey() + " - " + entry.getValue());
		
		//키값이 가장 높은 요소 획득 
		entry = scores.lastEntry();
		log.info("가장 높은 점수 : " + entry.getKey() + " - " + entry.getValue() + "\n");
		
		//
		entry = scores.lowerEntry(95);
		log.info("95점 아래 점수 : " + entry.getKey() + " - " + entry.getValue());
		
		//
		entry = scores.higherEntry(95);
		log.info("95점 위의 점수 : " + entry.getKey() + " - " + entry.getValue() + "\n");
		
		//
		entry = scores.floorEntry(95);
		log.info("95점 이거나 바로 아래 점수 : " + entry.getKey() + " - " + entry.getValue());
		
		//
		entry = scores.ceilingEntry(85);
		log.info("85점 이거나 바로 위의 점수 : " + entry.getKey() + " - " + entry.getValue() + "\n");
		
		
//		while(!scores.isEmpty()) {
//			//가장 작은 키값요소를 반환/삭제 
//			entry = scores.pollFirstEntry();
//			
//			log.info(entry.getKey() + " - " + entry.getValue() + "(남은 객체 수 : " + scores.size() + ")");
//		}//while
		
		
		//----------------------
		//순회 방법 1. Classical For
		// ---> Key를 모르기 때문에 get메소드를 통해서 value 값을 가져오기 힘들다. 
		
		

		
		//순회 방법 2. Enhanced For 
		// ---> Map 객체는 Iterable 하지 않기 때문에 enhanced for 사용 불가 
		// ---> 따라서 Set 객체를 통해 keySet, entrySet으로 순회 
		Set<Integer> keySet = scores.keySet();
		for(int key : keySet) {
			String val = scores.get(key);
			log.info(key + " #- " + val);
		}//enhanced for
		
		Set<Entry<Integer, String>> entrySet = scores.entrySet();
		for(Entry<Integer, String> element : entrySet) {
			int key = element.getKey();
			String val = element.getValue();
			
			log.info(key + " !- " + val);
		}//enhanced for
		
		
		//순회 방법 3. forEach
		// void accept(T t, U u); 타겟타입의 시그니처 메소드 확인 
		scores.forEach( (k, v) -> { log.info(k + " @ - " + v);} );
		
		
	}//main

}//end class
