package com.liangxibing.algorithms.graph_theory;

import java.util.LinkedList;
import java.util.Scanner;

/**
 * Created by liangxibing on 2016/8/23.
 * Problem: https://www.hackerrank.com/challenges/even-tree
 */
class Graph {
    private LinkedList<Integer>[] adjList;

    /**
     * Initialize each vertex with the adjacency list.
     * @param v the number of the vertices in the graph
     */
    @SuppressWarnings("unchecked")
    Graph(int v) {
        adjList = new LinkedList[v];
        for (int i = 0; i< v; ++i) {
            adjList[i] = new LinkedList<>();
        }
    }

    /**
     * The action to add edge, we will add vertex into related vertex's adjacency list.
     * @param i One vertex that belongs to the edge
     * @param j The other vertex that belongs to the edge
     */
    void addEdge(int i, int j) {
        adjList[i].add(j);
        adjList[j].add(i);
    }

    /**
     *
     * @param i The current vertex.
     * @param visited The array contains the information whether we visit some vertex before.
     * @param weight The number of children(or sub-children) for each vertex.
     * @return
     */
    int generateWeight(int i, boolean[] visited, int[] weight) {
        int temp;
        visited[i] = true;
        weight[i] = 1;
        for (int j = 0; j < adjList[i].size(); ++j) {
            temp = adjList[i].get(j);
            if (!visited[temp]) {
                weight[i] += generateWeight(temp, visited, weight);
            }
        }
        return weight[i];
    }
}

public class Even_Tree {

    /**
     * If one graph contains k even weight vertices, then we can cut at most k - 1 times, Because even - even = even.
     * @param args Not used.
     */
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int result = -1;
        int v1;
        int v2;
        int N = scan.nextInt();
        int M = scan.nextInt();
        Graph graph = new Graph(N);
        boolean[] visited = new boolean[N];
        int[] weight = new int[N];
        for (int i = 0; i < M; ++i) {
            v1 = scan.nextInt() - 1;
            v2 = scan.nextInt() - 1;
            graph.addEdge(v1, v2);
        }
        graph.generateWeight(0, visited, weight);
        for (int i = 0; i < N; ++i) {
            if (0 == weight[i] % 2)
                ++result;
        }
        System.out.println(result);
        scan.close();
    }
}
