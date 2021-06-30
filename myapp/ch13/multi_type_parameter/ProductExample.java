package multi_type_parameter;

import lombok.extern.log4j.Log4j2;


@Log4j2
public class ProductExample {
	
	// 멀티 타입 파라미터를 가지는 제네릭 클래스를 "사용" 하는 클래스 
	public static void main(String[] args) {
		//제네릭 타입을 "사용"할 때에는, 타입 파라미터에 "구체타입"을 전달(지정)해야 한다!
		Product<Tv, String> product1 = new Product<>();
		
		//Sette 메소드 호출
		product1.setKind(new Tv());
		product1.setModel("스마트TV");
		
		//Getter 메소드 호출
		Tv tv = product1.getKind();
		String tvModel = product1.getModel();
		
		log.info("- tv : " + tv);
		log.info("- tvModel : " + tvModel);
		
		
		
		Product<Car, String> product2 = new Product<>();

		//Sette 메소드 호출
		product2.setKind(new Car());
		product2.setModel("디젤");

		//Getter 메소드 호출
		Car car = product2.getKind();
		String carModel = product2.getModel();
		
		log.info("- car : " + car);
		log.info("- carModel : " + carModel);
	}

}
