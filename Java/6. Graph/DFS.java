public class DFS {
    // Node class to represent graph nodes
    static class Node {
        int data;
        Node[] neighbors;

        public Node(int data, int numNeighbors) {
            this.data = data;
            this.neighbors = new Node[numNeighbors];
        }
    }

    // Stack class to implement DFS
    static class Stack {
        Node[] elements;
        int top, size;

        public Stack(int capacity) {
            elements = new Node[capacity];
            top = size = 0;
        }

        boolean isEmpty() {
            return size == 0;
        }

        boolean isFull() {
            return size == elements.length;
        }

        void push(Node node) {
            if (isFull()) {
                System.out.println("Stack is full!");
                return;
            }
            elements[top] = node;
            top = (top + 1) % elements.length;
            size++;
        }

        Node pop() {
            if (isEmpty()) {
                System.out.println("Stack is empty!");
                return null;
            }
            top = (top - 1 + elements.length) % elements.length;
            Node node = elements[top];
            size--;
            return node;
        }
    }

    // DFS algorithm implementation
    static void dfs(Node start) {
        Stack stack = new Stack(10); // create a stack with capacity 10
        boolean[] visited = new boolean[10]; // mark visited nodes

        stack.push(start); // add start node to the stack
        visited[start.data] = true;

        while (!stack.isEmpty()) {
            Node node = stack.pop();
            System.out.print(node.data + " "); // visit node

            // add neighbors to the stack
            for (Node neighbor : node.neighbors) {
                if (neighbor != null && !visited[neighbor.data]) {
                    stack.push(neighbor);
                    visited[neighbor.data] = true;
                }
            }
        }
    }

    public static void main(String[] args) {
        // create a sample graph
        Node node1 = new Node(1, 3);
        Node node2 = new Node(2, 2);
        Node node3 = new Node(3, 2);
        Node node4 = new Node(4, 2);
        Node node5 = new Node(5, 1);

        node1.neighbors[0] = node2;
        node1.neighbors[1] = node3;
        node1.neighbors[2] = node4;

        node2.neighbors[0] = node5;
        node2.neighbors[1] = null; // no second neighbor

        node3.neighbors[0] = node5;
        node3.neighbors[1] = null; // no second neighbor

        node4.neighbors[0] = node5;
        node4.neighbors[1] = null; // no second neighbor

        // perform DFS traversal starting from node 1
        dfs(node1);
    }
}