package week04;

public class P_Q06_Arrays_BreakContinue {

	public static void main(String[] args) {
		
		int arr[]= {3,1,7,9,4,23};
		
		//Print just last two elements 
		for(int i = 0 ; i<arr.length; i++) {
			if(i<arr.length-2) {
				continue;//to skip steps in the loop
			}
			System.out.print(arr[i]+" ");
		}  //int arr[]= {3,1,7,9,4,23};
		//print just first three elements
		System.out.println();
		for(int i=0; i<arr.length; i++) {
			if(i>2) {
				break;//to break the loop
			}
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		//Print the elements from index 2 to index 4
		for(int i=0; i<arr.length; i++) {
			if(i<2) {
				continue;
			}
			if(i>4) {
				break;
			}
			System.out.print(arr[i]+" ");
		}
		
	}

}
