package myapp;

import lombok.extern.log4j.Log4j;


@Log4j
public class C01_ReferenceTypeExample {
	public static void main(String[] args) {
		String strVar1 = "신민철"; //참조타입 변수1
		String strVar2 = "신민철"; //참조타입 변수2
		
		
		
		//각 객체의 식별자를 반환해주는 매소드
				// ---> Object.hashCode(); 메소드
		int strVar1OID = strVar1.hashCode();
		int strVar2OID = strVar2.hashCode();
		
		// int 정수 --> 16진수로 진법변환
		String strVar1OIDHex = Integer.toHexString(strVar1OID);
		String strVar2OIDHex = Integer.toHexString(strVar2OID);
		
		log.info(strVar1OID); 		//10진수
		log.info(strVar1OIDHex);	//16진수
		
		log.info(strVar2OID);
		log.info(strVar2OIDHex);
		
		
		log.info("====================================");
		
		//각 객체의 타입명(FQCN)을 얻어보자
		String strVar1FQCN = strVar1.getClass().getName();
		String strVar2FQCN = strVar2.getClass().getName();
		log.info("strVar1FQCN : " + strVar1FQCN);
		log.info("strVar2FQCN : " + strVar2FQCN);
		
	
		log.info("====================================");
		
		// 두 String 타입의 참조변수 안에 들어있는 문자열 리터럴 객체의 레퍼런스를
		// 만들어서 출력
		String strVar1Ref = strVar1FQCN + "@" + strVar1OIDHex;
		String strVar2Ref = strVar2FQCN + "@" + strVar2OIDHex;
		
		log.info(strVar1Ref);
		log.info(strVar2Ref);
		
		
		log.info("====================================");
		
		
		
		
		
		
		
		
		
		
		//동등비교연산자 적용하여, 조건식 생성
		//참조타입변수에 적용하는 동등비교연산자(==, !=)는 피연산자의 주소가 같은지를 물어보는 것임
		if(strVar1 == strVar2) {
			log.info("1과 2는 참조가 같음");
		}
		else {
			log.info("1과 2는 참조가 다르다");
		}
		
		if(strVar1.equals(strVar2)) {
			log.info("1과 2는 문자열이 같음");
		}
		else {
			log.info("1과 2는 문자열이 다름");
		}
		
		
		
	}
}
