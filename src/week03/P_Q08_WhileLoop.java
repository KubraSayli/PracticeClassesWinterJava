package week03;

import java.util.Scanner;

public class P_Q08_WhileLoop {

	public static void main(String[] args) {
		/*
	 Print numbers from given number till the next multiple of 10. e.g.,
	  if input is 5 it should print 5, 6, 7, 8, 9, 10 or
	  if input is 27 it should print 27, 28, 29, 30 or 
	  if input is 40 then it should print 40.
	 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number please");
		int num = scan.nextInt();
		m01(num);
		scan.close();
	}
	
	public static int m01(int num) {
		
		while(num%10!=0) {
			System.out.println(num);
			num++;
		}
		
		System.out.println(num);
		return num;
	}
	
	
	
	
	
	
	
	
	
	

}
