package hashmap;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;


@EqualsAndHashCode
@AllArgsConstructor
public class Student {
	public int sno;
	public String name;
	
	

// 중복값을 걸러내기위한 알고리즘 
// lombok의 @EqualsAndHashCode 어노테이션을 이용하면 아래 알고리즘을 적용할 필요가 없다.
	
//	@Override
//	public int hashCode() {		// 1단계 중복알고리즘에서 호출 
//		return sno + name.hashCode();
//	}//hahsCode
//	
//	
//	
//	@Override
//	public boolean equals(Object obj) {		// 2단계 중복알고리즘에서 호출 
//		if(obj instanceof Student) {
//			Student student = (Student) obj;
//			return (sno == student.sno) && (name.equals(student.name));
//		} else {
//			return false;
//		} //if-else
//	}//equals
	
	
	
}//end class
