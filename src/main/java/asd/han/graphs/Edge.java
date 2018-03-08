package asd.han.graphs;

public class Edge implements Comparable<Edge>{
    public Vertex dest;
    public double cost;

    public Edge(Vertex d, double c){
        this.dest = d;
        this.cost = c;
    }

    @Override
    public int compareTo(Edge o) {
        double otherCost = o.cost;

        return cost < otherCost ? -1 : cost > otherCost ? 1 : 0;
    }
}
