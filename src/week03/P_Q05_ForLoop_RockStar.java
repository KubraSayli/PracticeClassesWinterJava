package week03;

import java.util.Scanner;

public class P_Q05_ForLoop_RockStar {

	public static void main(String[] args) {
		/*
		 Ask user to enter an integer and type a program:
	 For numbers which are a multiple of 3, print Rock instead of number,
	 and for numbers which are a multiple of 5, print Star instead of the number. 
	 For numbers which are a multiple by of both 3 and 5, 
	 print RockStar instead of the number.

EXAMPLE:
INPUT  :  1 2 3 4 ..... 30
OUTPUT :  1 2 Rock 4 Star Rock 7 8 Rock Star 11 Rock 13 14 RockStar
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number please");
		int num = scan.nextInt();
		rockStar(num);
		scan.close();
	
	}
	
	public static int rockStar(int a) {
		for(int i=1; i<=a; i++) {
			
			if(i%3==0 && i%5==0) {
				System.out.println("RockStar");
			}else if(i%3==0) {
				System.out.println("Rock");
			}else if(i%5==0) {
				System.out.println("Star");
			}else {
				System.out.println(i);
			}
		}
		return a;
	}
	
	
	
	
	
	
	
	
	
	

}
