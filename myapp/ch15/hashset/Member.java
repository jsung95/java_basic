package hashset;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.extern.log4j.Log4j2;


@EqualsAndHashCode
@ToString
@AllArgsConstructor
@Log4j2
public class Member {
	public String name;
	public int age;
	
//	private int msn;
	
	
	
//	// 중복판단을 위한 1단계 알고리즘에 사용
//	@Override
//	public int hashCode() {
//		log.debug("hashCode() invoked.");
//		
//		// 회원의 이름의 해쉬값과 나이를 더한 값으로 회원간의 구분값으로 하자! 
//		return name.hashCode() + age;
//	}//hashCode
//	
//	
//	// 중복판단을 위한 2단계 알고리즘에 사용 
//	@Override
//	public boolean equals(Object obj) {
//		log.debug("equals(obj) invoked.");
//		
//		
//		//매개변수로 받은 객체가 같은 회원객체라면
//		if(obj instanceof Member) { // 회원객체라면 
//			Member member = (Member) obj; // 강제형변환(다형성-1) 
//			
//			//현재 회원과 매개변수로 넘어온 회원간의 비교 기준을,
//			//기존 회원의 이름과 나이, 비교 회원의 이름과 나이가 모두 같으면 같은 회원의 판단.
//			return member.name.equals(name) && (member.age == age);
//		} else {
//			return false;  //같은 회원객체가 
//		}//if-else
//	}//equals

	
	
}//end class
