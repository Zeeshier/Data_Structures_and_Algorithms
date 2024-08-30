class Node {
    int data;
    Node prev;
    Node next;

    Node(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}

class LinkedList {
    Node head;
    Node tail;

    // Add a node at the end of the list
    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
            head.prev = tail; // Make the head's prev point to tail
            tail.next = head; // Make the tail's next point to head
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            newNode.next = head; // Make the new node's next point to head
            head.prev = newNode; // Make the head's prev point to the new node
            tail = newNode;
        }
    }

    // Remove a node by value
    public void remove(int data) {
        if (head == null) return;

        Node current = head;
        do {
            if (current.data == data) {
                if (current == head) {
                    head = head.next;
                    head.prev = tail; // Update the head's prev to point to the new head
                    tail.next = head; // Update the tail's next to point to the new head
                } else if (current == tail) {
                    tail = tail.prev;
                    tail.next = head; // Update the tail's next to point to the new head
                    head.prev = tail; // Update the head's prev to point to the new tail
                } else {
                    current.prev.next = current.next;
                    current.next.prev = current.prev;
                }
                return;
            }
            current = current.next;
        } while (current != head);
    }

    // Print the list
    public void printList() {
        if (head == null) return;

        Node current = head;
        do {
            System.out.print(current.data + " <-> ");
            current = current.next;
        } while (current != head);
        System.out.println("(head)");
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

public class DoublyCircularLinkedList {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        // Add elements to the list
        list.add(70);
        list.add(90);
        list.add(120);
        list.add(400);

        // Print the list
        System.out.println("Original List:");
        list.printList();

        // Remove an element
        list.remove(400);
        System.out.println("After removing 400:");
        list.printList();

        // Check the size of the list
        System.out.println("Size of the list: " + list.size());

        // Check if the list contains a specific element
        System.out.println("List contains 90: " + list.contains(90));
        System.out.println("List contains 130 " + list.contains(130));
    }
}
