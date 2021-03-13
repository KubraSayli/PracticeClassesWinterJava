package week01dt;

import java.util.Scanner;

public class Q10_Overflow {

	
		/*
		 Write a Java program to compute and print sum of two given numbers (more than or equal to zero). 
If given integers or the sum have more than 10 digits, print "overflow".
EXAMPLE:
  INPUT      :  
Input two integers:
25
46
    OUTPUT :  
Sum of the said two numbers:
71       
		 */
		

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter two integer");
		long l1 = scan.nextLong();
		long l2 = scan.nextLong();
		long sum = l1 + l2;
		
		if(l1<0 || l2<0) {
			System.out.println("the integers should be more than or equal to zero");
		}else if(sum >= 10000000000l) {
				System.out.println("Overflow");
			}else {
				System.out.println("The sum of the integers are " + sum);
			}
	
		scan.close();
	}
	
}