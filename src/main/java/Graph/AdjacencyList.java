package Graph;

import java.util.ArrayList;


public class AdjacencyList {

    private ArrayList<ArrayList<Integer>> adj;

    AdjacencyList() {
        this.adj = new ArrayList<>();
    }

    AdjacencyList(int V){
        this.adj = new ArrayList<>(V);
        addVertices(this.adj, V);
    }

    static void addVertices(ArrayList<ArrayList<Integer>> adj, int V) {
        for(int v=0; v<V; v++) {
            adj.add(new ArrayList<>());
        }
    }

    static void addEdge(ArrayList<ArrayList<Integer>> adj, Integer u, Integer v) {
        adj.get(u).add(v);
        adj.get(v).add(u);
    }

    static void printAdjacencyList(ArrayList<ArrayList<Integer>> adj) {
        for(int i=0; i<adj.size(); i++) {
            System.out.print(i + " -> ");

            for (int j=0; j<adj.get(i).size(); j++){
                System.out.print(adj.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }

    public ArrayList<ArrayList<Integer>> getAdjacencyList() {
        return this.adj;
    }


}


