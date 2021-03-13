package week01dt;

import java.util.Scanner;

public class GenderElseIf {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("How old are you?");
		int age = scan.nextInt();
		System.out.println("Enter your gender");
		char gender = scan.next().toUpperCase().charAt(0);
		
		if(gender == 'F') {
			if(age>=18) {
				System.out.println("Woman");
			}else {
				System.out.println("Girl");
			}
		}else if(gender == 'M') {
			if(age>=18) {
				System.out.println("Man");
			}else {
				System.out.println("Boy");
			}
		}else {
			System.out.println("Wrong");
		}
		
		scan.close();

	}

}
