package week03;

import java.util.Scanner;

public class P_Q03_Method {

	public static void main(String[] args) {
		/*
		 Write a method named isEven that accepts an integer argument. 
	 The method should return true if the argument is even, or false otherwise.
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter an integer please");
		int num = scan.nextInt();
		System.out.println(isEven(num));
		scan.close();
	
	}
	public static boolean isEven(int a) {
		
		if(a%2==0) {
			return true;
		}else {
			return false;
		}
	}

}
