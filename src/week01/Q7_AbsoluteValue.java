package week01;

import java.util.Scanner;

public class Q7_AbsoluteValue {

	public static void main(String[] args) {
		/*
		 Type java code by using if-else statement,
Write a program to print absolute value of a number entered by user.
		 */
		
	
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter an integer to find its absolute value");
		int a = scan.nextInt();
		
		if(a>=0) {
			System.out.println(a);
		}else {
			System.out.println(-1*a);
		}
		scan.close();
		
	}

}
