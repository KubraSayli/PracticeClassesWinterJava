package week08dt;

public interface Inside {

	int PRICE = 20000;
	
	public abstract void seat();
	abstract void steeringWheel();
	void radio();
	
	//After Java 8 we can create a concrete method in an interface with default keyword
	public default void sunroof() {
		System.out.println("It has sunroof");
	}
	//After Java 8 we can create a concrete method in an interface with static keyword
	public static void clean() {
		System.out.println("Keep it clean");
	}
	
	
	
}
