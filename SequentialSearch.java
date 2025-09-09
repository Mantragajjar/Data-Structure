import java.util.*;

class SequentialSearch//linear search
{
	public static void main (String ar[])
	{
		Scanner sc = new Scanner (System.in);
		int[] arr = new int[4];
		System.out.println("Enter elements in the array:");

        for(int i = 0; i < 4; i++) 
        {
            System.out.print("Element at position [" + i + "]: ");
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the element to search:");
        int search = sc.nextInt();
        boolean found = false;
        int value = 0;
        for(int i = 0; i < 4; i++)
        {
            if(arr[i] == search)
            {
                found = true;
                value = i;
                break;
            }
        }
        if(found)
        {
            System.out.println("Element found at index position of: " + value);
        }
        else
        {
            System.out.println("Element not found");
        }
	}
}