public class BFS {
    // Node class to represent graph nodes
    static class Node {
        int data;
        Node[] neighbors;
  
        public Node(int data, int numNeighbors) {
            this.data = data;
            this.neighbors = new Node[numNeighbors];
        }
    }
  
    // Queue class to implement BFS
    static class Queue {
        Node[] elements;
        int front, rear, size;
  
        public Queue(int capacity) {
            elements = new Node[capacity];
            front = rear = size = 0;
        }
  
        boolean isEmpty() {
            return size == 0;
        }
  
        boolean isFull() {
            return size == elements.length;
        }
  
        void enqueue(Node node) {
            if (isFull()) {
                System.out.println("Queue is full!");
                return;
            }
            elements[rear] = node;
            rear = (rear + 1) % elements.length;
            size++;
        }
  
        Node dequeue() {
            if (isEmpty()) {
                System.out.println("Queue is empty!");
                return null;
            }
            Node node = elements[front];
            front = (front + 1) % elements.length;
            size--;
            return node;
        }
    }
  
    // BFS algorithm implementation
    static void bfs(Node start) {
        Queue queue = new Queue(10); // create a queue with capacity 10
        boolean[] visited = new boolean[10]; // mark visited nodes
  
        queue.enqueue(start); // add start node to the queue
        visited[start.data] = true;
  
        while (!queue.isEmpty()) {
            Node node = queue.dequeue();
            System.out.print(node.data + " "); // visit node
  
            // add neighbors to the queue
            for (Node neighbor : node.neighbors) {
                if (neighbor != null && !visited[neighbor.data]) {
                    queue.enqueue(neighbor);
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
  
        // perform BFS traversal starting from node 1
        bfs(node1);
    }
  }