package week03;

import java.util.Scanner;

public class P_Q06_ForLoop_PerfectNumber {

	/*
	 Ask user enter a number and check if this number is perfect or not
	 INPUT: 6
	 OUTPUT: Perfect Number 
	 (The factors of 6 are : 1,2,3,6 
	 1+2+3=6  ==> it is perfect number )
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number please");
		int num = scan.nextInt();
		System.out.println(perfect(num));
		scan.close();
	}
	
	public static String perfect(int a) {
		int sum = 0;
		for(int i=1; i<a; i++) {
			
			if(a%i==0) {
				sum=sum+i;
			}
			
		}
		if(sum==a) {
			return "perfect";
		}else {
			return "not perfect";
		}
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	

}
