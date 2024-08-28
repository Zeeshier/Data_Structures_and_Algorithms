public class Queue {
    private int maxSize;
    private int front;
    private int rear;
    private int[] array;

    // Constructor to initialize the queue
    public Queue(int maxSize) {
        this.maxSize = maxSize;
        this.front = 0;
        this.rear = 0;
        this.array = new int[maxSize];
    }

    // Function to check if the queue is empty
    public boolean isEmpty() {
        return front == rear;
    }

    // Function to check if the queue is full
    public boolean isFull() {
        return (rear + 1) % maxSize == front;
    }

    // Function to add an element to the queue
    public void enqueue(int data) {
        if (isFull()) {
            System.out.println("Queue is full. Cannot add element.");
            return;
        }
        array[rear] = data;
        rear = (rear + 1) % maxSize;
    }

    // Function to remove an element from the queue
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot remove element.");
            return -1;
        }
        int data = array[front];
        front = (front + 1) % maxSize;
        return data;
    }

    // Function to get the front element of the queue
    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return -1;
        }
        return array[front];
    }

    // Function to display the queue elements
    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return;
        }
        int temp = front;
        while (temp != rear) {
            System.out.print(array[temp] + " ");
            temp = (temp + 1) % maxSize;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Queue queue = new Queue(5);
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.display();  
        System.out.println(queue.dequeue());  
        queue.display();  
    }
}