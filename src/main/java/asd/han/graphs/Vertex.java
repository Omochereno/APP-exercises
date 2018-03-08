package asd.han.graphs;

import java.util.LinkedList;
import java.util.List;

public class Vertex {
    public String name;
    public List<Edge> adj;
    public double dist;
    public Vertex prev;
    public int scratch;

    public Vertex(String name) {
        this.name = name;
        this.adj = new LinkedList<Edge>();
        reset();
    }

    public void reset() {
        this.dist = Graph.INFINITY;
        this.prev = null;
        this.scratch = 0;

    }
}
