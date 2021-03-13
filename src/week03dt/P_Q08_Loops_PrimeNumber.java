package week03dt;

import java.util.Scanner;

public class P_Q08_Loops_PrimeNumber {
  /*
   Ask user to enter a number and check if this number is prime number or not 
   */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num = scan.nextInt();
		
		int i = 1;
		int sum = 1;
		
		while (i <= num) {
			if (num % i == 0) 
			{
			sum = sum * i;		
			
			}
			
			i++;
		}
			if (sum == num) 
			{
				System.out.println(num + " is a prime number.");
			
			}else {
				System.out.println(num + " is not a prime number.");
				
				}
			scan.close();

	}
	
	/*
	 Ask user to enter a number and check if this number is prime 
	 2 3 5 7 11 13 17 19 23 29 31 ...
	 */
	

}
