public class Stack {

        private int maxSize;
        private int top;
        private int[] array;
    
        // Constructor to initialize the stack
        public Stack(int maxSize) {
            this.maxSize = maxSize;
            this.top = -1;
            this.array = new int[maxSize];
        }
    
        // Function to check if the stack is empty
        public boolean isEmpty() {
            return top == -1;
        }
    
        // Function to check if the stack is full
        public boolean isFull() {
            return top == maxSize - 1;
        }
    
        // Function to push an element onto the stack
        public void push(int data) {
            if (isFull()) {
                System.out.println("Stack is full. Cannot push element.");
                return;
            }
            array[++top] = data;
        }
    
        // Function to pop an element from the stack
        public int pop() {
            if (isEmpty()) {
                System.out.println("Stack is empty. Cannot pop element.");
                return -1;
            }
            return array[top--];
        }
    
        // Function to get the top element of the stack
        public int peek() {
            if (isEmpty()) {
                System.out.println("Stack is empty.");
                return -1;
            }
            return array[top];
        }
    
        // Function to display the stack elements
        public void display() {
            if (isEmpty()) {
                System.out.println("Stack is empty.");
                return;
            }
            for (int i = top; i >= 0; i--) {
                System.out.print(array[i] + " ");
            }
            System.out.println();
        }
    
        public static void main(String[] args) {
            Stack stack = new Stack(5);
            stack.push(1);
            stack.push(2);
            stack.push(3);
            stack.display();  // Output: 3 2 1
            System.out.println(stack.pop());  // Output: 3
            stack.display();  // Output: 2 1
        }
    }
    
