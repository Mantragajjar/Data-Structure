//Write a java code to copy one single dimension array to another array.
import java.util.*;

public class P3 
{
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner (System.in);
        int[] arr1 = new int[5];
        System.out.println("Enter elements for the original array:");
        for(int i = 0; i < 5; i++) 
        {
            System.out.print("Enter element at " + (i) + " : "  );
            arr1[i] = sc.nextInt();
        }
        int [] arr2 = new int[5];
        for(int i = 0; i < 5; i++) 
        {
            arr2[i] = arr1[i];
        }
        System.out.println("Copied array is : ");
        for(int i = 0; i < 5; i++) 
        {
            System.out.print(arr2[i] + " ");
        }
    }
}
