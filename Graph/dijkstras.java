import java.util.*;

public class dijkstras {
   
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
            graph[0].add(new Edge(0, 1, 2));
            graph[0].add(new Edge(0, 2, 4));
    
            graph[1].add(new Edge(1, 3, 7));
            graph[1].add(new Edge(1, 2, 1));
    
            graph[2].add(new Edge(2, 4, 3));
    
            graph[3].add(new Edge(3, 5, 1));
    
            graph[4].add(new Edge(4, 3, 2));
            graph[4].add(new Edge(4, 5, 5));
        }
    
        static class Pair implements Comparable<Pair> {
            int node, dist;
    
            public Pair(int n, int d) {
                this.node = n;
                this.dist = d;
            }
    
            @Override
            public int compareTo(Pair p2) {
                return this.dist - p2.dist; // Min-heap based on distance
            }
        }
    
        public static void dijkstra(ArrayList<Edge>[] graph, int src, int V) {
            PriorityQueue<Pair> pq=new PriorityQueue<>();
            int dist[]=new int[V];
            Arrays.fill(dist, Integer.MAX_VALUE);
            dist[src]=0;
            pq.add(new Pair(src, 0));
            boolean[] vis=new boolean[V];

            while (!pq.isEmpty()) {
                Pair curr=pq.remove();
                int u=curr.node;
                if (vis[u]) continue;
                vis[u]=true;

                for(Edge e:graph[u]){
                    int v=e.dest;
                    int weight =e.weight;

                    if(dist[u]!=Integer.MAX_VALUE && dist[u]+weight<dist[v]){
                        dist[v]=dist[u]+weight;
                        pq.add(new Pair(v, dist[v]));
                    }
                }

            }
              // Print the shortest distances from source
              System.out.println("Shortest distances from source " + src + ":");
              for (int i = 0; i < V; i++) {
                  System.out.println("Node " + i + " -> " + dist[i]);
              }
            }
    
          
        
    
        public static void main(String[] args) {
            int V = 6;
            ArrayList<Edge>[] graph = new ArrayList[V];
            createGraph(graph);
            dijkstra(graph, 0, V);
        }
    }
    