package graph;

public class Main {
    public static void main(String[] args) {
        Graph graph = new Graph();

        graph.addVertex("A");
        graph.addVertex("B");
        graph.printGraph();

        System.out.println("======================");;

        graph.addEdge("A", "B");
        graph.printGraph();

        System.out.println("======================");;
    }
}
