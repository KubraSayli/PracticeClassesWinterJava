package week06dt;

public class Q01_Varargs_AddMethod {
/*
	 Write a return method that accepts more than one integer as parameter
         * and prints the sum of integers
         *
         * Method name = sum
         * if you call method like that sum(1,2,3) output =6
         *                              sum(1,2,3,4,5) output =15
         *                              sum(1,2) output=3
	 */
	public static void main(String[] args) {
		System.out.println(sum(1,3,4,5));
		System.out.println(sum(1,2,3,4,5));
	}
	
	public static int sum(int...a) {
		int sum=0;
		
		for(int w: a) {
			sum=sum+w;
		}
		
		return sum;
	}

}
