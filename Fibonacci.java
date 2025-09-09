public class Fibonacci 
{
    public static void main(String[] args) 
    {
        int count=10;
        System.out.print("Fibonacci series up to " + count + " terms: ");
        for(int i=0;i<=count;i++)
        {
            System.out.print(fibonacci(i)+" ");
        }
    }   
    public static int fibonacci(int n)
    {
        if(n<=1)
        {
            return n;//base case : fibonacci(0)=0,fibonacci(1)=1
        }
        else
        {
            return fibonacci(n-1)+fibonacci(n-2);
        }
    }
} 