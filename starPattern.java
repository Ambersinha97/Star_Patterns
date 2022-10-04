/*  Question- print star pattern like 
    *
   **
  ***
 ****                                 */

import java.util.*;
import java.io.*;
import java.lang.*;
public class starPattern
{
    public static void main(String[]args)
    {
      Scanner sc=new Scanner (System.in);
       int num=sc.nextInt();   //take input of no. of last stars to be printed
       for(int i=1;i<=num;i++){
       for(int j=num-1;j>=i;j--){
        System.out.print(" ");
       }
       for(int k=1;k<=i;k++){
        System.out.print("*");}
        System.out.println();
        }
        }
    }
    
    
    
