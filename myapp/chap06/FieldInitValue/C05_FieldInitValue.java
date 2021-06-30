package FieldInitValue;

//설계도인 클래스의 필드선언시, 이전의 Car 클래스처럼, 초기값을 지정하지 않으면,
//우리가 이전에 말았던, 자바의 타입별 기본값(정수:0, 실수:0.0, boolean:false, 참조타입:null) 이라는 값으로, 객체 새엇잇 초기화됨
public class C05_FieldInitValue {
	//필드
	byte byteField;
	short shorField;
	int intField;
	long longField;
	
	boolean booleanField;
	char charField;
	
	float floatField;
	double doubleField;
	
	int[] arrField;
	String referenceField;
}
