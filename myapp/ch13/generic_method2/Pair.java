package generic_method2;

import lombok.AllArgsConstructor;


@AllArgsConstructor
public class Pair<K, V> {
	private K key;
	private V value;
	
//	public Pair(K key, V value) {
//		this.key = key;
//		this.value = value;
//	}//constructor
	
	
	//필드 key의 Setter/Getter 메소드 
	public void setKey(K key) {
		this.key = key;
	}//setKey
	
	public K getKey() {
		return key;
	}//getKey
	
	
	//필드 value의 Setter/Getter 메소드
	public void setValue(V value) {
		this.value = value;
	}//setValue
	
	public V getValue() {
		return value;
	}//getValue

}//end class
