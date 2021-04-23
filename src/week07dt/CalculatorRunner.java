package week07dt;

public class CalculatorRunner {

	public static void main(String[] args) {
		
		AdvanceCalculator obj1 = new AdvanceCalculator();
	//	SimpleCalculator obj2 = new SimpleCalculator();
		
	    obj1.add(4,5,9,1);
	    obj1.subtract(8, 3);
	    obj1.multiply(4,2,1,3);
	    obj1.divide(6, 2);
	    obj1.divide(3, 0);
	    obj1.absValue(-5);
	    obj1.sqrRoot(16);
	    obj1.sqrRoot(-9);//NaN (not number)
	
	}

}
