package generic_extends;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter

//부모타입이 제네릭타입이라면 자식타입은 부모타입의 모든 타입파라미터를 가져야하며
//그 외에 자식안의 타입이라면 역시 가질 수 있다.
public class ChildProduct<T, M, C> extends Product<T, M> {
	
	private C company;
	
	
//	public C getCompany() {
//		return this.company;
//	}//getCompany
//	
//	public void setCompany(C company) {
//		this.company = company;
//	}//setCompany
	
}//end class
