package week02;

import java.util.Scanner;

public class P_Q08_String_FirstThreeLetters {

	public static void main(String[] args) {
		// Type the codes which asks the user to enter the name.
		//It prints the first three characters of the name and puts * for the rest of the characters.

		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your name please");
		String name = scan.nextLine().trim();
		
		String first = name.substring(0, 3);
		String second = name.substring(3);
		String star = second.replaceAll("\\w", "*");
		System.out.println(first+star);

	}

}
