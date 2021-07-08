package arraylist;

import java.util.ArrayList;
import java.util.List;

import lombok.extern.log4j.Log4j2;


@Log4j2
public class ArrayListExample2 {

	// *중요 : List<T> 인터페이스의 성질 :
	//			1) 순서를 보장
	//			2) 중복을 허용 
	public static void main(String[] args) {
		//ArrayList 객체를 생성
		List<String> list = new ArrayList<>(); // 컴파일러의 타입추론, 다형성-1 
		
		//ArrayList에 구슬(객체)들을 추가 , 즉, 문자열 객체를 효율적으로 처리하는 과정 
		list.add("STRING_1");
		list.add("STRING_2");
		list.add("STRING_3");
		list.add("STRING_4"); 
		list.add("STRING_5");
		
		//------------------------------------
		// 리스트의 전체요소를 순회(traverse)하는 방법 
		//------------------------------------
		
		//1. 직접 for문과 리스트의 크기를 이용하여 순회 
		for(int i=0; i<list.size(); i++) {	// 전체 리스트의 요소 순회 
			String str = list.get(i);		// 해당 인덱스 번호의 구슬(객체) 얻기 
			log.info(i + " : " + str);
		}// classical for
		log.info("=========================");
		
		
		//------------------------------------
		
		
		///2. enhanced for문을 이용하는 방법 (단, 인덱스 번호가 필요없을 때 )
		for(String s : list) {
			log.info(s);
		}//enhanced for 
		log.info("=========================");
		
		
		//------------------------------------
		
		
		// 3. List.forEach() 최종처리메소드를 이용한 순회 (단, 인덱스 번호가 필요없을 때)
		//void accept(T t);    T -> String    //타겟타입의 시그니처 메소드 확인 
		list.forEach( t -> log.info(t) );		// 람다식으로 구현 해서 요소 출력 
		list.forEach(log::info);				// 메소드참조를 이용하여 요소 순회 
		
		
		//------------------------------------		
		
	}//main

}//end class
