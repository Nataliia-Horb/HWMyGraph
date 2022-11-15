package org.example;

import lombok.Data;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

@Data
public class Graph {
    List<List<Node>> adjList = new ArrayList<>();

    public Graph(List<Edge> edges, List<Node> nodes) {


        edges.sort(new Comparator<Edge>() {
            @Override
            public int compare(Edge o1, Edge o2) {
                return o1.src.compareTo(o2.src);
            }
        });

        // создаем связный список для узлов
        for (int i = 0; i <= nodes.size(); i++) {
            adjList.add(i, new LinkedList<>());
        }

        int count = 0;
        Node lastSrcNode = null;
        for (Edge e : edges) {
            if (lastSrcNode != null && !e.src.equals(lastSrcNode)) {
                count++;
            }
            if (adjList.get(count).isEmpty()) {
                adjList.get(count).add(e.src);
                lastSrcNode = e.src;
            }
            adjList.get(count).add(new Node(e.dest.getName(), e.dest.getValue(), e.weight));
        }
    }

    public void print() {
        int source = 0;
        int size = adjList.size();
        if (source < size) {
            do {
                for (int i = 1; i < adjList.get(source).size(); i++) {
                    System.out.print("[" + adjList.get(source).get(0) + "-> " + adjList.get(source).get(i).toString() + "]  ");
                    //System.out.print(node.toString() + " -> ");
                }
                System.out.println();
                source++;
            } while (source < size);
        }
    }
}
