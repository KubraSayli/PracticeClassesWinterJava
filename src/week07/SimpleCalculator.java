package week07;
/*Create a calculator which has three classes
First class should be named as Simple Calculator
create add, subtract, multiply, divide methods in SimpleCalculator Class

Second class should be named as AdvancedCalculator , 
in this class create absoulute method and square root methods

Create a Runner class...
*/
public class SimpleCalculator {
	
	public void add(double... v) {
		double sum = 0;
		for(double w : v) {
			sum += w;
		}
		System.out.println("The sum is " + sum);
	}
	
	public void subtract(double a, double b) {
		
		System.out.println("The difference is " + (a-b));
	}
	
	public void multiply(double... v) {
		double product = 1;
		for(double w : v) {
			product *= w;
		}
		System.out.println("The product is "+ product);
	}
	
	public void division(int a, int b) {
        
		try {
			int c = a/b;
			 System.out.println("The division is ="+c);
		}catch(ArithmeticException e) {
			System.out.println("Do not divide by zero");
		}
       
    }
	

}
