package week06dt;

import java.util.ArrayList;
import java.util.List;

public class Q03_Lists_CompleteSentence {
	/*
	 * Question: Type the codes which has 2 list of elements. 
	 * The first list has "John, running, to ", and the 
	 * 2nd list has "John, will, to, home". 
	 * It completes the  missing words for each list and complete the sentences
	 *  like:
	  "John is running to School. John will come back to home" as one list. 
	    Remove the ,'s. 
	 *  Then delete all the elements in the list.	
	 */
	public static void main(String[] args) {
		List <String> list1 = new ArrayList<>();
		list1.add("John");
		list1.add("running");
		list1.add("to");
		list1.add(1,"is");
		list1.add("school");
		System.out.println(list1);
		
		List <String> list2 = new ArrayList<>();
		list2.add("John");
		list2.add("will");
		list2.add("to");
		list2.add("home");
		list2.add(2,"come");
		list2.add(3,"back");
		System.out.println(list2);
		
		list1.addAll(list2);
		System.out.println(list1);
		
		for(String w : list1) {
			System.out.print(w+" ");
		}
		list1.clear();
		System.out.println();
		System.out.println(list1);
		
	
	}

}
