//Write a java program to display array in reverse order.

import java.util.*;
public class P2 
{
    public static void main(String args[]) 
    {
        Scanner sc= new Scanner(System.in);
        int[] arr = new int[5];
        for(int i = 0; i < 5; i++) 
        {
            System.out.print("Enter element at " + (i) + " : "  );
            arr[i] = sc.nextInt();
        }
        for(int i = 4; i >= 0; i--) 
        {
            System.out.print(arr[i] + " ");
        }
    }
}
