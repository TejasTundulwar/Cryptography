import java.io.*;
import java.util.*;

class des
 { public static void main(String args[])
   {
    String key ="1010101011111101010111010111010100010101010101011010101111010101";String inter = "";String inter2 ="";
    int seq[]= {0,2,4,6,1,3,5,7} ;
    char matrix[][]=new char [8][8];
    int seq2[]={0,2,4,6,1,3,5}; 
    char matrix1[][]=new char [7][8];
    char shift[]=new char[50];
    int i;int j;int k=0;int l=0;

 
   System.out.println(key.length());
 
   //intital permutation
   do
   { i=seq[l];
    for(j=0;j<8;j++)
    {
         
         matrix[i][j]=key.charAt(k);
           k++;
         
   }  
   l++;
   
  }while(l<8);   

  

  //permutated string
   for(i=0;i<8;i++)
   {    for(j=0;j<8;j++)
       { inter = inter + matrix[i][j]; }
   }

  //reduced string
  for(i=1;i<=64;i++)
  { 
     if (i%8!=0)
     { inter2 = inter2 + inter.charAt(i-1);}
   }

  System.out.println("inter2\t"+inter2+"\nsize="+inter2.length());


  inter = "";k=0;l=0;

  //second permutation
   do
   { i=seq2[l];
    for(j=0;j<8;j++)
    {
         
         matrix1[i][j]=inter2.charAt(k);
           k++;
         
   }  
   l++;
   
  }while(l<7); 

 
  //permutated string
   for(i=0;i<8;i++)
   {    for(j=0;j<8;j++)
       { inter = inter + matrix[i][j]; }
   }
 
    inter2 = ""; 
    
  //reduced string
  for(i=1;i<=56;i++)
  { 
     if (i%7!=0)
     { inter2 = inter2 + inter.charAt(i-1);}
   }

  System.out.println("inter2(new)\t"+inter2+"\nsize="+inter2.length());

  for(i=0;i<inter2.length();i++)
  { 
   if(i==(inter2.length())-1){shift[0]=inter2.charAt(i);}  
   shift[i+1]=inter2.charAt(i);
     
  }

 inter2="";
   for(i=0;i<48;i++)
  { 
    inter2=inter2+shift[i];   
  }
System.out.println("After shifting \t"+inter2+"\tsize:"+inter2.length());
}
}
