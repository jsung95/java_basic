package generic_wildcard;

import lombok.AllArgsConstructor;
import lombok.ToString;


@ToString
@AllArgsConstructor
public class Person {
	
	private String name;

	public String getName() {
		return name;
	}//getName
	
}// end class
