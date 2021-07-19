package comparable;

import lombok.AllArgsConstructor;
import lombok.ToString;
import lombok.extern.log4j.Log4j2;


@ToString
@Log4j2
@AllArgsConstructor
public class Person 
	implements Comparable<Person>{
	
	//field
	public String name;
	public int age;
	
	
	@Override
	public int compareTo(Person person) {
		log.debug("compareTo(person) invoked.");
		
		//현재 이 객체와 매개변수로 전달된 동일타입의 두 객체간에 대소를 비교하고,
		//그 결과를 반환해주는 로직을 만들어 넣어야 된다!
		
		//두 객체의 대소를 비교할 때, 아래와 같이 반환해야 함!
		//왼쪽객체(this=기준객체) >, ==, < 오른쪽객체(매개변수 객체=비교대상 객체) 
			// 1) if (오른쪽이 큰 경우) --> return -음수
			// 2) if (같으면) --> return 0
			// 3) if (왼쪽이 큰 경우) --> return +양수
		if(this.age < person.age) {
			return -1;
		} else if (this.age == person.age) {
			return 0;
		} else {
			return 1;
		} //if-else		
	}//compareTo
	
	
}//end class
