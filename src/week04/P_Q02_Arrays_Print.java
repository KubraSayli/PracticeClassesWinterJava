package week04;

import java.util.Arrays;
import java.util.Scanner;

public class P_Q02_Arrays_Print {

	public static void main(String[] args) {
		/*
		Ask user to enter 5 names then assign them to an array
		eg:                
		String names = "John Marry William Brian Richard";
		Then print the names and the number of the letters in each word 1 by 1 on the console 
	
		*/
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Write five names with space");
		String str = scan.nextLine();
		
		
		
		String names [] = str.split(" ");
		System.out.println(Arrays.toString(names));
		
		for(int i =0 ; i<names.length; i++) {
		
			System.out.println(names[i]+" "+names[i].length());
		
		}
		scan.close();

	}

}
