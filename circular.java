// A simple implementation of a Circular Queue in Java

class CircularQueue {
    int size=5, front=-1, rear=-1;
    int queue[]=new int[size];

    
    // Method to check if the queue is full
    boolean isFull() {
        if (front == 0 && rear == size - 1) {
            return true;
        }
        if (front == rear + 1) {
            return true;
        }
        return false;
    }

    // Method to check if the queue is empty
    boolean isEmpty() {
        if (front == -1) {
            return true;
        }
        return false;
    }

    // Method to add an element to the queue (enqueue)
    void enQueue(int element) {
        if (isFull()) {
            System.out.println("Queue is full. Cannot enqueue " + element);
        } else {
            if (front == -1) {
                front = 0;
            }
            rear = (rear + 1) % size;
            queue[rear] = element;
            System.out.println("Enqueued: " + element);
        }
    }

    // Method to remove an element from the queue (dequeue)
    int deQueue() {
        int element;
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot dequeue.");
            return -1;
        } else {
            element = queue[front];
            if (front == rear) {
                // If there's only one element, reset the queue after dequeuing
                front = -1;
                rear = -1;
            } else {
                front = (front + 1) % size;
            }
            return element;
        }
    }

    // Method to display the elements of the queue
    void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
        } else {
            System.out.print("Queue elements: ");
            int i;
            for (i = front; i != rear; i = (i + 1) % size) {
                System.out.print(queue[i] + " ");
            }
            System.out.println(queue[i]);
        }
    }
}



public class circular {
    public static void main(String[] args) {
        CircularQueue cq = new CircularQueue();

        // Enqueue some elements
        cq.enQueue(10);
        cq.enQueue(20);
        cq.enQueue(30);
        cq.enQueue(40);
        cq.enQueue(50);

        // Display the queue
        cq.display();

        // Try to enqueue when full
        cq.enQueue(60);
        
        // Display the queue again
        cq.display();

        // Enqueue again after dequeue
        cq.enQueue(70);
        cq.display();

        // Dequeue all elements to show it becomes empty
        cq.deQueue();
        cq.deQueue();
        
        cq.display();
        
     }
}
