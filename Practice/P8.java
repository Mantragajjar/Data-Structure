//Write a java program to perform addition of two matrix

import java.util.Scanner;
public class P8 
{
    public static void main (String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows for matrix : ");
        int Rows =sc.nextInt();
        System.out.println("Enter the number of columns for matrix : ");
        int Columns =sc.nextInt();
        int[][] array = new int[Rows][Columns];
        System.out.println("Enter elements for the matrix  :");
        for (int i = 0; i < Rows; i++) 
        {
            for (int j = 0; j < Columns; j++) 
            {
                System.out.print("Element at position [" + i + "][" + j + "]: ");
                array[i][j] = sc.nextInt();
            }
        }

        int[][] array1 = new int[Rows][Columns];
        System.out.println("Enter elements for the matrix 2 :");
        for (int i = 0; i < Rows; i++) 
        {
            for (int j = 0; j < Columns; j++) 
            {
                System.out.print("Element at position [" + i + "][" + j + "]: ");
                array1[i][j] = sc.nextInt();
            }
        }
        int[][] sumMatrix = new int[Rows][Columns];
        for (int i = 0; i < Rows; i++) 
        {
            for (int j = 0; j < Columns; j++) 
            {
                sumMatrix[i][j] = array[i][j] + array1[i][j];
            }
        }
        System.out.println("Sum of array and array1 is :");
        for (int i = 0; i < Rows; i++) 
        {
            for (int j = 0; j < Columns; j++) 
            {
                System.out.print(sumMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
