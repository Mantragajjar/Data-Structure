import java.util.*;

class Stack
{
    public static void main(String[] args) {
        operation obj = new operation();
        Scanner sc=new Scanner(System.in);
        while(true)
        {
            System.out.print("\n1.push\n2.pop\n3.display\n4.isempty.\n5.peek\n6.underflow\n7.overflow\n8.top and bottom value\n9.exit:\n choice: ");
            int ans=sc.nextInt();
            if(ans==1)
            {
                System.out.println("Enter value:");
                int no=sc.nextInt();
                obj.push(no);
            }
            else if(ans==2)
                obj.pop();
            else if(ans==3)
                obj.display();
            else if(ans==4)
                obj.isempty();
            else if(ans==5)
                obj.peek();
             else if(ans==6)
                obj.overflow();
            else if(ans==7)
                obj.underflow();
            else if(ans==8)
                obj.topbottom();   
            else if(ans==9)
                break;
            else
                System.out.println("Select right option");
        }
        sc.close();
    }
}
class operation
{
    int[] arr;
    int size;
    public operation() 
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter size of stack: ");
        int size= sc.nextInt();
        arr= new int[size];
    }
    
    int top=-1;
    void push(int no)
    {
        if(top>=size)
        {
            System.out.println("Stack overflow");
        }
        else
        {
            top++;
            arr[top]=no;
        }
    }
    void pop()
    {
        if(top<0)
        {
            System.out.println("Stack underflow");
            top=-1;
        }
        else
        {
            top--;
        }
    }
    void display()
    {
        System.out.println();
        for(int i=0;i<=top;i++)
        {
            System.out.println(arr[i]+" ");
        }
    }
    void isempty()
    {
        if(top==-1)
        {
            System.out.println("Stack is Empty");
        }
    }
    void peek()
    {
        System.out.println(arr[top]);
    }
    void overflow()
    {
        if(top>size)
        {
            System.out.println("Stack is OverFlow");
        } 
    }
    void underflow()
    {
        if(top<0)
        {
            System.out.println("Stack is OverFlow");
        }
    }
    void topbottom()
    {
        System.out.println("Value of array element at top:");
        System.out.print(arr[top]);
        System.out.println("Value of array element at bottom:");
        System.out.print(arr[0]);
    }
}