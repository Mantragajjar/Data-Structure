import java.util.*;
public class binarySearch
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array values:");
		int ar[]=new int[10];
		for(int i=0;i<10;i++)
		{
			System.out.print("a[" +i+ "]:");
			ar[i]=sc.nextInt();
		}
		System.out.print("Enter key value:");
		int key=sc.nextInt();
		check(ar,key);
	}
	public static int check(int ar[],int key)
	{
		int left=0,right=9;
		while(left<=right)
		{
			int mid=(left+right)/2;
			if(ar[mid]==key)
			{
				System.out.print("value found at index:"+mid);
				break;
			}
			else if(ar[mid]<key)
			{
				left=mid+1;
			}
			else
			{
				right=mid-1;
			}
		}
		if(left>right)
		{
			System.out.print("value not found");
		}
		return 0;
	}
}