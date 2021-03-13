package week04dt;

import java.util.Arrays;
import java.util.Scanner;

public class P_Q02_Arrays_Print {

	public static void main(String[] args) {
		/*
		Ask user to enter 5 names then assign them to an array
		eg:                
		String names = "john Marry william Brian Richard";
		Then print the names and the number of the letters in each word 1 by 1 on the console 
	
		*/
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter five names with space");
		String str = scan.nextLine();
		String s [] = str.split(" ");
		System.out.println(Arrays.toString(s));
		
		for(int i=0; i<s.length; i++) {
			System.out.println(s[i]+" "+s[i].length());
		}	
		scan.close();
	}
}
