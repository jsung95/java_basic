package runtime_exception;

import lombok.extern.log4j.Log4j;


@Log4j
public class NullPointerException_Ex {
	public static void main(String[] args) {
		String data = null;
		
		//참조변수에 null이 들어있음에도 불구하고, 객체의 필드와 메소드를 사용하고자 할 때 발생.
		log.info(data.toString());
	}//main
	
}//end class
