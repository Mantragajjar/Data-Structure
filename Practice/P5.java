//Write a Java program to find the maximum number from an array of 10 elements entered by the user. 

import java.util.*;
public class P5 
{
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        for(int i = 0; i < 10; i++) 
        {
            System.out.print("Enter element at " + (i) + " : "  );
            arr[i] = sc.nextInt();
        }
        int maxnumber = arr[0];
        
        for (int i = 1; i < 10; i++) 
        {
            if (arr[i] > maxnumber) 
            {
                maxnumber = arr[i];
            }
        }
        System.out.println("The maximum number in the array is: " + maxnumber);
    }   
}
