package user_defined_exception;

import java.io.IOException;
import java.sql.SQLException;

import lombok.extern.log4j.Log4j2;


@Log4j2
public class AccountTest {
	public static void main(String[] args) throws SQLException {
		
		Account account = new Account();
		
		//예금하기
		account.deposit(10000);
		
		log.info("예금액 : " + account.getBalance());
		
		//출금하기
		try {
			//이 try block안의 실행문장에서 예외가 발생가능하다면 ...
			account.withdraw(30000);
		} catch(BalanceInsufficientException e) {
//			e.printStackTrace();				// 1) e.printStackTrace() 메소드 사용 
//			
//			String message = e.getMessage();	// 2) e.getMessage() 메소드 사용
//			log.info("ad" + message);
			
			
//			throw new IOException(e);
			
			IOException e2 = new IOException(e);			//첫 번째 Wrapping
			SQLException e3 = new SQLException(e2);			//두 번째 Wrapping
			
			throw e3;
			
			
		}//try-catch
		
		
	}//main
	
}//end class
