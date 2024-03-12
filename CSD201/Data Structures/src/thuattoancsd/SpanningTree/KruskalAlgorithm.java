package thuattoancsd.SpanningTree;

import java.util.*;

public class KruskalAlgorithm {

    public static class Edge implements Comparable<Edge> {

        public int source, destination, weight;

        public int compareTo(Edge edge) {
            return this.weight - edge.weight;
        }
    }

    public static class Graph {

        public int vertices, edges;
        public ArrayList<Edge> allEdges;

        public Graph(int v, int e) {
            vertices = v;
            edges = e;
            allEdges = new ArrayList<>();
        }

        public void addEdge(int source, int destination, int weight) {
            Edge edge = new Edge();
            edge.source = source;
            edge.destination = destination;
            edge.weight = weight;
            allEdges.add(edge);
        }

        public int findParent(int[] parent, int vertex) {
            if (parent[vertex] != vertex) {
                parent[vertex] = findParent(parent, parent[vertex]);
            }
            return parent[vertex];
        }

        public void union(int[] parent, int x, int y) {
            int xSetParent = findParent(parent, x);
            int ySetParent = findParent(parent, y);
            parent[ySetParent] = xSetParent;
        }

        public void kruskalMST() {
            ArrayList<Edge> result = new ArrayList<>();
            Collections.sort(allEdges);
            int[] parent = new int[vertices];
            for (int i = 0; i < vertices; i++) {
                parent[i] = i;
            }

            int edgeCount = 0;
            int i = 0;
            while (edgeCount < vertices - 1) {
                Edge currentEdge = allEdges.get(i);
                int x = findParent(parent, currentEdge.source);
                int y = findParent(parent, currentEdge.destination);
                if (x != y) {
                    result.add(currentEdge);
                    union(parent, x, y);
                    edgeCount++;
                }
                i++;
            }

            System.out.println("Minimum Spanning Tree:");
            int minimumCost = 0;
            for (Edge edge : result) {
                System.out.println(edge.source + " - " + edge.destination + ", weight: " + edge.weight);
                minimumCost += edge.weight;
            }
            System.out.println("Total minimum cost: " + minimumCost);
        }
    }

    public static void main(String[] args) {
        int vertices = 6;
        int edges = 9;
        Graph graph = new Graph(vertices, edges);

        graph.addEdge(0, 1, 4);
        graph.addEdge(0, 2, 3);
        graph.addEdge(1, 2, 1);
        graph.addEdge(1, 3, 2);
        graph.addEdge(2, 3, 4);
        graph.addEdge(3, 4, 2);
        graph.addEdge(4, 5, 6);
        graph.addEdge(5, 3, 1);
        graph.addEdge(5, 2, 5);

        graph.kruskalMST();
    }
}
