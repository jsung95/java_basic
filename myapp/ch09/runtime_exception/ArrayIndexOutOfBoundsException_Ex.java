package runtime_exception;

import lombok.extern.log4j.Log4j;


@Log4j
public class ArrayIndexOutOfBoundsException_Ex {
	public static void main(String[] args) {
		
		if(args.length == 2) {
			String data1 = args[0];
			String data2 = args[1];
			String data3 = args[2];
			
			log.info("args[0] : " + data1);
			log.info("data[1] : " + data2);
			log.info("data[2] : " + data3);
		}
		else {
			log.info("[실행방법]");
			
			System.out.print("java ArrayIndexOutOfBoundsExceptionExample ");
			System.out.print("값1  값2");
		}//if-else
		
	}//main
}//end class
