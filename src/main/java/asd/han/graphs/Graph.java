package asd.han.graphs;

import java.util.*;

public class Graph {
    public static final double INFINITY = Double.MAX_VALUE;

    public void addEdge(String sourceName, String destName, double cost){

        Vertex v = getVertex(sourceName);
        Vertex w = getVertex(destName);
        v.adj.add(new Edge(w, cost));
    }

    public void printPath(String destName){

        Vertex w = vertexMap.get(destName);
        if(w == null)
            throw new NoSuchElementException();
        else if(w.dist==INFINITY)
            System.out.println(destName + " is unreachable");
        else {
            System.out.print("(Cost is: " + w.dist + ") ");
            printPath(w);
            System.out.println();
        }
    }

    private Vertex getVertex(String vertexName){

        Vertex v = vertexMap.get(vertexName);
        if(v == null){
            v = new Vertex(vertexName);
            vertexMap.put(vertexName, v);
        }
        return v;
    }

    private void printPath(Vertex dest){
        if(dest.prev != null){
            printPath(dest.prev);
            System.out.print(" to ");
        }
        System.out.print(dest.name);
    }

    private void clearAll(){
        for(Vertex v : vertexMap.values())
            v.reset();
    }

    private Map<String, Vertex> vertexMap = new HashMap<String, Vertex>();


    public void unweighted(String startName) {

        clearAll();

        Vertex start = vertexMap.get(startName);
        if(start==null)
            throw new NoSuchElementException("Start vertex not found");

        Queue<Vertex> q = new LinkedList<>();
        q.add(start); start.dist=0;

        while (!q.isEmpty()){
            Vertex v = q.remove();
            for(Edge e : v.adj){
                Vertex w = e.dest;

                if(w.dist == INFINITY) {
                    w.dist = v.dist + 1;
                    w.prev = v;
                    q.add(w);
                }
            }
        }
    }

    public void dijkstra(String startName) {

    }

    public void negative(String startName) {

    }

    public void acyclic(String startName) {

    }
}
