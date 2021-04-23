package week08;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissorsGame {

	public static void main(String[] args) {
		//1:Rock 2:Paper 3:Scissors
		Scanner scan = new Scanner(System.in);
		char answer = 'y';
		int userWin = 0;
		int computerWin = 0;
		
		while(answer == 'y') {
			System.out.println("Please enter your choice \n1 for Rock \n2 for Paper \n3 for Scissors ");
			int userChoice = scan.nextInt();
			
			Random rnd = new Random();
			int comChoice = rnd.nextInt(3)+1;
			
			if(comChoice==1) {
				System.out.println("Computer chose Rock");
			}else if(comChoice==2) {
				System.out.println("Computer chose Paper");
			}else {
				System.out.println("Computer chose Scissors");
			}
			System.out.println(comChoice);
			
			if(userChoice==comChoice) {
				System.out.println("It's a tie!");
			}else if(userChoice==1 && comChoice==3 || userChoice==2 && comChoice==1 || userChoice==3 && comChoice==2 ) {
				System.out.println("You win!");
				userWin++;
			}else {
				System.out.println("Computer wins :(");
				computerWin++;
			}
			System.out.println("Would you like to continue? (y/n)");
			answer=scan.next().charAt(0);
			
			if(answer=='n') {
				System.out.println("Hope you enjoyed:)");
				System.out.println("You won "+userWin+ " times");
				System.out.println("Computer won "+computerWin +" times");
				if(computerWin>userWin) {
					System.out.println("Computer is the winner");
				}else if(computerWin==userWin) {
					System.out.println("There is no winner");
				}else {
					System.out.println("You re the champ!");
				}
			}else if(!(answer=='n' || answer=='y')) {
				System.out.println("Wrong choice");
			}
			
		}
		
		scan.close();
		
	}

}
