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
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    // Remove a node by value
    public void remove(int data) {
        if (head == null) return;

        if (head.data == data) {
            head = head.next;
            if (head != null) {
                head.prev = null;
            } else {
                tail = null;
            }
            return;
        }

        Node current = head;
        while (current != null && current.data != data) {
            current = current.next;
        }

        if (current == null) return;

        if (current == tail) {
            tail = tail.prev;
            if (tail != null) {
                tail.next = null;
            }
        } else {
            current.prev.next = current.next;
            if (current.next != null) {
                current.next.prev = current.prev;
            }
        }
    }

    // Print the list from head to tail
    public void printForward() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " <-> ");
            current = current.next;
        }
        System.out.println("null");
    }

    // Print the list from tail to head
    public void printBackward() {
        Node current = tail;
        while (current != null) {
            System.out.print(current.data + " <-> ");
            current = current.prev;
        }
        System.out.println("null");
    }

    // Get the size of the list
    public int size() {
        int count = 0;
        Node current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    // Check if the list contains a specific value
    public boolean contains(int data) {
        Node current = head;
        while (current != null) {
            if (current.data == data) {
                return true;
            }
            current = current.next;
        }
        return false;
    }
}

public class DoublyLinkedList {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        // Add elements to the list
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        // Print the list in forward direction
        System.out.println("List in forward direction:");
        list.printForward();

        // Print the list in backward direction
        System.out.println("List in backward direction:");
        list.printBackward();

        // Remove an element
        list.remove(20);
        System.out.println("After removing 20:");
        list.printForward();

        // Check the size of the list
        System.out.println("Size of the list: " + list.size());

        // Check if the list contains a specific element
        System.out.println("List contains 30: " + list.contains(30));
        System.out.println("List contains 50: " + list.contains(50));
    }
}
