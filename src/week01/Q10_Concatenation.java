package week01;

public class Q10_Concatenation {

	public static void main(String[] args) {
		/*
		 Write a Java program to create a string in the form Str1 + Str2 + Str1 from two strings. 
    EXAMPLE:
	 INPUT      : Str1 =Refrigerator
                 Str2 = Empty
    
    OUTPUT :    EmptyRefrigaratorEmpty
		 */
		
		String str1 = "Java";
        String str2 = " is easy";
        System.out.println(str1+str2);
        
        System.out.println(2+0+2+1+"TechProEd");
        System.out.println("TechProEd"+2+0+2+1);
        System.out.println(2+0+2+1+"TechProEd"+2+0+2+1);
        System.out.println(2+0+2+1+"TechProEd"+(2+0+2+1));
		
        String name = "Jack", marks = "1";
        String section = "A";
        marks += "230";
        System.out.println("Name: " + name);
        System.out.println("Section: " + section);
        System.out.println("Marks: " + marks);
		
		
       
		

	}

}
