package generic_wildcard;

import java.util.Arrays;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class WildCardExample {

	//모든 사람(Person)을 대상으로 하는 교육과정의 내역 출력 
	public static void printCourse(Course<?> course) {
		log.info(course.getName() + " 수강생 : " + Arrays.toString(course.getStudents()));
	}//printCourse
	
	
	//학생을 대상으로 하는 교육과정의 내역 출력 
	public static void printCourseStudent(Course<? extends Student> course) {
		log.info(course.getName() + " 수강생 : " + Arrays.toString(course.getStudents()));
	}//printCourseStudent
	
	
	//근로자(Worker)타입이거나 하위 자식타입의 교육과정의 내역 출력
	public static void printCourseWorker(Course<? super Worker> course) { 		// super - 재직자(Worker)이거나 것보다 더 큰타입인 Person도 허용 
		log.info(course.getName() + " 수강생 : " + Arrays.toString(course.getStudents()));
	}//printCourseWorker
	
	
	
	public static void main(String[] args) {
		
		
		//--1. 일반인을 대상으로하는 교육과정을 생성 
		Course<Person> personCourse = new Course<>("일반인과정", 5);
			//이 일반인 대상 교육과정에 학생을 추가
			personCourse.add(new Person("일반인"));
			personCourse.add(new Worker("직장인"));
			personCourse.add(new Student("학생"));
			personCourse.add(new HighStudent("고등학생"));

		//--2. 재직자를 대상으로 하는교육과정을 생성, 이때 구체타입을 지
		Course<Worker> workerCourse = new Course<Worker>("직장인과정", 5);
			//이 재직자 대상 교육과정에 직장인을추가 
			workerCourse.add(new Worker("직장인"));
			
			//****이미 T타입이 Worker로 지정되어있어서 오류남****
//			workerCourse.add(new Student("학생"));	
//			workerCourse.add(new Person("일반인"));
//			workerCourse.add(new HighStudent("고등학생"));
		
		//--3. 일반학생을 대상으로 하는 교육과정을 생성, 이때구체타입 지정
		Course<Student> studentCourse = new Course<Student>("학생과정", 5);
			//이 학생 대상 교육과정에 학생을추가
			studentCourse.add(new Student("학생"));
			studentCourse.add(new Student("고등학생"));
			
		//--4. 고등학생을 대상으로 하는
		Course<HighStudent> highStudentCourse = new Course<HighStudent>("고등학생과정", 5);
			//이 고등학생 대상 교육과정에 학생을 추가
			highStudentCourse.add(new HighStudent("고등학생"));
			
		
		//---------------------------------------//	
		// 출력 
		//---------------------------------------//	
			
		printCourse(personCourse);
		printCourse(workerCourse);
		printCourse(studentCourse);
		printCourse(highStudentCourse);
		
		log.info("***********************************");
		//---------------------------------------//
		//구체타입이 와일드카드이지만 extends로 제약이되어있기 때문에 Student 외에는 오류 
//		printCourseStudent(personCourse);
//		printCourseStudent(workerCourse);
		printCourseStudent(studentCourse);
		printCourseStudent(highStudentCourse);
		
		log.info("***********************************");
		//---------------------------------------//

		// super - 재직자(Worker)이거나 것보다 더 큰타입인 Person도 허용 
		printCourseWorker(personCourse);
		printCourseWorker(workerCourse);

//		printCourseWorker(studentCourse);
//		printCourseWorker(highStudentCourse);
		
		//---------------------------------------//
		
	}//main

}//end class
