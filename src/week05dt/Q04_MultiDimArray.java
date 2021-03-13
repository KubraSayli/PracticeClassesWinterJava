package week05dt;

public class Q04_MultiDimArray {
/*
 Type a program that can add the even numbers in the array       
         * INPUT : {{1,3,6},{2,8},{5,7,9,14}}
         * OUTPUT : The sum of even numbers is  : 26        
 */
	public static void main(String[] args) {
		int arr[][]={{1,3,6},{2,8},{5,7,9,14}};
		int brr[][]={{1,4,6},{2,12,8},{5,2,7,9,14}};
		add(arr);
		add(brr);
	}

	public static void add(int arr[][]) {
		
		int sum = 0;
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++ ) {
				
				if(arr[i][j]%2==0) {
					sum += arr[i][j];
				}
			}
		}
		System.out.println("The sum of even elements is: "+ sum);
		
	}

}
