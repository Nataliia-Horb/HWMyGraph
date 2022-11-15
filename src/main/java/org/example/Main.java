package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        /**
         * В задании я взяла в качестве узлов обьекты, (хотелось усложнить задачу на уроке, где в качестве
         * значений узлов были int). У моих узлов есть имя в виде буквы и какое-то int значение
         * Также мне надо было реализовать ребра, которые имеют вес(в классе ребро одним из свойств реализован вес ребра).
         * В списке смежности, как я поняла, должны размещаться узлы т.е. первый узел это текущий узел Search,
         * а дальше список всех узлов с которыми есть связи Destinations
         *
         * Потом у меня стал вопрос относительно того, как передать вес ребер в граф,
         * и поэтому я передаю вес ребра в узел Destination
         *
         * Может суть поняла не правильно относительно построения графа, прошу дать обратную связь...
         *
         */
        List<Node> nodes = new ArrayList<>(List.of(new Node("A", 0), new Node("B", 1),
                new Node("C", 2), new Node("D", 3)));


        List<Edge> edges = new ArrayList<>();
        edges.add(new Edge(nodes.get(0), nodes.get(1), 5));
        edges.add(new Edge(nodes.get(0), nodes.get(2), 2));
        edges.add(new Edge(nodes.get(1), nodes.get(2), 8));
        edges.add(new Edge(nodes.get(1), nodes.get(3), 10));
        edges.add(new Edge(nodes.get(2), nodes.get(1), 1));
        edges.add(new Edge(nodes.get(3), nodes.get(0), 2));


        Graph graph = new Graph(edges, nodes);
        graph.print();

    }
}