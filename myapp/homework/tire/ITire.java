package tire;


public interface ITire {
	
	public static final int MIN_INCH_TIRE_LIFE = 10;
	public static final int MAX_INCH_TIRE_LIFE = 15;
	
	//일반적인 자전거의 바퀴 인치는 26~29인치 
	public static final int MIN_INCH = 26;
	public static final int MAX_INCH = 29;
	
	public abstract int roll();
	
	public abstract void pin();
}//end interface
