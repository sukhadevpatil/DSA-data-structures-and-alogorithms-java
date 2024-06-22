package graph;

public class Main {
    public static void main(String[] args) {
        Graph graph = new Graph();

        graph.addVertex("A");
        graph.addVertex("B");
        graph.addVertex("C");
        graph.printGraph();

        System.out.println("======================");;

        graph.addEdge("A", "B");
        graph.addEdge("A", "C");
        graph.addEdge("B", "C");
        graph.printGraph();

        System.out.println("======================");

        graph.removeEdge("A", "B");
        graph.printGraph();
        System.out.println("=====================");
        System.out.println("=====================");

        Graph myGraph = new Graph();
        myGraph.addVertex("A");
        myGraph.addVertex("B");
        myGraph.addVertex("C");
        myGraph.addVertex("D");

        myGraph.addEdge("A", "B");
        myGraph.addEdge("A", "C");
        myGraph.addEdge("A", "D");
        myGraph.addEdge("C", "D");
        myGraph.addEdge("B", "D");

        myGraph.printGraph();

        myGraph.removeVertex("D");
        myGraph.printGraph();

        System.out.println("======================");
    }
}
