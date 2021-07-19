package hashtable;

import java.io.IOException;
import java.util.Hashtable;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;

import lombok.extern.log4j.Log4j2;


@Log4j2
public class HashtableExample {

	public static void main(String[] args) throws IOException {
		Map<String, String> map = new Hashtable<>();
		
		//Map 컬렉션에 요소 추가 ( 키 / 값 쌍으로)
		map.put("spring", "12");
		map.put("sumer", "123");
		map.put("fall", "1234");
		map.put("winter", "12345");
		
		//콘솔로부터, 사용자 입력을 받기 위한 스캐너 객체 생성.
		try {
			
		
			Scanner sc = new Scanner(System.in);
			try(sc;){
				while(true) {
					log.info("아이디와 비밀번호를 입력해주세요 ");
					System.out.print("아이디 : ");
					String id = sc.nextLine();
					
					System.out.print("비밀번호 : ");
					String password = sc.nextLine();
					
					log.info("-------------------------------");
					
					if(map.containsKey(id)) {
				 		if(map.get(id).equals(password)) { //정상로그인 성공이면,무한루프를 빠져나온다.
							log.info("로그인 성공 ");
							break;
						} else {
							log.info("비밀번호가 일치하지 않습니다.");
						} //if-else 
					} else {
						log.info("입력하신 아이디가 존재하지 않습니다.");
					} //if-else
					
				}//while
				Objects.requireNonNull(sc);
				sc.close();
			}//try-with-resources 
		} catch (Exception e) {
			throw new IOException(e);
		}//try-catch
		

	}//main

}//end class
