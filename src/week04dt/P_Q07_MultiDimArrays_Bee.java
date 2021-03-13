package week04dt;

public class P_Q07_MultiDimArrays_Bee {

	public static void main(String[] args) {
		//Type a program that can print Bee with all these arrays 
		String arr1[][]= {{"A","B","V"},{"e","L","f"},{"h","e","r","t"}};
		String arr2[][]= {{"e","A","B","V"},{"B","e","L","f"},{"h","e","r","t"}};
		String arr3[][]= {{"A","V"},{"B","L","f"},{"h","e","r","t"}};
        printBee(arr1);
		printBee(arr2);
		printBee(arr3);
	}
	public static void printBee(String arr[][]) {
		String s="";
		for(int i=0; i<arr.length; i++) {
			
			for(int j=0; j<arr[i].length; j++) {
				
				if(arr[i][j].equals("B")) {
					if(s.isEmpty()) {
						s=s+arr[i][j];
					}
				}else if(arr[i][j].equals("e")) {
					if(s.equals("B")||s.equals("Be")) {
						s=s+arr[i][j];
						break;
					}
				}
			}
			
		}
		if(s.length()<3) {
			System.out.println("Not enough char to print Bee");
		}else {
			System.out.println(s);
		}
	
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
