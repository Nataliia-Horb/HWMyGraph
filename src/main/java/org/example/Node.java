package org.example;

import lombok.Data;

@Data
public class Node implements Comparable<Node> {
    String name;
    int value;
    int edgeWeight;


    public Node(String name, int value) {
        this.name = name;
        this.value = value;
        this.edgeWeight = 0;
    }
    public Node(String name, int value, int weight) {
        this.name = name;
        this.value = value;
        this.edgeWeight = weight;
    }

    public String toString() {
        return this.name + "(" + value + "/" + "EW:" + edgeWeight+")";
    }

    @Override
    public int compareTo(Node o) {
        return this.name.compareTo(o.getName());
    }
}
