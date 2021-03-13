package week06;

public class Q03_AddThrees {
/*
 write a method that accepts an array and prints true if the sum of all 3's in
         * the array is exactly 9
         *
         * Input : {2,3,5,3,6,3,7} output :true 
         * Input : {2,3,4,5,6,3,7} output :false
 */
	public static void main(String[] args) {
		
		int arr[]= {2,3,5,3,6,3,7};
		int brr[]= {2,3,4,5,6,3,7};
		System.out.println(isNine(arr));
		System.out.println(isNine(brr));
	}
	public static boolean isNine(int arr[]) {
		int sum = 0;
		for(int w : arr) {
			if(w == 3) {
				sum += w;
			}
		}
		if(sum != 9) {
			return false;
		}
		return true;
	}
	

}
