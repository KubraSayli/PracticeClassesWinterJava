package week03dt;

import java.util.Scanner;

public class P_Q04_Loops_RepeatedLetters {

	public static void main(String[] args) {
		/*
		 Ask user to enter a name and a character, 
	then check how many times the character is repeated 
	in the name by using loops in the name

	 Example:
	        INPUT      :char ch1= 'a' ;
	                    String name =“John came late" 
	        OUTPUT :  2
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a String please");
		String s = scan.nextLine();
		System.out.println("Enter a character please");
		char c = scan.next().charAt(0);
		
		
		System.out.println(c +" is repeated "+ countMethod(c, s) + " times in this String");
	    scan.close();

	}
	
	public static int countMethod(char ch, String str) {
		int counter = 0;
		for(int i=0 ; i<str.length(); i++) {
			if(ch == str.charAt(i)) {
				counter++;
			}
		}
		return counter;
	}
	
	
	
	
	
	
	
	
	
	

}
