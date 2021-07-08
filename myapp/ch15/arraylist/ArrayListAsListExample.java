package arraylist;

import java.util.Arrays;
import java.util.List;

import lombok.extern.log4j.Log4j2;


@Log4j2
public class ArrayListAsListExample {

	public static void main(String[] args) {
		//--1. ArrayList 객체 생성 by using Arrays helper class 메소드 이용 
		List<String> list1 = Arrays.<String>asList("홍길동", "신용권", "김자바");
		
		
		//--2. enhanced for문을 이용한 순회로 리스트의 모든 요소를 출력 
		for(String name : list1) {
			log.info(name);
		}//enhanced for
		
		
		//--3. enhanced for을 이용한 순회로 리스트의 모든 요소를 출력 
		List<Integer> list2 = Arrays.<Integer>asList(1, 2, 3);
		for(int value : list2) {
			log.info(value);
		}//enhanced for
		
		
	}//main

}//end class
