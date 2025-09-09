
import java.util.Scanner;

class operation
{
    int a=1;
    void display(int no)
    {
        if(a<=10)
        {
            System.out.println(no+"x"+a+"="+(no*a));
            a++;
            display(no);
        }
        else
        {
            return;
        }
    }
}
public class recursion2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Number : ");
        int no=sc.nextInt();
        operation obj=new operation();
        obj.display(no);
    }
}
