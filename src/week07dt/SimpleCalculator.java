package week07dt;

public class SimpleCalculator {
	/*Create a calculator which has three classes
	First class should be named as Simple Calculator
	create add, subtract, multiply, divide methods in SimpleCalculator Class

	Second class should be named as AdvancedCalculator , 
	in this class create absouluteValue method and square root methods

	Create a Runner class...
	*/
	
	public void add(double... v) {
		
		double sum = 0;
		for(double w : v) {
			sum += w;
		}
		System.out.println("The sum is "+ sum);		
	}
	
	public void subtract(double a, double b) {
		
		System.out.println("The difference is "+(a-b));		
	}
	
	public void multiply(double... v) {
		
		double product = 1;
		for(double w : v) {
			product *= w;
		}
		System.out.println("The product is "+product);
	}
	
	public void divide(int a, int b) {
		try {
			System.out.println("The result is " + (a/b));
		}catch(ArithmeticException e) {
			System.out.println("Do not divide by zero");
		}
	}

	
}
