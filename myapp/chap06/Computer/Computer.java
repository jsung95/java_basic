package Computer;

import lombok.NoArgsConstructor;


//@ToString			//필드가 없기 때문에, 적용하는 의미가 없음. 
@NoArgsConstructor
public class Computer {
	
	int sum1(int[] values) {
		int sum = 0;
		
		for(int i=0; i<values.length; i++) {
			sum+= values[i];
		}//for
		
		return sum;
	}//sum1
	
	int sum2(int ... values) {
		int sum =0;
		
		for(int i=0; i<values.length; i++) {
			sum+= values[i];
		}//for
		
		return sum;
	}//sum2
	
	
} //end class
