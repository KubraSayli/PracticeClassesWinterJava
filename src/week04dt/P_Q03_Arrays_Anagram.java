package week04dt;

import java.util.Arrays;
import java.util.Scanner;

public class P_Q03_Arrays_Anagram {

	public static void main(String[] args) {
		/*
		 * Anagram is to create a new word from other word's letters.
		 * Write java code to check if two words are anagram or not 
		 * isAnagram("listen", "Silent") ==> anagram
		 * Dormitory = Dirty room.
		School master = The classroom.
		Conversation = Voices rant on.
		Listen = Silent.
		Astronomer = Moon starer.
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first String please");
		String str1 = scan.nextLine();
		System.out.println("Enter second String please");
		String str2 = scan.nextLine();
		System.out.println(isAnagram(str1,str2));
		scan.close();
	}
	
	public static String isAnagram(String str1, String str2) {
		String s1[]= str1.toLowerCase().replace(" ", "").split("");
		String s2[]= str2.toLowerCase().replace(" ", "").split("");
		
		Arrays.sort(s1);
		Arrays.sort(s2);
		
		if(Arrays.equals(s1, s2)) {
			return "anagram";
		}else {
			return "not anagram";
		}
		
	}
	
	
	
	
	
	
	
	

}
