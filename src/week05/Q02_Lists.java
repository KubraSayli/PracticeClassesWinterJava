package week05;

import java.util.ArrayList;
import java.util.List;

public class Q02_Lists {

	public static void main(String[] args) {
		/*
		 * Create an integer array with 5 elements
		 * Convert to a list
		 * Add 11, and 13 into the list, 11 will be at the beginning, 13 will be at index 3
		 * Increase the value of every element by 3
		 * Print the multiplication of the elements from index 2 to index 5
		 */
		
		int arr[] = {4,5,6,8,9};
		List<Integer> list = new ArrayList<>();
		
		for(int i=0; i<arr.length; i++) {
			list.add(arr[i]);
		}
		System.out.println(list);
		
		list.add(0, 11);
		list.add(3, 13);
		System.out.println(list);
		for(int i=0; i<list.size(); i++) {
			list.set(i, list.get(i)+3);
		}
		System.out.println(list);
		int product = 1;
		for(int i=2; i<=5; i++) {
			product *= list.get(i);
		}
		System.out.println(product);
		
		
	}

}
