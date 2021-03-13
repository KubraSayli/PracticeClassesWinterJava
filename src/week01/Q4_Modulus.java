package week01;

public class Q4_Modulus {

	public static void main(String[] args) {
		int a = 56;
        int b = -8;
        int c = a % b;
        int d = b % a;
        System.out.println(c + ", " + d);
        
        
 //What will be the output of the following program?
        
        int num = 69;
        int month = num / 30;
        int days = num % 30;
        System.out.println(num + " days is "+month + " Month and " + days + " days");
	}

}
