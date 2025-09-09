import java.util.*;

class Queue
{
    public static void main(String[] args) 
    {
        operation obj = new operation();
        Scanner sc=new Scanner(System.in);
        while(true)
        {
            System.out.println("\n1.Enqueue\n2.dequeue\n3.display\n4.isempty.\n5.peek\n6.exit:\n choice:");
            int ans=sc.nextInt();
            if(ans==1)
            {
                System.out.println("Enter value:");
                int no=sc.nextInt();
                obj.enqueue(no);
            }
            else if(ans==2)
                obj.dequeue();
            else if(ans==3)
                obj.display();
            else if(ans==4)
                obj.isempty();
            else if(ans==5)
                obj.peek();
            else if(ans==6)
                break;
            else
                System.out.println("Select right option");
        }
        sc.close();
    }
}
class operation
{
    int arr[]=new int[5];
    int front=-1;
    int rear=-1;

    void enqueue(int no)
    {
        if(rear==4)
        {
            System.out.println("Queue Overflow!");
        }
        else
        {
            if(front==-1)
            {
                front=0;
            }
            rear++;
            arr[rear]=no;
            System.out.println(no+"inserted in queue");
        }
    }
    void dequeue()
    {
        if(front==-1|| front==rear)
        {
            System.out.println("Queue Underflow!");
            front=-1;
            rear=-1;
        }
        else
        {
            System.out.println(arr[front]+" removed from queue");
            front++;
        }
    }
    void display()
    {
        System.out.println("Queue elements:");
        for(int i = front;i<=rear;i++)
        {
            System.out.println(arr[i]+" ");
        }
        System.out.println();
    }
    void isempty()
    {
        if(front==-1)
        {
            System.out.println("Queue is Empty");
        }
    }
    void peek()
    {
        System.out.println(arr[front]);
    }
}