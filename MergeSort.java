import java.util.Scanner;

public class MergeSort 
{    
    public static void mergeSort(int arr[], int left, int right) // Merge Sort function
    {
        if (left < right) 
        {           
            int mid = (left + right) / 2;   // Find the middle point

            // Sort first and second halves
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);

            // Merge the sorted halves
            merge(arr, left, mid, right);
        }
    }
    
    public static void merge(int[] arr, int left, int mid, int right) // Merge function
    {
        // Sizes of two subarrays to merge
        int n1 = mid - left + 1;
        int n2 = right - mid;

        // Create temp arrays
        int[] L = new int[n1];
        int[] R = new int[n2];

        // Copy data to temp arrays
        for (int i = 0; i < n1; i++)
            L[i] = arr[left + i];
        for (int j = 0; j < n2; j++)
            R[j] = arr[mid + 1 + j];

        // Merge the temp arrays
        int i = 0, j = 0;
        int k = left;

        while (i < n1 && j < n2) 
        {
            if (L[i] <= R[j]) 
            {
                arr[k] = L[i];
                i++;
            } 
            else 
            {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
       
        while (i < n1)   // Copy remaining elements of L[]
        {
            arr[k] = L[i];
            i++;
            k++;
        }
        
        while (j < n2) // Copy remaining elements of R[]
        {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);        
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();  // Take number of elements
        
        int[] arr = new int[n];
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) 
        {
            arr[i] = sc.nextInt();
        }        
        mergeSort(arr, 0, n - 1);  // Apply merge sort        
        System.out.println("Sorted array:");
        for (int i = 0; i < n; i++)   // Print sorted array
        {
            System.out.print(arr[i] + " ");
        }
    }
}