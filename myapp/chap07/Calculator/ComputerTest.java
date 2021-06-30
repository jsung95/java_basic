package Calculator;

import lombok.extern.log4j.Log4j;


@Log4j
public class ComputerTest {
	public static void main(String[] args) {
		int r = 10;
		
		Calculator1 calculator = new Calculator1();
		
		log.info("원의 면적 : " + calculator.areaCircle(r));
		
		log.info("------------------------------");
		
		Computer computer = new Computer();
		log.info("원의 면적 : " + computer.areaCircle(r));
	}
}
