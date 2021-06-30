package CellPhone;

import lombok.extern.log4j.Log4j;


@Log4j
public class DmbCellPhone extends CellPhone{
	//필드
	int channel;
	
	
	public DmbCellPhone(String model, String color, int channel) {
		log.info("DmbCellPhone(model, color, channel) invoked.");
		
		this.model = model;
		this.color = color;
		this.channel = channel;
	} //constructor
	
	
	//method
	void turnOnDmb() {
		log.debug("turnOnDmb() invoked");
		
		log.info("\t+ 채널 " + channel + "빈 DMB 방송 수신을 시작 ");
	}//turnOnDmb
	
	void changeChannelDmb(int channel) {
		log.debug("changeChannelDmb(channel) invoked.");
		this.channel = channel;
		
		log.info("\t+ 채널 " + channel + "번으로 바꿉니다 ");
	}//changeChannelDmb
	
	void turnOffDmb() {
		log.debug("turnOffDmb() invoked.");
		
		log.info("\t+ DMB 방송 수신을 멈춥니다 ");
	}//turnOffDmb
	
	
}//end class
