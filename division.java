
import java.util.Scanner;

class operation
{
    void display(int no)
    {
        
        if(no%2==0)
        {
            System.out.println(no/2);
            no=no/2;
            
                display(no);
            
        }
        else{
            
           return;
        }
    }
}
public class division {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Number : ");
        int no=sc.nextInt();
        operation obj=new operation();
        if(no%2==0)
            obj.display(no);
        else    
            System.out.print("invalid");
    }
}