import java.util.Scanner;
class practice1
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int[] a=new int[5];
        for(int i=0;i<5;i++)
        {
            System.out.println("Enter Number in Array at ["+ i +"] :");
            a[i]=sc.nextInt();
        }

        for(int i=0;i<4;i++)
        {
            {
                System.out.print(a[i]+" "+a[i+1]+ "\n");
            }
        }
       
        for(int i=0;i<4;i++)
        {
            if(a[i]<a[i+1])
            {
                System.out.println(a[i]+" ");
            }
            else
            {
                System.out.println(a[i+1]+" ");
            }
        }
        int size=0;
        for(int i=0;i<4;i++)
        {
            if(a[i]<a[i+1])
            {
                System.out.print(a[i]+" "+a[i+1]+"\n");
            }
            else
            {
                System.out.print(a[i+1]+" "+a[i]+"\n");
            }
            size=size+2;
            
            
        }
        int[] b=new int[size];


        
        int temp=0;
        for(int i=0;i<4;i++)
        {
            if(a[i]<a[i+1])
            {             
                b[temp]=a[i];
                temp++;
                b[temp]=a[i+1];

            }
            else
            {
                b[temp]=a[i+1];
                temp++;
                b[temp]=a[i];
            }
            temp++;
            
        }

        for(int i=0;i<size;i++)
        {
               System.out.print(b[i]+" ");
        }

    }
}