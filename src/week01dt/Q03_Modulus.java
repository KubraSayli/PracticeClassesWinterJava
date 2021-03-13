package week01dt;

import java.util.Scanner;

public class Q03_Modulus {

	public static void main(String[] args) {
		
		//What will be the output of the following code ?
		int num = 69;
		int month = num/30;
		int days = num%30;
		
		System.out.println(num + " days is " + month + " month  and " + days +" days");
		
		/*
		 Write a Java program to convert minutes into a number of years and days.
EXAMPLE:

    INPUT      : number of minutes: 3456789
    
    OUTPUT :  3456789 minutes is approximately 6 years and 210 days
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter num of minutes");
		double min = scan.nextDouble();
		
		long years = (long) (min/(60*24*365));
		long day = (long) (min/(60*24)%365);
		
		System.out.println(min + " minutes is "+ years + " years and "+ day + " days");
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
