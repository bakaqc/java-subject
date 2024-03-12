package thuattoancsd.SpanningTree;

import java.util.*;

public class DijsktraAlgorithm {

    private static final int INFINITY = Integer.MAX_VALUE;

    public static void dijkstra(int[][] graph, int source) {
        int numNodes = graph.length;
        int[] dist = new int[numNodes];
        boolean[] visited = new boolean[numNodes];

        for (int i = 0; i < numNodes; i++) {
            dist[i] = INFINITY;
            visited[i] = false;
        }

        dist[source] = 0;

        for (int i = 0; i < numNodes - 1; i++) {
            int minDistNode = findMinDistance(dist, visited);
            visited[minDistNode] = true;

            for (int j = 0; j < numNodes; j++) {
                if (!visited[j] && graph[minDistNode][j] != 0 && dist[minDistNode] != INFINITY
                        && dist[minDistNode] + graph[minDistNode][j] < dist[j]) {
                    dist[j] = dist[minDistNode] + graph[minDistNode][j];
                }
            }
        }

        // Print the shortest distances from the source to all other nodes
        for (int i = 0; i < numNodes; i++) {
            System.out.println("Shortest distance from node " + source + " to " + i + ": " + dist[i]);
        }
    }

    private static int findMinDistance(int[] dist, boolean[] visited) {
        int minDist = INFINITY;
        int minDistNode = -1;

        for (int i = 0; i < dist.length; i++) {
            if (!visited[i] && dist[i] < minDist) {
                minDist = dist[i];
                minDistNode = i;
            }
        }

        return minDistNode;
    }

    public static void main(String[] args) {
        int[][] graph = {
            {0, 4, 0, 0, 0, 0, 0, 8, 0},
            {4, 0, 8, 0, 0, 0, 0, 11, 0},
            {0, 8, 0, 7, 0, 4, 0, 0, 2},
            {0, 0, 7, 0, 9, 14, 0, 0, 0},
            {0, 0, 0, 9, 0, 10, 0, 0, 0},
            {0, 0, 4, 14, 10, 0, 2, 0, 0},
            {0, 0, 0, 0, 0, 2, 0, 1, 6},
            {8, 11, 0, 0, 0, 0, 1, 0, 7},
            {0, 0, 2, 0, 0, 0, 6, 7, 0}
        };

        int sourceNode = 0;
        dijkstra(graph, sourceNode);
    }
}
