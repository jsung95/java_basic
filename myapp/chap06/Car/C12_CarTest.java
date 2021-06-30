package Car;

import lombok.extern.log4j.Log4j;


@Log4j
public class C12_CarTest {
	public static void main(String[] args) {
		C11_Car car1 = new C11_Car();
		log.info("car1.company : " + car1.company);
		log.info("--------------------------------");
		
		
		C11_Car car2 = new C11_Car("자가용");
		log.info("car2.company : " + car2.company);
		log.info("car2.model : " + car2.model);
		log.info("--------------------------------");
		
		
		C11_Car car3 = new C11_Car("자가용", "빨강");
		log.info("car3.company : " + car3.company);
		log.info("car3.model : " + car3.model);
		log.info("car3.color : " + car3.color);
		log.info("--------------------------------");
		
		
		C11_Car car4 = new C11_Car("택시", "검정", 200);
		log.info(car4); // lombok @ToString 사용 출력
		log.info("car4.company : " + car4.company);
		log.info("car4.model : " + car4.model);
		log.info("car4.color : " + car4.color);
		log.info("car4.maxSpeed : " + car4.maxSpeed);
		log.info("--------------------------------");
		
		
	}
}
