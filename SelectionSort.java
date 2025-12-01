import java.util.Scanner;

public class SelectionSort 
{
    public static void selectionSortData(int arr[]) 
    {
        //int n = arr.length;

        // One by one move boundary of unsorted subarray
        for (int i = 0; i < arr.length - 1; i++) 
        {
            // Find the minimum element in the unsorted array
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) 
            {
                if (arr[j] < arr[minIndex]) 
                {
                    minIndex = j;
                }
            }

            // Swap the found minimum element with the first element
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        // Take array input from user
        int[] arr = new int[n];
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) 
	{
            arr[i] = sc.nextInt();
        }

        // Call selection sort
        selectionSortData(arr);

        // Print the sorted array
        System.out.println("Sorted array:");
        for (int i = 0; i < n; i++) 
        {
            System.out.print(arr[i] + " ");
        }
    }
}