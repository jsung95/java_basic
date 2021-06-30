package myapp;

import java.util.Scanner;
import lombok.extern.log4j.Log4j;

@Log4j
public class aa {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int price;	
		int pay;	

		do {	
			log.info("물건 값 : ");
			price = stdIn.nextInt();
		} while(price <= 0);
		
		do {
			log.info("지급 현금 : ");
			pay = stdIn.nextInt();
		} while(pay < price);	
		
		int change = pay - price;
		
		int[] coin = {500, 100, 50, 10};
		
		log.info("거스름돈 : " + change + "원");
		for(int i = 0; i < coin.length; i++) {
			log.info(coin[i] + "원의 갯수 : " + (change/coin[i]));
			change %= coin[i];
		}
		stdIn.close();
		
	}
	
}
