package week04dt;

import java.util.Arrays;
import java.util.Scanner;

public class P_Q06_Arrays_RemoveElement {

	public static void main(String[] args) {
		/* Create an array by the help of user
		 * Ask user the element to remove the element user asked
		 * Print the array on the console after removing
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the length of array please");
		int length = scan.nextInt();
		int arr[]=new int[length];
		int i=0;
		do {
			System.out.println("Enter the value for index "+i);
			arr[i]=scan.nextInt();
			
			i++;
		}while(i<arr.length);
		System.out.println(Arrays.toString(arr));
		
		
		System.out.println("Tell me the index of element that you want to remove");
		int idx = scan.nextInt();
		if(idx<0 || idx>arr.length) {
			System.out.println("Invalid index");
		}else {
			int b=0;
			int newArr[]=new int[length-1];
			for(int k=0; k<length; k++) {
				
				if(k==idx) {
					continue;
				}
				newArr[b]=arr[k];
				b++;
			}
			System.out.println(Arrays.toString(arr));
			System.out.println(Arrays.toString(newArr));
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
