package vector;

import java.util.List;
import java.util.Vector;

import lombok.extern.log4j.Log4j2;


@Log4j2
public class VectorExample {

	// [Vector] --> 1. 순서를 보장 / 2. 중복을 허용 
    //			--> List의 성질을 잊지말자! 
	
	// ArrayList와 Vector는 요소를 중간에서 넣고/빼고하게되면, 밀고/땡기는 현상이 발생한다.(주의) 
	
	// Vector의 내부구현은, 99% ArrayList와 동일하다
	// 단지, 멀티쓰레드 환경에서, 요소객체에 대한 조작을 안전하게 할 수 있도록 추가구현 
	// 그래서 실무에서는, Thread-safe한 Vector객체를 더 많이 사용한다. 
	public static void main(String[] args) {
		//--1. Thread-safe한 ArrayList 객체 생성 
		List<Board> list = new Vector<Board>();		// 타입추론 
		
		//--2. Board객체를 생성해서, 리스트의 요소로 추가(Append)
		list.add(new Board("제목1", "내용1", "글쓴이1"));
		list.add(new Board("제목2", "내용2", "글쓴이2"));
		list.add(new Board("제목3", "내용3", "글쓴이3"));
		list.add(new Board("제목4", "내용4", "글쓴이4"));
		list.add(new Board("제목5", "내용5", "글쓴이5"));

		
		//--3. 인덱스 번호를 이용해서, 삭제를 수행 
		list.remove(2);
		list.remove(3);
		
		//--4. 리스트를 순회하면서, 전체요소를 출력 
		for(int i=0; i<list.size(); i++) {
			Board board = list.get(i);
			log.info(board.suject + "\t" + board.content + "\t" + board.writter);
		}//classical for
		log.info("=======================================");
		
		for(Board str : list) {
			log.info(str);
		}//enhanced for
		log.info("=======================================");
		
		//void accept(T t);    T -> String    //타겟타입의 시그니처 메소드 확인 
		list.forEach( t -> log.info(t));
		log.info("=======================================");
		list.forEach(log::info);
		log.info("=======================================");
		
	}//main

}//end class
