package try_catch;

import lombok.extern.log4j.Log4j2;


@Log4j2
public class TryCatchFinally {
	public static void main(String[] args) {
		log.debug("main(args) invoked.");
		
		try { //예외가 발생할만한 소지가 있는 실행문장(즉, 비지니스 로직)들을 넣는 블록
			Class clazz = Class.forName("java.lang.String2");
			log.info("- clazz : " + clazz);
		
		
		//실제 발생한 특정 예외를 "잡아서" 처리하는 블록	
		} catch(ClassNotFoundException | NullPointerException e) { // 멀티 catch - ' | ' 기호로 묶어서 catch 
																	// 동일한(공통된) 예외처리를 해야 한다면 멀티캐치
			
			//예외처리상 오류 메시지를 출력하니까, log.error(message)로 출력 
			log.error("클래스가 존재하지 않습니다. ");
			
			
			//발생한 예외객체의 메소드를 호출하여, 로그로 스택트레이스(Stack Trace)가 남도록 해줘야 함.
			e.printStackTrace();
			
			log.info("- e : " + e);
			
//		} catch(NullPointerException e) { // 다중 catch
											// 예외를 각기 다르게 처리해야한다면 다중캐치 
//			e.printStackTrace();
//			
//			log.info("- e : " + e);
			
		} catch(Exception e) {	// Exception - 위의 2가지 예외를 제외한, 그 나머지 모든 발생가능한 예외 처리
			e.printStackTrace();
			
			;;
			
		} finally { // JVM이 수행을 보장하는 블
			// try block에서 사용된 자원객체를 해제...
			
		}//try-finally
		
		
	}//main
	
}//end class
