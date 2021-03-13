package week01;

import java.util.Scanner;

public class Q5_MinuteToYears {

	public static void main(String[] args) {
		/*
		Ask user to enter minutes, 
		Write a Java program to convert minutes into a number of years and days.
EXAMPLE:

    INPUT      : number of minutes: 3456789
    
    OUTPUT :  3456789 minutes is approximately 6 years and 210 days
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter num of minutes");
		double min = scan.nextDouble();
		
		long years = (long) (min/(60*24*365));
		long days = (long) (min/(60*24))%365;
		
		System.out.println(min + " minutes is approximately " + years + " years and " + days + " days");
		
		
		scan.close();
		
	
	}

}
