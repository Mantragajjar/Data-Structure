//Write a program for array using row major order using function. 

import java.util.Scanner;
class P12
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int[][] array = new int [3][3];

        System.out.println("Enter the elements of the 3x3 matrix:");

        for (int i = 0; i < 3; i++) 
        {
            for (int j = 0; j < 3; j++) 
            {
                System.out.print("Element at position [" + i + "][" + j + "]: ");
                array[i][j] = sc.nextInt();
            }
        }
        System.out.println("The matrix is raw major:");
        for (int i = 0; i < 3; i++) 
        {
            for (int j = 0; j < 3; j++) 
            {
                System.out.print( array[i][j] + " ");
                
            }
            System.out.println();
        }
    }
}
