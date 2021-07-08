package field;

import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Log4j2
@NoArgsConstructor
public class UsingThis {
	public int outterField = 10;
	
//	@Log4j2		//바깥쪽클래스에서 이름충돌이 생기기 때문에 바깥쪽에서만 사용 해주면 된다. 
	@NoArgsConstructor
	class Inner{
		int innerField = 20;
		
		void method() {
			//람다식
			MyFunctionalInterface fi = () -> {
				
				log.debug("lambda invoked");
				
				//람다식이 만들어내는 "익명구현객체"의 주소를 가리키지 못한다!!
				log.info("\t+ this: " + this); //람다식 코드가 드렁있는 클래스의 인스턴스(객체)를 가리킨다.
				log.info("\t+ this: " + UsingThis.this);
				
				
//				1.안쪽 Inner타입의 객체의 필드를 접근 
				log.info("innerField: " + this.innerField + "\n");
				
				//2. 바깥쪽 UsingThis 타입의 객체의 필드를 접근 
				log.info("OutterField: " + UsingThis.this.outterField + "\n");
				
				
			}; // 람다식을 통한, 타겟타입의 추상메소드에 대한 익명구현객체 생성 
			
			fi.method();	//오버라이딩 된 추상 메소드 호출(다형성-2) 
			
		}//method
		
	}//end Inner class
	
}//end Outer class
