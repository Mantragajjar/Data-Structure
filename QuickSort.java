import java.util.Scanner;

public class QuickSort 
{    
    public static void quickSort(int[] arr, int low, int high) // Quick Sort function
    {
        if (low < high) 
        {
            int pivotIndex = partition(arr, low, high);  // Partition the array and get pivot index
            // Recursively sort elements before and after partition
            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }   
    public static int partition(int[] arr, int low, int high)  // Partition function
    {
        int pivot = arr[high]; // pivot
        int i = low - 1; // index of smaller element

        for (int j = low; j < high; j++) 
        {           
            if (arr[j] <= pivot)  // If current element is smaller than or equal to pivot
            {
                i++;                
                int temp = arr[i];   // Swap arr[i] and arr[j]
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];   // Swap arr[i+1] and arr[high] (pivot)
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);      
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) 
        {
            arr[i] = sc.nextInt();
        }

        quickSort(arr, 0, n - 1); // Call quick sort
        
        System.out.println("Sorted array:");
        for (int i = 0; i < n; i++) // Display sorted array
        {
            System.out.print(arr[i] + " ");
        }
    }
}