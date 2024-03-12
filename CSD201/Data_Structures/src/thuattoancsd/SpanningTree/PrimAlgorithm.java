package thuattoancsd.SpanningTree;

import java.util.*;


public class PrimAlgorithm {

    private static int[][] primMST(int[][] graph) {
        int n = graph.length;

        // Initialize an array to store the minimum weight of edges
        int[] minWeight = new int[n];
        Arrays.fill(minWeight, Integer.MAX_VALUE);

        // Initialize an array to store the parent of each vertex
        int[] parent = new int[n];
        parent[0] = -1; // Start with the first vertex

        // Initialize a Boolean array to track the vertices included in the MST
        boolean[] included = new boolean[n];

        // Set the weight of the first vertex to 0
        minWeight[0] = 0;

        // Find the minimum spanning tree
        for (int i = 0; i < n - 1; i++) {
            int minVertex = findMinVertex(minWeight, included);
            included[minVertex] = true;

            // Update the minimum weight and parent array
            for (int j = 0; j < n; j++) {
                if (graph[minVertex][j] != 0 && !included[j] && graph[minVertex][j] < minWeight[j]) {
                    parent[j] = minVertex;
                    minWeight[j] = graph[minVertex][j];
                }
            }
        }

        return buildMST(parent, graph);
    }

    private static int findMinVertex(int[] minWeight, boolean[] included) {
        int minVertex = -1;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < minWeight.length; i++) {
            if (!included[i] && minWeight[i] < min) {
                min = minWeight[i];
                minVertex = i;
            }
        }

        return minVertex;
    }

    private static int[][] buildMST(int[] parent, int[][] graph) {
        int n = graph.length;

        int[][] mst = new int[n][n];

        for (int i = 1; i < n; i++) {
            mst[i][parent[i]] = graph[i][parent[i]];
            mst[parent[i]][i] = graph[parent[i]][i];
        }

        return mst;
    }

    public static void main(String[] args) {
        int[][] graph = {{0, 2, 0, 6, 0},
        {2, 0, 3, 8, 5},
        {0, 3, 0, 0, 7},
        {6, 8, 0, 0, 9},
        {0, 5, 7, 9, 0}};

        int[][] mst = primMST(graph);

        for (int i = 0; i < mst.length; i++) {
            for (int j = 0; j < mst[i].length; j++) {
                System.out.print(mst[i][j] + " ");
            }
            System.out.println();
        }
    }
}


