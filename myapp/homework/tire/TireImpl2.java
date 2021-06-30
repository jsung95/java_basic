package tire;

import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j;


@NoArgsConstructor
@Log4j
public class TireImpl2 
	implements ITire {

	@Override
	public int roll() {
		log.info(ITire.MAX_INCH + "인치 타이어로 자전거가 굴러갑니다.");
		return 10;
	}
	
}//end class
