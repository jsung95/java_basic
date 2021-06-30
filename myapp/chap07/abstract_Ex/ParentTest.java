package abstract_Ex;

import lombok.extern.log4j.Log4j;


@Log4j
public class ParentTest {
	public static void main(String[] args) {
		
		
//		Parent p = new Parent("Trinity", 23) {
//			;;
//		}; //익명자식객체 생성 
		
		Parent p = new Parent() {
			
			public double money = 2340.0;
		
			public void method() {
				System.out.println(money);
			}//method 

			
			@Override
			public String getName() {
				System.out.println(money);
				
				return Double.toString(money);
			}
			
		}; //익명자식객체 생성 
		
		System.out.println(p.age);
		System.out.println(p.name);
		System.out.println(p.getName());
		
//		System.out.println(p.money);
//		System.out.println(p.method());
		System.out.println(p.getName());
		
		System.out.println("----------------------");
		
		//Closure - 이미 생명주기가 끝난 변수를 계속 참조하는 상황을 일컫는다  
		Parent parent = tempMethod();
		parent.getName();
		parent.getName();
		parent.getName();
		
		
	}//main
	
	static Parent tempMethod() {
		//Closure (클로저) 현상이 발생한다 .
		int temp = 10;
		
		Parent p = new Parent() {
			@Override
			public String getName() {
				System.out.println(temp);
				
				return this.name;
			}//getName
			
		}; //익명자식객체 생성
		
		return p;
	}//tempMethod
	
}//end class
