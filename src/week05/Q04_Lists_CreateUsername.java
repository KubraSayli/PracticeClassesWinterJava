package week05;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Q04_Lists_CreateUsername {

	public static void main(String[] args) {
		/*
		   Type a program that can create random username
	 *  1. Step : Create a database (Create a String list and add five names)
	 *  2. Step : Ask user their name
	 *  3. Step : Remove spaces
	 *  4. Step : Check if username is valid
	 *  5. Step : If username is not in our list user can use that username
	 *  6. Step : If username is in our list add random number at the end of the username 
		 */
		
		List <String> userListInDatabase = new ArrayList<>();
		Random random = new Random();
		userListInDatabase.add("Yusuf");
		userListInDatabase.add("Fatma");
		userListInDatabase.add("Leyla");
		userListInDatabase.add("Deniz");
		userListInDatabase.add("Mustafa");
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the username that you want to use :");
		String username = scan.nextLine().replace(" ", "");
		
		if(userListInDatabase.contains(username)) {
			int randomNumber = random.nextInt(100001);
			username +=randomNumber;
			System.out.println("You can use this username : "+ username);
		}else {
			System.out.println("Valid username,You can use this username : "+username);
		}
		
		scan.close();
		
	}

}
