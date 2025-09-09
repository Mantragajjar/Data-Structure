//Write a java code to find minimum number from any 10 element from the array.

import java.util.Scanner;
public class P6 
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
        int minNumber = arr[0];
        
        for (int i = 1; i < 10; i++) 
        {
            if (arr[i] < minNumber) 
            {
                minNumber = arr[i];
            }
        }
        System.out.println("The minimum number in the array is: " + minNumber);
    }
}
