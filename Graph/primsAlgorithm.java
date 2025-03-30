import java.util.*;
public class primsAlgorithm {
    static class Edge {
        int src, dest, weight;

        public Edge(int s, int d, int w) {
            this.src = s;
            this.dest = d;
            this.weight = w;
        }
    }

    public static void createGraph(ArrayList<Edge>[] graph) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new Edge(0, 1, 10));
        graph[0].add(new Edge(0, 2, 15));
        graph[0].add(new Edge(0, 3, 30));


        graph[1].add(new Edge(1, 0, 10));
        graph[1].add(new Edge(1, 3, 40));

        graph[2].add(new Edge(2, 0, 15));
        graph[2].add(new Edge(2, 3, 50));

        graph[3].add(new Edge(3, 1, 40));
        graph[3].add(new Edge(3, 2, 50));

    }

    public static void prims(ArrayList<Edge> graph[]){
        PriorityQueue<Pair> pq=new PriorityQueue<>();
        boolean vis[]=new boolean[graph.length];
        pq.add(new Pair(0, 0));
        int mstCost=0;
        while (!pq.isEmpty()) {
            Pair curr=pq.remove();
            if (!vis[curr.node]) {
                vis[curr.node]=true;
                mstCost+=curr.cost;
                for (int i = 0; i < graph[curr.node].size(); i++) {
                    Edge e=graph[curr.node].get(i);
                    if (!vis[e.dest]) {
                        pq.add(new Pair(e.dest, e.weight));
                    }
                }
            }
        }
        System.out.println("min cost of mst= "+mstCost);
    }
    static class Pair implements Comparable<Pair> {
        int node, cost;

        public Pair(int n, int c) {
            this.node = n;
            this.cost = c;
        }

        @Override
        public int compareTo(Pair p2) {
            return this.cost - p2.cost; // Min-heap based on distance
        }
    }
    public static void main(String[] args) {
        int V = 4;
        ArrayList<Edge>[] graph = new ArrayList[V];
        createGraph(graph);
       prims(graph);
    }
}

