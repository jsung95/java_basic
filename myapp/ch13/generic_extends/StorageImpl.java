package generic_extends;

import lombok.NonNull;

// 제네릭 인터페이스를 implements 하는 구현 클래스 역시,
// 부모타입이 제네릭타입이라면, 부모타입의 타입파라미터를 가져와야 함은 똑같다.
public class StorageImpl<T> implements Storage<T> {
	
	private T[] array;
	
	
	@SuppressWarnings("unchecked")
	public StorageImpl(int capacity) {
		this.array = (T[])(new Object[capacity]);
	}//constructor
	
	
	@Override
	public void add(T item, int index) {
		array[index] = item;
	}//add

	@Override
	public T get(int index) {
		return array[index];
	}//get
	
}//end class
