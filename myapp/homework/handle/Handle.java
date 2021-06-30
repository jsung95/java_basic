package handle;

import java.util.Scanner;

import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j;


@Log4j
@NoArgsConstructor
public class Handle{	//POJO / direction 열거타입으로 수정
	
	String direction;
	
	public Handle(String direction) {
		this.direction = direction;
	} //handle(direction)
	
	public void changeDir() {
		log.debug("changeDir() invoked.");
		
		log.info("방향을 선택하세요 (오른쪽, 왼쪽, 직진) : ");
		Scanner sc = new Scanner(System.in);
		direction = sc.next();
		log.info(this.direction + " 방향으로 핸들 조작.");
	}//printWay
	
	public void breakDown() {
		log.debug("breakDown() invoked.");
		
		log.info("***앗, 핸들이 고장났다! ***");
		log.info("핸들 교체 필요!!");
		
	}//breakDown

}//end class
