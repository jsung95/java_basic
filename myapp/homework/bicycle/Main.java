package bicycle;

import lombok.extern.log4j.Log4j;


@Log4j
public class Main {
	public static void main(String[] args) {

		Bicycle bicycle = new Bicycle("자전거회사1", "BICY1001-123", "RED", 1567, 150000);
		
		bicycle.run();
		
		bicycle.stop();
		
		
		
	}//main
	
}//end class
