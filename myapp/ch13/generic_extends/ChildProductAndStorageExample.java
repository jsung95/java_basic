package generic_extends;

public class ChildProductAndStorageExample {
	public static void main(String[] args) {
		//--1. 제네릭 자식 클래스 타입의 객체 생성 
		ChildProduct<Tv, String, String> product = new ChildProduct<>(); //타입추론
		
		//--1.1 객체의 메소드 호출 
		product.setKind(new Tv());
		product.setModel("smart TV");
		product.setCompany("Samsung");
		
		//----------------
		
		//--2.제네릭 구현 클래스 타입의 객체 생성 
		Storage<Tv> storage = new StorageImpl<>(100);  //다형성-1 
		
		//--2.1 객체의 메소드 호출 
		storage.add(new Tv(), 0);
		Tv tv = storage.get(0);
		
	}//main
	
}//end class
