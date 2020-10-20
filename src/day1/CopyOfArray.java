package day1;

import java.util.Arrays;

public class CopyOfArray {
public static void main(String[] args) {
	int[] org = new int[] {1, 2 ,3}; 
    
    System.out.println("Original Array : \n"); 
    for (int i = 0; i < org.length; i++) 
         System.out.print(org[i] + " ");   
   
     int[] copy = Arrays.copyOf(org, 3); 
  
     System.out.print("\nNew array copy:\n"); 
     for (int i = 0; i < copy.length; i++)  
         System.out.print(copy[i] + " "); 

}
}
