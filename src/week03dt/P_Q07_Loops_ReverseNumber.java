package week03dt;

import java.util.Scanner;

public class P_Q07_Loops_ReverseNumber {

	public static void main(String[] args) {
		/*
		  Type the program which asks the user to enter a positive number. 
		 * Then it prints the reversed number provided by the user.
		 *6789 => 9876
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a positive number please");
		int num = scan.nextInt();
//		String newNum="";
//	    while(num>0) {
//	    	int num1 = num%10;
//	    	newNum += num1;
//	    	num = num/10;
//	    }
//	    System.out.println(newNum);
		
		while(num > 0) {
			int reverse = num%10;
			num/=10;
			System.out.print(reverse);
		}
		
		scan.close();
		
	
	}

}
