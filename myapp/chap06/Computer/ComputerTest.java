package Computer;

import lombok.extern.log4j.Log4j;


@Log4j
public class ComputerTest {
	public static void main(String[] args) {
		Computer myCom = new Computer();
		
		int[] values1 = {1, 2, 3};
		int result1 = myCom.sum1(values1);
		log.info("result1 : " + result1);
		
		int result2 = myCom.sum1(new int[] {1, 2, 3, 4, 5});
		log.info("result2 : " + result2);
		
		int result3 = myCom.sum2(1, 2, 3);
		log.info("result3 : " + result3);
		
		int result4 = myCom.sum2(1, 2, 3, 4, 5);
		log.info("result4 : " + result4);
		
		
		
	}//main
	
}//end class
