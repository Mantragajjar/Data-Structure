import java.util.Scanner;

class LinkedList {
    // Node class
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head = null;

    // Insert at beginning
    void insertFirst(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        System.out.println("Inserted at first: " + data);
    }

    // Insert at end
    void insertLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null)
                temp = temp.next;
            temp.next = newNode;
        }
        System.out.println("Inserted at last: " + data);
    }

    // Insert at specific position (1-based index)
    void insertSpecific(int pos, int data) {
        Node newNode = new Node(data);
        if (pos == 1) {
            newNode.next = head;
            head = newNode;
            return;
        }
        Node temp = head;
        for (int i = 1; temp != null && i < pos - 1; i++) {
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("Invalid position!");
            return;
        }
        newNode.next = temp.next;
        temp.next = newNode;
        System.out.println("Inserted " + data + " at position " + pos);
    }

    // Delete first node
    void deleteFirst() {
        if (head == null) {
            System.out.println("List is empty!");
            return;
        }
        System.out.println("Deleted first: " + head.data);
        head = head.next;
    }

    // Delete last node
    void deleteLast() {
        if (head == null) {
            System.out.println("List is empty!");
            return;
        }
        if (head.next == null) {
            System.out.println("Deleted last: " + head.data);
            head = null;
            return;
        }
        Node temp = head;
        while (temp.next.next != null)
            temp = temp.next;
        System.out.println("Deleted last: " + temp.next.data);
        temp.next = null;
    }

    // Delete specific position (1-based index)
    void deleteSpecific(int pos) {
        if (head == null) {
            System.out.println("List is empty!");
            return;
        }
        if (pos == 1) {
            System.out.println("Deleted position " + pos + ": " + head.data);
            head = head.next;
            return;
        }
        Node temp = head;
        for (int i = 1; temp != null && i < pos - 1; i++)
            temp = temp.next;
        if (temp == null || temp.next == null) {
            System.out.println("Invalid position!");
            return;
        }
        System.out.println("Deleted position " + pos + ": " + temp.next.data);
        temp.next = temp.next.next;
    }

    // Display list
    void display() {
        if (head == null) {
            System.out.println("List is empty!");
            return;
        }
        Node temp = head;
        System.out.print("Linked List: ");
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}

public class linklist{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList list = new LinkedList();

        while (true) {
            System.out.println("\n--- Singly Linked List Menu ---");
            System.out.println("1. Insert First");
            System.out.println("2. Insert Last");
            System.out.println("3. Insert Specific");
            System.out.println("4. Delete First");
            System.out.println("5. Delete Last");
            System.out.println("6. Delete Specific");
            System.out.println("7. Display");
            System.out.println("8. Exit");
            System.out.print("Enter choice: ");
            int ch = sc.nextInt();

            switch (ch) {
                case 1:
                    System.out.print("Enter data: ");
                    list.insertFirst(sc.nextInt());
                    break;
                case 2:
                    System.out.print("Enter data: ");
                    list.insertLast(sc.nextInt());
                    break;
                case 3:
                    System.out.print("Enter position: ");
                    int pos = sc.nextInt();
                    System.out.print("Enter data: ");
                    list.insertSpecific(pos, sc.nextInt());
                    break;
                case 4:
                    list.deleteFirst();
                    break;
                case 5:
                    list.deleteLast();
                    break;
                case 6:
                    System.out.print("Enter position to delete: ");
                    list.deleteSpecific(sc.nextInt());
                    break;
                case 7:
                    list.display();
                    break;
                case 8:
                    System.out.println("Exiting...");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
