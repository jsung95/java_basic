package Calculator;

import lombok.NoArgsConstructor;


@NoArgsConstructor
public class CalculatorRectangle {				//Method Overloading Sample
	
	// 메소드 오버로딩의 대전제 : (리턴타입은 무관) 메소드의 매개변수의 
	// 1) 갯수  2) 순서  3) 타입,  이 세가지 중에 단 하나라도 달라야만, 메소드 오버로딩을 허용한다!
	
	
	//정사각형의 넓이 
	double areaRectangle(double width) {
		return width * width;
	} //areaRectangle
	
	//직사각형의 넓이
	double areaRectangle(double width, double height) {
		return width * height;
	} //areaRectangle
	
}//end class
