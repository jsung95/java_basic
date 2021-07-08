package arraylist;

import java.util.ArrayList;
import java.util.List;

import lombok.extern.log4j.Log4j2;


@Log4j2
public class ArrayListExample {

	// *중요 : List<T> 인터페이스의 성질 :
	//			1) 순서를 보장
	//			2) 중복을 허용 
	public static void main(String[] args) {
		//ArrayList 객체를 생성
		List<String> list = new ArrayList<>(); // 컴파일러의 타입추론, 다형성-1 
		
		//ArrayList에 구슬(객체)들을 추가 , 즉, 문자열 객체를 효율적으로 처리하는 과정 
		list.add("JAVA");
		list.add("JDBC");
		list.add("Servlet/JSP");
		list.add(2, "Database");		//인덱스 번호 2번 자리에 문자열을 추가 
		list.add("iBATIS");
		
		//------------------------------------
		
		int size = list.size();
		log.info("총 객체 수 : " + size);
		log.info("=========================");
		
		//------------------------------------
		
		String skill = list.get(2);  //인덱스 번호 2번에 있는 객체를 얻기 
		log.info("2 : " + skill);
		log.info("=========================");
		
		//------------------------------------
		
//		for(int i=0; i<list.size(); i++) {	// 전체 리스트의 요소 순회 
//			String str = list.get(i);		// 해당 인덱스 번호의 구슬(객체) 얻기 
//			log.info(i + " : " + str);
//		}//for
//		log.info("=========================");
		
//		list.forEach(log::info);	// 메소드 참조를 이용하여 요소를 순회
		
		//void accept(T t);    T -> String    //타겟타입의 시그니처 메소드 확인 
		list.forEach( t -> log.info(t) );		// 람다식으로 구현 
		
		//------------------------------------
		
		list.remove(2);	//지정된 인덱스 번호의 객체 삭제 
		list.remove(2); //지정된 인덱스 번호의 객체 삭제 
		list.remove("iBATIS"); //지정된 객체와 동일한 요소를 찾아서 삭제 
		
		for(int i=0; i<list.size(); i++) {
			String str = list.get(i);
			log.info(i + " : " + str);
		}//for

		//------------------------------------		
		
	}//main

}//end class
