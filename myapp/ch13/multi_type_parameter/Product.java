package multi_type_parameter;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@ToString
@Getter
@Setter
@NoArgsConstructor
public class Product <T, M> {
	private T kind;
	private M model;
	
	
	
	
}
