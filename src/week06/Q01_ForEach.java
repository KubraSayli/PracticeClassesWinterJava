package week06;

import java.util.Arrays;

public class Q01_ForEach {

	public static void main(String[] args) {
		/*
		 Create an array and create a  method to find the number of positive numbers and sum of 
	 the non-positive numbers
	 Return type must be int array
	 [a,b] 
		 */
		int arr[]= {2,6,1,-9,-7,-2};
		System.out.println(Arrays.toString(countPosAddNeg(arr)));	
	}	
	public static int[] countPosAddNeg(int arr[]) {
		int countPositives = 0;
		int sumNegatives = 0;
		for(int w : arr) {
			if(w<=0) {
				sumNegatives+=w;
			}else {
				countPositives++;
			}
		}
		int result[]= {sumNegatives, countPositives};
		return result;
	}
	
	
}
