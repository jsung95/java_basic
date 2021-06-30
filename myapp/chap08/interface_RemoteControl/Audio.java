package interface_RemoteControl;

import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j;


@Log4j
@NoArgsConstructor
public class Audio 
	implements RemoteControl{
	
	//--1. 필드
	private int volume;

	
	//--2. 메소드
	
	//turnOn() 추상메소드의 실체 메소드 
	@Override
	public void turnOn() {
		log.info("turnOn() invoked.");
	}// turnOn

	
	//turnOff() 추상메소드의 실체 메소드 
	@Override
	public void turnOff() {
		log.info("turnOff() invoked.");
	}// turnOff

	
	//setVolume() 추상 메소드의 실체 메소드 
	@Override
	public void setVolume(int volume) {
		log.info("setVolume(volume) invoked. ");
		
		if(volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		}
		else if(volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		}
		else {
			this.volume = volume;
		}// 다중 if-else
		
		log.info("현재 Audio 볼륨 : " + volume);
	}// setVolume
	

}// end class
