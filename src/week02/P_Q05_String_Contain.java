package week02;

import java.util.Scanner;

public class P_Q05_String_Contain {

	public static void main(String[] args) {
		/*
		 Ask user to enter his kid�s name, if the name contains �a� output will be �This name contains �a�.�
if the name contains �z� output will be �This name contains �z�.� Otherwise, output will be
�This name contains neither �a� nor �z�.�
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("What is your kids name?");
		String name = scan.nextLine().toLowerCase();
		
		
		if(name.contains("a") && name.contains("z")) {
			System.out.println(name + " contains both a and z");
		}else if(name.contains("a")) {
			System.out.println(name + " contains a");
		}else if(name.contains("z")) {
			System.out.println(name + " contains z");
		}else {
			System.out.println(name + " contains neither a nor z");
		}
		
		scan.close();
		

	}

}
