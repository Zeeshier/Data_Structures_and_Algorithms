public class DoubleStack {
    private int size;
    private int top1;
    private int top2;
    private int[] array;

    // Constructor to initialize the double stack
    public DoubleStack(int size) {
        this.size = size;
        this.top1 = -1;
        this.top2 = size;
        this.array = new int[size];
    }

    // Function to check if stack 1 is empty
    public boolean isEmpty1() {
        return top1 == -1;
    }

    // Function to check if stack 2 is empty
    public boolean isEmpty2() {
        return top2 == size;
    }

    // Function to check if stack 1 is full
    public boolean isFull1() {
        return top1 + 1 == top2;
    }

    // Function to check if stack 2 is full
    public boolean isFull2() {
        return top2 - 1 == top1;
    }

    // Function to push an element onto stack 1
    public void push1(int data) {
        if (isFull1()) {
            System.out.println("Stack 1 is full. Cannot push element.");
            return;
        }
        array[++top1] = data;
    }

    // Function to push an element onto stack 2
    public void push2(int data) {
        if (isFull2()) {
            System.out.println("Stack 2 is full. Cannot push element.");
            return;
        }
        array[--top2] = data;
    }

    // Function to pop an element from stack 1
    public int pop1() {
        if (isEmpty1()) {
            System.out.println("Stack 1 is empty. Cannot pop element.");
            return -1;
        }
        return array[top1--];
    }

    // Function to pop an element from stack 2
    public int pop2() {
        if (isEmpty2()) {
            System.out.println("Stack 2 is empty. Cannot pop element.");
            return -1;
        }
        return array[top2++];
    }

    public static void main(String[] args) {
        DoubleStack ds = new DoubleStack(5);
        ds.push1(1);
        ds.push1(2);
        ds.push2(3);
        ds.push2(4);
        System.out.println(ds.pop1());  // Output: 2
        System.out.println(ds.pop2());  // Output: 4
    }
}
