package asd.han.graphs;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) {
    Graph g = new Graph();
    try {
        FileReader fin = new FileReader(args[0]);
        Scanner graphFile = new Scanner(fin);

        // Read the edges and insert
        String line;
        while(graphFile.hasNextLine()){
            line = graphFile.nextLine();
            StringTokenizer st = new StringTokenizer(line);

            try {
                if (st.countTokens() != 3){
                    System.err.println("Skipping bad line " + line);
                    continue;
                }
                String source = st.nextToken();
                String dest = st.nextToken();
                int cost = Integer.parseInt(st.nextToken());
                g.addEdge(source, dest, cost);
            } catch (NumberFormatException e) {
                System.err.println("Skipping bad line " + line);
            }
        }
    } catch (IOException e) {
        System.err.println(e);
    }
    System.out.println("File read...");

    Scanner in = new Scanner(System.in);
    while( processRequest(in, g));
    }

    private static boolean processRequest(Scanner in, Graph g) {

        try {
            System.out.print("Enter start node:");
            String startName = in.nextLine();

            System.out.print("Enter destination node:");
            String destName = in.nextLine();

            System.out.print("Enter algorithm (u, d, n, a): ");
            String alg = in.nextLine();

            if(alg.equals("u"))
                g.unweighted(startName);
            else if(alg.equals("d"))
                g.dijkstra(startName);
            else if(alg.equals("n"))
                g.negative(startName);
            else if(alg.equals("a"))
                g.acyclic(startName);

            g.printPath(destName);
        } catch (NoSuchElementException e) {
            return false;
        } catch (GraphException e){
            System.err.println(e);
        }
        return true;
    }
}
