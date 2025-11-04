
import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        // BubbleSort ob = new BubbleSort();
        // ob.bubble(arr);
        // different way to call static method without creating object of class ONLY FOR STATIC METHOD
        bubble(arr);
        System.out.println("Sorted array:");
        // for (int i = 0; i < arr.length; i++) {
        //     System.out.print(arr[i] + " ");
        // }
        // used alternative way to print array
        System.out.println(Arrays.toString(arr));
    }
    public static void bubble(int arr[])
    {
        for (int i = 0; i < arr.length; i++) 
        {
            for (int j = 0; j < arr.length-1; j++) 
            {
                if(arr[j] > arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
}
