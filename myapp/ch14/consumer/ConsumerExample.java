package consumer;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.ObjIntConsumer;

import lombok.extern.log4j.Log4j2;


@Log4j2
public class ConsumerExample {
	
	//java.util.function 패키지에 있는, functional interface를 사용하기로 했다면
	//무조건 람다식으로 구현할것을 생각하라 
	public static void main(String[] args) {
		
		//객체 T를 받아 소비 
		Consumer<String> consumer = t -> log.info(t + "8");
		consumer.accept("java");
		
		//-------------------------

		//객체 T와 U를 받아 소비 
		BiConsumer<String, String> bigConsumer = (t, u) -> log.info(t + u);
		bigConsumer.accept("java", "8");

		//-------------------------
		
		//double 값을 받아 소비 
		DoubleConsumer doubleConsumer = d -> log.info("java" + d);
		doubleConsumer.accept(8.0);
		
		//-------------------------
		
		//객체 T와 int 값을 받아 소비 
		ObjIntConsumer<String> objIntConsumer = (t, i) -> log.info(t + i);
		objIntConsumer.accept("JAVA", 8);
		
		
	}//main
	
}//end class
