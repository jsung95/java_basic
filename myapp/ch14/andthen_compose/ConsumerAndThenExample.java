package andthen_compose;

import java.util.function.Consumer;

import lombok.extern.log4j.Log4j2;


@Log4j2
public class ConsumerAndThenExample {

	public static void main(String[] args) {
		//데이터 소비자를 람다식으로 익명구현객체 생성.
		Consumer<Member> consumerA = (m) -> {		//void accept(T t); 
			log.info("consumerA : " + m.getName() );
		}; 
		
		// 데이터 소비자를 람다식으로 익명구현객체 생성
		Consumer<Member> consumerB = (m) -> {		//void accept(T t);
			log.info("consumerB : " + m.getId());
		};
		
		
		//-----------------------------------------------------//
		// 위의 2개의 데이터 소비 로직을 하나의 파이프라인(Pipeline)으로 구성 
		//-----------------------------------------------------//
		Consumer<Member> pipline = consumerA.andThen(consumerB);
		pipline.accept(new Member("홍길동", "hong", null));
		
	}//main

}//end class
