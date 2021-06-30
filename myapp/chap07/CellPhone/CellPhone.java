package CellPhone;

import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j;


@NoArgsConstructor
@Log4j
public class CellPhone {
	//--1. 필드
	String model;
	String color;
	
	
	//--2. 생성자 
	
	//--3. 메소드
	void powerOn() {
		log.info("powerOn invoked.");
		log.info("\t+ this : " + this);
	}//powerOn
	
	void powerOff() {
		log.info("powerOff() invoked.");
	}//powerOff
	
	void bell() {
		log.info("ring bell");
	}//bell
	
	void sendVoice(String message) {
		log.info("sednVoice(" + message + ") invoked.");
	}//sendVoice
	
	void receiveVoice(String message) {
		log.info("receiveVoice(" + message + ") invoked.");
	}
	
	void hangUp() {
		log.info("hangUp() invoked.");
	}//hangUp
	
}//end class
