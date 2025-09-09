class operation
{
    void display(int no) 
    {
        if(no>=0)
        {
            System.out.print(no+" ");
            no--;
            display(no);
        }
        else
        {
            return;
        }
    }
}

public class recursion {
    public static void main(String[] args) {
        operation obj=new operation();
        obj.display(10);
    }
}
