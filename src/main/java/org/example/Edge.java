package org.example;

import lombok.Data;

import java.util.Comparator;

@Data
public class Edge implements Comparator<Node> {
    Node src;
    Node dest;
    int weight;

    public Edge(Node src, Node dest, int weight) {
        this.src = src;
        this.dest = dest;
        this.weight = weight;
    }

    @Override
    public int compare(Node o1, Node o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
