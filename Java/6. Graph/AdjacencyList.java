import java.util.ArrayList;
import java.util.LinkedList;

public class AdjacencyList {
    private ArrayList<LinkedList<Integer>> adjacencyList;
    private int numVertices;

    // Parameterized constructor
    public AdjacencyList(int numVertices) {
        this.numVertices = numVertices;
        this.adjacencyList = new ArrayList<>(numVertices);

        for (int i = 0; i < numVertices; i++) {
            adjacencyList.add(new LinkedList<>());
        }
    }

    // Method to add an edge to the graph
    public void addEdge(int src, int dest) {
        if (src >= 0 && src < numVertices && dest >= 0 && dest < numVertices) {
            adjacencyList.get(src).add(dest);
            adjacencyList.get(dest).add(src); // For undirected graph
        } else {
            System.out.println("Invalid edge!");
        }
    }

    // Method to display the adjacency list
    public void displayGraph() {
        for (int i = 0; i < numVertices; i++) {
            System.out.print("Vertex " + i + ":");
            for (Integer vertex : adjacencyList.get(i)) {
                System.out.print(" -> " + vertex);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        AdjacencyList graph = new AdjacencyList(5);

        graph.addEdge(0, 1);
        graph.addEdge(0, 4);
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);
        graph.addEdge(2, 3);
        graph.addEdge(3, 4);

        graph.displayGraph();
    }
}
