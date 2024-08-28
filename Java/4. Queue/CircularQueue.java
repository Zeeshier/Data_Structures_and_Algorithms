public class CircularQueue {
    private int size;
    private int front;
    private int rear;
    private int[] queue;

    // Constructor to initialize the queue
    public CircularQueue(int size) {
        this.size = size;
        this.front = 0;
        this.rear = 0;
        this.queue = new int[size];
    }

    // Function to check if the queue is empty
    public boolean isEmpty() {
        return front == rear;
    }

    // Function to check if the queue is full
    public boolean isFull() {
        return (rear + 1) % size == front;
    }

    // Function to add an element to the queue
    public void enqueue(int data) {
        if (isFull()) {
            System.out.println("Queue is full. Cannot add element.");
            return;
        }
        queue[rear] = data;
        rear = (rear + 1) % size;
    }

    // Function to remove an element from the queue
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot remove element.");
            return -1;
        }
        int data = queue[front];
        front = (front + 1) % size;
        return data;
    }

    // Function to get the front element of the queue
    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return -1;
        }
        return queue[front];
    }

    // Function to display the queue elements
    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return;
        }
        int temp = front;
        while (temp != rear) {
            System.out.print(queue[temp] + " ");
            temp = (temp + 1) % size;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        CircularQueue cq = new CircularQueue(5);
        cq.enqueue(1);
        cq.enqueue(2);
        cq.enqueue(3);
        cq.display();  // Output: 1 2 3
        System.out.println(cq.dequeue());  // Output: 1
        cq.display();  // Output: 2 3
        cq.enqueue(4);
        cq.enqueue(5);
        cq.enqueue(6);  // Queue is full. Cannot add element.
        cq.display();  // Output: 2 3 4 5
    }
}