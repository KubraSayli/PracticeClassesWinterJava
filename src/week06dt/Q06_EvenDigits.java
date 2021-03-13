package week06dt;

public class Q06_EvenDigits {
	/*
	 Type a program that can find the number of even digits number elements in array
	 for array :  int nums[] = {12, 6, 123, 3217}; (numbers should be positive)
	 OUTPUT : There are 2 even digits numbers in the array
	 */
	public static void main(String[] args) {
		int nums[] = {12, 6, 123, 3217,56,67,55};
		int counter = 0;
		for(int w: nums) {
			int digits = 0;
			
			
			while(w>0) {
				w/=10;
				digits++;
			}
			if(digits%2==0 && digits!=0) {
				counter++;
			}
		}
		System.out.println("There are "+ counter +"  even digits numbers in this array");
	}
	

}
