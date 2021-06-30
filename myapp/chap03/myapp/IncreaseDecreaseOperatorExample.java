package myapp;

import lombok.extern.log4j.Log4j;


@Log4j
public class IncreaseDecreaseOperatorExample {
	
	// (전위/후위) 증감연산자
	public static void main(String[] args) {
		int x = 10;
		int y = 10;
		int z;
		
		x++;
		++x;
		log.info("x = " + x);
		
		
		y--;
		--y;
		log.info("y = " + y);
		
		
		log.info("--------------------------");
		//후위
		z = x++;	// 이 식을 풀어쓰면
//		z = x;		// 먼저 대입한 후
//		x = x + 1;	// 후위연산을 수행
		
		log.info("z = " + z);
		log.info("x = " + x);
		
		

		log.info("---------------------------");
		//전위
		
		z = ++x;
//		x = x + 1;   // 먼저 전위연산으로 증가 시킨 후
//		z = x;	     // 대입을 수행 
		
		log.info("z = " + z);
		log.info("x = " + x);
		
		
		log.info("---------------------------");
		
		z = ( ++x ) + ( y++ );
		
		log.info("z = " + z);
		log.info("x = " + x);
		log.info("y = " + y);
		
		
		
		
	} // main
} // end class
