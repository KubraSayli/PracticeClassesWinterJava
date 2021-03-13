package week04dt;

import java.util.Arrays;
import java.util.Scanner;

public class MyClass {
	 public static void main(String[] args) {
	        
	        
         //Type a program that can print Bee with all these arrays 
         String arr1[][]= {{"A","B","V"},{"e","L","f"},{"h","e","r","t"}};
         String arr2[][]= {{"e","A","f","V"},{"B","e","e","f"},{"h","t","r","t"}};
         String arr3[][]= {{"A","V"},{"B","L","f"},{"h","e","r","t"}};
//       printBee(arr1);
//       printBee(arr2);
//       printBee(arr3);
         Scanner scan=new Scanner(System.in);
         System.out.println("Enter word that you want to check if you can write with array -case sensitive-");
         String str=scan.next();
         printBee(arr1,str);
         
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
                        // break;
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
     public static void printBee(String arr[][], String str) {
         String s[]=str.split("");
         String cont="";
         int iter=0;
         int check=0;
     
         int ind[][]=new int[s.length][2];
  //     System.out.println(Arrays.toString(s));
         for (int i = 0; i < arr.length; i++) {
             if(check==s.length) {
                 break;
             }
             for (int j = 0; j < arr[i].length; j++) {
                 if(check==s.length) {
                     break;
                 }
                 for (int k = 0; k < s.length; k++) {
                 //  System.out.print(iter+" "+Integer.toString(i)+" "+Integer.toString(j)+" "+Integer.toString(k)+" "+check+" "+cont+" \n");
                     
             
                     iter++;
                     if(check==s.length) {
                         break;
                     }
                     if(s[k].equals(arr[i][j])) {
                     
                         if(cont.contains(Integer.toString(k))) {
                             continue;
                         }
                         ind[k][0]=i;
                         ind[k][1]=j;
                         cont=cont+k;
                         check++;
                         break;
                     }
                 }
             }
         }
         if(check==s.length) {
             System.out.println("Girmis oldugunuz kelime olan "+str+" yi "+iter+" iterasyonda verilen multidimarray ile yazabildigimizi buldum. Harflerin indisleri ise soyldir");
             for (int i = 0; i < ind.length; i++) {
                 System.out.print(Arrays.toString(ind[i])+" ");
             }
         } else System.out.println(iter+" deneme yaptim yazdiginiz "+str+" kelimesini verilen array ile yazamayacagimizi buldum.");
         
         
         
         
         
     }
}
