package Calculator;

import lombok.extern.log4j.Log4j;


@Log4j
public class Calculator1 {
	double areaCircle(double radius) {
		log.debug("areaCircle() invoked.");
		
		return 3.141592 * radius *radius; // 원의면적 = 원주율(파이) * 반지름의 제곱 
	}//areaCircle
}
