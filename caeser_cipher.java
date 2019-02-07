import java.io.*;
import java.util.*;
class cc
{ public static void main(String []args)
    { int i,key;
     String InputString;
     Scanner input = new Scanner(System.in);

     System.out.println("Enter a String:");
     InputString = input.nextLine();
     char[] car = InputString.toCharArray();
    
      System.out.println("Enter key value");
       key=input.nextInt();
    
    int l = InputString.length();
    
    for(i=0;i<l;i++)
    {  
      int ascii = car[i];
      ascii = ascii+key;
      char character = (char)ascii;
      car[i] = character;
    }
    
    System.out.println("Caeser Cipher:");
    for(i=0;i<l;i++)
    { System.out.print(car[i]);}
    System.out.println("");
    
     }
 }    
