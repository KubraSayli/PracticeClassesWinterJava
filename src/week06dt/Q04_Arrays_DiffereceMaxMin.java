package week06dt;

import java.util.Arrays;
import java.util.Scanner;

public class Q04_Arrays_DiffereceMaxMin {
	/*
	 Type a program that takes an array and returns the difference between the biggest and the smallest numbers.
	 Ask user to enter array elements.
	*/

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the length of the array");
		int length = scan.nextInt();
		int arr[] = new int[length];
		System.out.println("Enter the elements of te array");
		
		for(int i=0; i<length; i++) {
			arr[i]=scan.nextInt();
		}
		System.out.println(Arrays.toString(arr));
	    Arrays.sort(arr);
	    System.out.println(Arrays.toString(arr));
	    int difference = arr[arr.length-1]-arr[0];
	    System.out.println("The difference between max and min element is: "+ difference);
		scan.close();
		
	
	}

}
