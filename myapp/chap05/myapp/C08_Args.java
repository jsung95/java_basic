package myapp;

import java.util.Arrays;
import java.util.Iterator;

import lombok.extern.log4j.Log4j;


@Log4j
public class C08_Args {
	public static void main(String... args) {
		
		log.info(args);
		log.info(args.length);
		log.info(Arrays.toString(args));
		
		
		int sum = add(1,2,3,4,5,6,7,8,9,10);
		
		log.info("sum : " + sum);
		
	} //main
	
	// 받은 전달인자는 모두 더해서 반환해주는 매소드
	static int add(int temp, int... ops) {
		log.debug("add(ops) invoked.");
		
		log.info("\t temp : " + temp);
		log.info("\t ops : " + Arrays.toString(ops));
		int sum = 0;
		
		for(int i : ops) {
			sum += i;
		} //enhanced for
		
		return sum;
	}
	
} //end class
