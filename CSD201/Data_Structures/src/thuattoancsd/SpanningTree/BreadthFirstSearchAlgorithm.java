package thuattoancsd.SpanningTree;

import java.util.*;

public class BreadthFirstSearchAlgorithm {

    private int V; // number of vertices
    private LinkedList<Integer> adj[]; // adjacency list

    // constructor
    BreadthFirstSearchAlgorithm(int v) {
        V = v;
        adj = new LinkedList[v];
        for (int i = 0; i < v; ++i) {
            adj[i] = new LinkedList();
        }
    }

    // function to add an edge into the graph
    void addEdge(int v, int w) {
        adj[v].add(w);
    }

    // BFS traversal starting from vertex s
    void BFS(int s) {
        // create a boolean visited array to track visited vertices
        boolean visited[] = new boolean[V];

        // create a queue for BFS
        LinkedList<Integer> queue = new LinkedList<>();

        // mark the current node as visited and enqueue it
        visited[s] = true;
        queue.add(s);

        while (!queue.isEmpty()) {
            // dequeue a vertex from the queue and print it
            s = queue.poll();
            System.out.print(s + " ");

            // get all adjacent vertices of the dequeued vertex s
            // if an adjacent vertex w has not been visited, mark it as visited and enqueue it
            Iterator<Integer> i = adj[s].listIterator();
            while (i.hasNext()) {
                int n = i.next();
                if (!visited[n]) {
                    visited[n] = true;
                    queue.add(n);
                }
            }
        }
    }

    // main method to test the BFS algorithm
    public static void main(String args[]) {
        BreadthFirstSearchAlgorithm graph = new BreadthFirstSearchAlgorithm(4);

        /*
            0
           / \
          1---2
           \ /
            3
         */
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 2);
        graph.addEdge(2, 0);
        graph.addEdge(2, 3);
        graph.addEdge(3, 3);

        System.out.println("BFS traversal starting from vertex 2:");
        graph.BFS(2);
    }
}
