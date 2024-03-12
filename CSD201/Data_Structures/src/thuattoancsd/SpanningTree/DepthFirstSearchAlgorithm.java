package thuattoancsd.SpanningTree;

import java.util.*;

public class DepthFirstSearchAlgorithm {

    public static class Graph {

        private int vertexCount; // Number of vertices
        private List<List<Integer>> adjacencyList; // Adjacency list representation of the graph

        public Graph(int vertexCount) {
            this.vertexCount = vertexCount;
            this.adjacencyList = new ArrayList<>(vertexCount);

            for (int i = 0; i < vertexCount; ++i) {
                this.adjacencyList.add(new ArrayList<>());
            }
        }

        public void addEdge(int source, int destination) {
            this.adjacencyList.get(source).add(destination);
        }

        public void depthFirstSearch(int startVertex) {
            boolean[] visited = new boolean[vertexCount];

            Stack<Integer> stack = new Stack<>();
            stack.push(startVertex);

            while (!stack.isEmpty()) {
                int currentVertex = stack.pop();

                if (!visited[currentVertex]) {
                    visited[currentVertex] = true;
                    System.out.print(currentVertex + " ");

                    // Push all unvisited neighbors of currentVertex onto the stack
                    List<Integer> neighbors = adjacencyList.get(currentVertex);
                    for (int neighbor : neighbors) {
                        if (!visited[neighbor]) {
                            stack.push(neighbor);
                        }
                    }
                }
            }
        }
    }

    public class DFSExample {

        public static void main(String[] args) {
            Graph graph = new Graph(6);
            graph.addEdge(0, 1);
            graph.addEdge(0, 2);
            graph.addEdge(1, 3);
            graph.addEdge(2, 4);
            graph.addEdge(2, 5);

            System.out.println("Depth-First Traversal (starting from vertex 0):");
            graph.depthFirstSearch(0);
        }
    }

}
