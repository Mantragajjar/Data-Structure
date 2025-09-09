//Write a java program to create 3*3 matrix and perform matrix addition operation. 

import java.util.Scanner;
public class P10
{
    public static void main (String args[])
    {
        Scanner sc = new Scanner(System.in);
        int[][] array = new int[3][3];
        System.out.println("Enter elements for the matrix  :");
        for (int i = 0; i < 3; i++) 
        {
            for (int j = 0; j < 3 ; j++) 
            {
                System.out.print("Element at position [" + i + "][" + j + "]: ");
                array[i][j] = sc.nextInt();
            }
        }

        int[][] array1 = new int[3][3];
        System.out.println("Enter elements for the matrix 2 :");
        for (int i = 0; i < 3; i++) 
        {
            for (int j = 0; j < 3; j++) 
            {
                System.out.print("Element at position [" + i + "][" + j + "]: ");
                array1[i][j] = sc.nextInt();
            }
        }
        int[][] sumMatrix = new int[3][3];
        for (int i = 0; i < 3; i++) 
        {
            for (int j = 0; j < 3; j++) 
            {
                sumMatrix[i][j] = array[i][j] + array1[i][j];
            }
        }
        System.out.println("Sum of array and array1 is :");
        for (int i = 0; i < 3; i++) 
        {
            for (int j = 0; j < 3; j++) 
            {
                System.out.print(sumMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
