package week02;

import java.util.Scanner;

public class P_Q03_Switch_Team {

	public static void main(String[] args) {
		// Question 1: Type the codes which asks the user to put the 
					//letters for the favorite football club in Turkey. It prints "Galatasaray" for gs, it prints "Trabzonspor" for ts, it prints "Besiktas" 
					//for bjk and it prints "Fenerbahce" for fb. Please use switch statement in your codes.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your favourite teams letters please");
		String team = scan.next().toLowerCase();
		
		switch(team) {
		case "bjk" : 
			System.out.println("Besiktas");
			break;
		case "ts" :
			System.out.println("Trabzonspor");
			break;
		case "gs" :
			System.out.println("Galatasaray");
			break;
		case "fb" :
			System.out.println("Fenerbahce");
			break;
			default : 
				System.out.println("Please enter a valid letters");
			
		}
		
		scan.close();
	
	}

}
