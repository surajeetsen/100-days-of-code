package com.algos.datastructure;

import java.util.LinkedList;
import java.util.StringJoiner;

public class MyGraph {
    public static void main(String[] args) {
        MyGraph graph = new MyGraph(3);

        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 2);

        System.out.println(graph);
    }

    int V;
    LinkedList<Integer>[] adjList;

    MyGraph(int V) {
        this.V = V;
        adjList = new LinkedList[V];

        for(int i = 0; i < V; i++) {
            adjList[i] = new LinkedList<>();
        }
    }

    public void addEdge(int src, int dest) {
        this.adjList[src].addFirst(dest);
        this.adjList[dest].addFirst(src);
    }

    @Override
    public String toString() {
        StringJoiner sj = new StringJoiner("\n");

        for(int i = 0; i < V; i++) {
            StringJoiner list = new StringJoiner("->");
            list.add(String.valueOf(i));
            for(int node : adjList[i]) {
                list.add(String.valueOf(node));
            }
            sj.add(list.toString());
        }

        return sj.toString();
    }
}
