package Predicate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;


@AllArgsConstructor
@ToString
public class Student {
	@Getter private String name;
	@Getter private String sex;
	@Getter int score;
	
}//end class
