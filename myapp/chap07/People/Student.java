package People;

import lombok.extern.log4j.Log4j;


@Log4j
public class Student extends People{
	public int studentNo;
	
	
	public Student() {
		super(null, null);
	}//default constructor
	
	
	//부모없는 자식은 없다 
	//자식객체가 생성되기전에, 부모객체가 우선 생성된다! 
	//때문에, 자식 클래스의 생성자 블록에서, 가장 첫줄에 부모클래스의 생정자를 호출하도록 해서,
	// 부모객체의 필드가 우선 초기화 되도록 해야 함.
	public Student(String name, String ssn, int studentNo) {
//		log.debug("Student(name, ssn, studentNo) constructor invoked.");
		super(name, ssn); //부모 객체의 생성자 호출(-> 부모필드의 초기화 수행)
		
		this.studentNo = studentNo; //자식객체의 필드 초기화 수행 
	}//constructor
	
}//end class
