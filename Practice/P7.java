//Write a java program to create float array of 10 elements. Find its sum and average of it.

import java.util.*;
public class P7 {
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        float[] arr = new float[10];
        float sum = 0;

        for(int i=0;i<10;i++)
        {
            System.out.print("Enter element at " + (i) + " : ");
            arr[i] = sc.nextFloat();
            sum = sum + arr[i];
        }
        float average = sum / 10;
        System.out.println("The sum of the array elements is: " + sum);
        System.out.println("The average of the array elements is: " + average);
    }
}
