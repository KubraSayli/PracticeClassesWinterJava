package week01dt;

import java.util.Scanner;

public class Q05_GradeCalculation {

	public static void main(String[] args) {
		/*
		 Ask user to enter mid-term grade, final grade, and project grade 
		 Calculate the general grade (mid-term : 30% , project : 20%, final : 50%)
		 
		  Example: 
		      INPUT: mid-term grade=78
		      		 final grade = 66
		      		 project grade = 90 
		      OUTPUT: "Your grade is : 81,6"
		 
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your midterm grade");
		double midtermGrade = scan.nextDouble();
		System.out.println("Enter your project grade");
		double projectGrade = scan.nextDouble();
		System.out.println("Enter your final grade");
		double finalGrade = scan.nextDouble();
		double grade = midtermGrade*30/100 + projectGrade*20/100 + finalGrade*50/100;
		System.out.println("Your grade is : " + grade);
		
		scan.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
