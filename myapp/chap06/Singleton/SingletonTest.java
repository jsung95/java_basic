package Singleton;

import lombok.extern.log4j.Log4j;


@Log4j
public class SingletonTest {
	//Singleton 객체 테스트 
	public static void main(String[] args) {
		
		// 싱글톤 객체의 레퍼런스를 얻자 
		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();
		
		// 동등비교 연산자를 참조변수에 대해 수행할 때에는, 두 참조변수(그릇)에 있는주소가 같은가를 물어보는 것이다
		if(obj1 == obj2) {
			log.info("같은 Singleton 객체 입니다.");
		}
		else {
			log.info("다른 Singleton 객체 입니다.");
		}
		
		
		for(int i=1; i<=10; i++) {
			Singleton obj = Singleton.getInstance();
			log.info(String.format("[%d] obj : [%s]", i, obj));
		}
		
	}
}
