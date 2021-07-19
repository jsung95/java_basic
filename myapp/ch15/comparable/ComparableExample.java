package comparable;

import java.util.Iterator;
import java.util.TreeSet;

import lombok.extern.log4j.Log4j2;


@Log4j2
public class ComparableExample {
	//개발자가 정의한 Person타입의 객체를 TreeSet의 요소로 넣어, 자동정렬/중복제거 사용할 수 있느냐 !?
	public static void main(String[] args) {
		
		//--1. TreeSet객체 생
		TreeSet<Person> treeSet = new TreeSet<>();

		//--2. Person 객체를 요소로 추가
		treeSet.add(new Person("홍길동", 45));
		treeSet.add(new Person("김자바", 25));
		treeSet.add(new Person("박지원", 31));
		
		log.info(treeSet); //lombok의 @ToString 어노테이션으로 값을 찍어볼 수 있다.
		
		Iterator<Person> iterator = treeSet.iterator();
		while(iterator.hasNext()) {
			Person person = iterator.next();
			log.info(person.name + " : " + person.age);
		}//while
		
	}//main

}//end class
