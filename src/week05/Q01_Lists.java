package week05;

import java.util.ArrayList;
import java.util.List;

public class Q01_Lists {

	public static void main(String[] args) {
		/*
		 * Create an integer list which has 5 elements
		 * Update all elements by adding "*" on the right of every element
		 */
		
		List <Integer> list1 = new ArrayList<>();
		list1.add(3);
		list1.add(7);
		list1.add(1);
		list1.add(9);
		list1.add(11);
		
		List <String> list2 = new ArrayList<>();
		
		for(int i=0; i<list1.size(); i++) {
			
			list2.add(list1.get(i)+"*");
		}
		System.out.println(list2);
		
	
	}

}
