package week05dt;

import java.util.ArrayList;
import java.util.List;

public class Q01_List01 {
	/*
	 Create an integer list which has 5 elements
	 Update all elements by adding "*" on the right of every element
	 */
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		list.add(6);
		list.add(9);
		list.add(1);
		list.add(3);
		list.add(10);

		List<String> list2 = new ArrayList<>();
		for(int i=0; i<list.size(); i++) {
			list2.add(list.get(i)+"*");
		}
		System.out.println(list2);
		
	}

}
