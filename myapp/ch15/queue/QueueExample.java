package queue;

import java.util.LinkedList;
import java.util.Queue;

import lombok.extern.log4j.Log4j2;


@Log4j2
public class QueueExample {

	// Queue 자료구조를 이용해보자!! 구현클래스 --> LinkedList
	public static void main(String[] args) {
		//--1. 요소의 타입을 구체타입으로 지정해서, Queue 인터페이스의 구현 객체를 생성
		Queue<Message> messageQueue = new LinkedList<>();
		
		//--2. 신규 데이터(=요소)를 추가
		messageQueue.offer(new Message("sendMail", "홍길동"));
		messageQueue.offer(new Message("sendSMS", "신용권"));
		messageQueue.offer(new Message("sendKakaotalk", "홍두께"));
		
		//--3. Queue가 비워질 때까지, 하나씩 빼서 사용
		while(!messageQueue.isEmpty()) {
			Message message = messageQueue.poll();
			
			switch (message.command) {
				case "sendMail":
					log.info(message.to + "님에게 메일을 보냅니다.");
					break;
				case "sendSMS":
					log.info(message.to + "님에게 SMS를 보냅니다.");
					break;
				case "sendKakaotalk":
					log.info(message.to + "님에게 카카오톡을 보냅니다.");
					break;
			} //switch
			
		}//while
		

	}//main

}//end class 
