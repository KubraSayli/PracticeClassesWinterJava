package week07;

public class AdvancedCalculator extends SimpleCalculator {

	public void absolute(double a) {
		System.out.println("The absolute value is "+ Math.abs(a));
	}
	
	public void sqrRoot(double a) {
		try {
			System.out.println("The square root is: "+Math.sqrt(a));
		}catch(ArithmeticException e) {
			System.out.println("There can not be negative numbers in square root");
		}
	}
	
	
	
	
	
}
