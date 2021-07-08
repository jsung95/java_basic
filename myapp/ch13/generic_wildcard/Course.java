package generic_wildcard;

public class Course<T> {
	private String name;
	private T[] students;
	
	public Course(String name, int capacity) {
		this.name = name;
		
		//타입파라미터 타입의 배열은, 직접 new연산자로 생성불가 
		// 1) Object[] 타입의 배열을 먼저 생성
		// 2) (T[]) 강제 형변환하여 초기화 수행해야 함
		
//		students = new T[3]; // error!!
		students = (T[])(new Object[capacity]);
	}//constructor
	
	public String getName() {
		return name; 
	}//getName
	
	public T[] getStudents() {
		return students;
	}//getStudents
	
	public void add(T t) {
		for(int i=0; i<students.length; i++) {
			
			if(students[i] == null) {
				students[i] = t;
				break;
			}//if
			
		}//for
		
	}//add
	
	
}//end class
