package Predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

import lombok.extern.log4j.Log4j2;


@Log4j2
public class PredicateExample {

	
	private static List<Student> list = Arrays.asList(
				new Student("홍길동1", "남자", 90),
				new Student("홍길동2", "여자", 90),
				new Student("홍길동3", "남자", 95),
				new Student("홍길동4", "여자", 92)
			); //ArrayList객체를 만들어 대입 
	
	
	//리스트에 있는 모든 학생들의 평균점수를 구해서 반환 
	private static double avg(Predicate<Student> predicate) {
		int count = 0;
		int sum =0;
				
		//리스트의 모든 요소 순회(traverse)
		for(Student student : list) {
			//조건 검사(test)
			if(predicate.test(student)) {	// if ture 라면 ...
				count++;
				sum += student.getScore();
			}//if
		}//enhanced for
		
		return (double) sum / count;	//산술평균구해서 반환 
	}//avg
			
	
	
	public static void main(String[] args) {
		double maleAvg = avg( t -> t.getSex().equals("남자"));
		log.info("남자 평균 점수 : " + maleAvg);
		
		
		//-----------------------------------
		
		
		double femaleAvg = avg( t -> t.getSex().equals("여자"));
		log.info("여자 평균 점수 : " + femaleAvg);
		
		
	}//main

}//end class
