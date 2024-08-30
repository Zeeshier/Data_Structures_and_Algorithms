
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList{
    Node head;
    Node tail;

    // Add a node at the end of the list
    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
            tail.next = head; // Make the tail point to the head to form the circle
        } else {
            tail.next = newNode;
            tail = newNode;
            tail.next = head; // Make the tail point back to the head to maintain the circular structure
        }
    }

    // Remove a node by value
    public void remove(int data) {
        if (head == null) return;

        Node current = head;
        Node prev = null;
        do {
            if (current.data == data) {
                if (prev != null) {
                    prev.next = current.next;
                    if (current == tail) {
                        tail = prev;
                    }
                } else {
                    head = head.next;
                    tail.next = head; // Update the tail to maintain the circular structure
                }
                return;
            }
            prev = current;
            current = current.next;
        } while (current != head);
    }

    // Print the list
    public void printList() {
        if (head == null) return;

        Node current = head;
        do {
            System.out.print(current.data + " -> ");
            current = current.next;
        } while (current != head);
        System.out.println(" (head)");
    }

    // Get the size of the list
    public int size() {
        if (head == null) return 0;

        int count = 0;
        Node current = head;
        do {
            count++;
            current = current.next;
        } while (current != head);
        return count;
    }

    // Check if the list contains a specific value
    public boolean contains(int data) {
        if (head == null) return false;

        Node current = head;
        do {
            if (current.data == data) {
                return true;
            }
            current = current.next;
        } while (current != head);
        return false;
    }
}

public class CircularLinkedList{
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        // Add elements to the list
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        // Print the list
        System.out.println("Original List:");
        list.printList();

        // Remove an element
        list.remove(20);
        System.out.println("After removing 20:");
        list.printList();

        // Check the size of the list
        System.out.println("Size of the list: " + list.size());

        // Check if the list contains a specific element
        System.out.println("List contains 30: " + list.contains(30));
        System.out.println("List contains 50: " + list.contains(50));
    }
}


