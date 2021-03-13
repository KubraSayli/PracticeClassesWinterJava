package week01;

import java.util.Scanner;

public class Q6_MaxMinNumber {

	public static void main(String[] args) {
		/*
		 ask user to enter 3 numbers then 
1-find the max number
2-find the minumum number

EXAMPLE:

    INPUT      :      Num1: 23
                      Num2: 29
                      Num3: 55 
                     
    OUTPUT  :         Max Number is : 55
                      Min Number is : 23
                      
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");
		int x = scan.nextInt();
		System.out.println("Enter a number");
		int y = scan.nextInt();
		System.out.println("Enter a number");
		int z = scan.nextInt();
		
		if(x>y && x>z) {
			System.out.println("Max number is : " + x);
		}else if(y>z && y>x) {
			System.out.println("Max number is :" + y);
		}else {
			System.out.println("Max number is : "+ z);
		}
		
		if(x<y && x<z) {
			System.out.println("Min number is : "+x);
		}else if(y<x && y<z) {
			System.out.println("Min number is : "+ y);
		}else {
			System.out.println("Min number is :"+ z);
		}
	
		scan.close();

	}

}
