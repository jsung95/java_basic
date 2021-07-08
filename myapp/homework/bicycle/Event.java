package bicycle;

import brake.Brake;
import handle.Handle;
import lombok.extern.log4j.Log4j;
import tire.TireImpl1;


@Log4j 
public class Event {
	//압정밟기, 넘어지기, 핸들조작, 휴식, 브레이크 고장, 내리막길마주침(속도빨라져서 브레이크로 속도 줄이기)
	//1~5(5), 6~15(10), 16~65(50), 51~70(20), 71~75(5), 76~100(15)
	
//	int rand = (int)(Math.random() * 100) + 1;
	
	TireImpl1 tire = new TireImpl1();
	Handle handle = new Handle(null);
	Brake brake = new Brake();
	
	public Event(int rand) {
		log.debug("Event() invoked.");
		log.info(rand);
		if (rand >= 1 && rand < 6) {	//압정밟기
//			tire.pin();	
			log.info("tire.pin() invoked");
		} else if (rand < 16) {		//넘어지기
			handle.breakDown();
			log.info("handle.breakDown() invoked");
		} else if (rand < 66) {		// 핸들조작
			handle.changeDir();		
			log.info("handle.changeDir() invoked");
		} else if (rand < 71) {		// 휴식
			;; 						//////* 휴식구현 어케함? *////
			log.info("휴식 invoked");	
		} else if (rand < 76) {		// 브레이크고장
			 brake.breakDown();
			 log.info("brake.breakDown() invoked");
		} else {					// 내리막길
			brake.operating(false, 10);	////*current speed 매개변수값???*////
			log.info("brake.operating(op, current) invoked");
		} // if-else
	} //event

} // end class
