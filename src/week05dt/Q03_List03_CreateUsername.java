package week05dt;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Q03_List03_CreateUsername {
/*
     Type a program that can create random username
	 *  1. Step : Create a database (Create a String list and add five names)
	 *  2. Step : Ask user their name
	 *  3. Step : Remove spaces
	 *  4. Step : Check if username is valid
	 *  5. Step : If username is not in our list user can use that username
	 *  6. Step : If username is in our list add random number at the end of the username 
 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your username");
		String username = scan.nextLine().replace(" ", "");
		
		List<String> userListInDatabase = new ArrayList<>();
		userListInDatabase.add("Ayse");
		userListInDatabase.add("Sibel");
		userListInDatabase.add("Shadi");
		userListInDatabase.add("Osman");
		userListInDatabase.add("Esra");
		System.out.println(userListInDatabase);
		
		Random random = new Random();
		int randomNumber=random.nextInt(100001);
		
		boolean isUsernameInDatabase = userListInDatabase.contains(username);
		
		if(isUsernameInDatabase) {
			System.out.println("This username is already exists");
			username += randomNumber;
			System.out.println("You can use this username : "+username);
			}else {
				System.out.println("You can use this username : "+username);
			}
		scan.close();

	}

}
