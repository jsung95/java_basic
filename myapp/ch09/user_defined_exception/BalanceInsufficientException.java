package user_defined_exception;

//User-defined exception class
//비지니스 로직상, 발생가능한 예외를 정의
public class BalanceInsufficientException extends Exception{
	
	//Constructor Overloading
	
	
	//아래 생성자는, 예외 메시지 없이 단순히 예외객체만 만들 때 사용.
	public BalanceInsufficientException() {	
		;;
	}//default constructor
	
	
	//아래의 생성자는, 예외메시지까지 생성할 수 있는 생성자.
	public BalanceInsufficientException(String message) {
		super(message);
	}//constructor
	
	
}//end class
