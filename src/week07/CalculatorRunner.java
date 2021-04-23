package week07;

public class CalculatorRunner {

	public static void main(String[] args) {
	
		AdvancedCalculator obj = new AdvancedCalculator();
		
		obj.add(4,5,6,9,8,7);
		obj.subtract(9,5);
		obj.multiply(6,5,2);
		obj.division(6,2);
		obj.division(9,0);
		obj.absolute(-9);
		obj.sqrRoot(16);
		obj.sqrRoot(-16);
		
		SimpleCalculator obj2 = new SimpleCalculator();
   
		 obj2.add(6,8);
		 obj2.subtract(7, 4);
		 obj2.multiply(4,8,2);
		 obj2.division(8, 2);
		
	}

}
