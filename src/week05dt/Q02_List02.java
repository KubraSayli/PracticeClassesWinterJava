package week05dt;

import java.util.ArrayList;
import java.util.List;

public class Q02_List02 {
	/*
	 * Create an integer array with 5 elements
	 * Convert to a list
	 * Add 11, and 13 into the list, 11 will be at the beginning, 13 will be at index 3
	 * Increase the value of every element by 3
	 * Print the multiplication of the elements from index 2 to index 5
	 */
	public static void main(String[] args) {
		int arr[] = {4,6,1,2,9};
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
