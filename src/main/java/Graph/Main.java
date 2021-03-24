package Graph;

public class Main {

    public static void main(String args[]) {

        int V = 5;
        AdjacencyList graph = new AdjacencyList(V);
        System.out.println(graph.getAdjacencyList());

        AdjacencyList.addEdge(graph.getAdjacencyList(), 1,2);
        AdjacencyList.addEdge(graph.getAdjacencyList(), 2,3);

        AdjacencyList.printAdjacencyList(graph.getAdjacencyList());
    }
}


