package generic_extends;

public interface Storage<T> {
	
	public abstract void add(T item, int index);
	
	public abstract T get(int index);
	
}//end calss