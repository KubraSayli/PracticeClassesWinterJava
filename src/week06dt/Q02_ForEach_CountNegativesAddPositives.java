package week06dt;

import java.util.Arrays;

public class Q02_ForEach_CountNegativesAddPositives {
	/*Create an array and create a  method to find the number of positive numbers and sum of 
	 the non-positive numbers
	 Return type must be int array
	 [a,b] 
	 */
	public static void main(String[] args) {
	
		int arr[]= {3,-8,2,5,-1,-7};
		System.out.println(Arrays.toString(countNegAddPos(arr)));

	}
	
	public static int[] countNegAddPos(int arr[]) {
		int sum = 0;
		int counter = 0;
		
		
		for(int w: arr) {
			if(w<=0) {
				sum=sum+w;
			}else {
				counter++;
			}
		}
		int result[]= {sum,counter};
		return result;
		
	}
	
}
