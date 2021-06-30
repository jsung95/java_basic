package user_defined_exception;

import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Log4j2
@NoArgsConstructor
public class Account {
	private long balance;
	
	public long getBalance() {	//Getter Method
		log.debug("getBalance() invoked.");
		
		return balance;
	}
	
	public void deposit(int money) {	//예금 
		log.debug("deposit(money) invoked.");
		
		balance += money;
	}
	
	public void withdraw(int money) 	//출금
		throws BalanceInsufficientException, NullPointerException {
		
		log.debug("withdraw(money) invoked.");
		
		if(balance < money) {
			//지정한 금액을 계좌에서 출금시, 잔고가 부족하면....
			throw new BalanceInsufficientException("잔고부족 : " + (money - balance) + " 모자랍니다.");
		}//if
		
		balance -= money;
		
	}//withdraw
	
	
}//end class 
