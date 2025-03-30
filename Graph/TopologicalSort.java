import java.util.*;

public class TopologicalSort {

    static class Edge {
        int src;
        int dest;

        public Edge(int s, int d) {
            this.src = s;
            this.dest = d;
        }

    }

    public static void createGraph(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<Edge>();
        }
        graph[5].add(new Edge(5, 0));
        graph[5].add(new Edge(5, 2));
        graph[4].add(new Edge(4, 1));
        graph[3].add(new Edge(3, 1));
        graph[2].add(new Edge(2, 3));
        graph[0].add(new Edge(0, 1));

    }

    public static void topSortUtil(ArrayList<Edge> graph[], int curr, boolean vis[],Stack<Integer> stack) {
     vis[curr]=true;
     for (int i = 0; i < graph[curr].size(); i++) {
        Edge e=graph[curr].get(i);
        if (!vis[e.dest]) {
            topSortUtil(graph, e.dest, vis, stack);
        }
     }
     stack.push(curr);
    }
    public static ArrayList<ArrayList<Integer>> convertToAdjList(ArrayList<Edge>[] graph, int V) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }
        for (int i = 0; i < V; i++) {
            for (Edge e : graph[i]) {
                adj.get(e.src).add(e.dest);
            }
        }
        return adj;
    }


    static ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> adj) {
        // Your code here
        int indegree[]=new int[adj.size()];
         ArrayList<Integer> topOrder = new ArrayList<>();
        Queue<Integer> queue=new LinkedList<>();
        
        for(int i=0;i<adj.size();i++){
            for(int it:adj.get(i)){
                indegree[it]++;
            }
        }
        for (int i = 0; i < indegree.length; i++) {
            System.out.println("indegree "+indegree[i]);
        }
        for(int i=0;i<adj.size();i++){
            if(indegree[i]==0){
                queue.add(i);
            }
        }
        while(!queue.isEmpty()){
            int node=queue.poll();
            topOrder.add(node);
            
            for(int neighbour:adj.get(node)){
                System.out.print("indegree"+indegree[neighbour]);
                System.out.println();
                indegree[neighbour]--;
                if(indegree[neighbour]==0){
                    queue.add(neighbour);
                }
            }
        }
          if (topOrder.size() != adj.size()) {
            throw new RuntimeException("The graph contains a cycle!");
        }

        return topOrder;
    }
    public static void topSort(ArrayList<Edge> graph[],int V){
        boolean vis[] = new boolean[V];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i <V; i++) {
            if (!vis[i]) {
                topSortUtil(graph, i, vis, stack);
            }
        }
        while (!stack.isEmpty()) {
            System.out.print(stack.pop()+" ");
        }
    }

    public static void main(String[] args) {
        int v = 6;
        ArrayList<Edge> graph[] = new ArrayList[v];
        createGraph(graph);

       topSort(graph, v);
       ArrayList<ArrayList<Integer>> adj = convertToAdjList(graph, v);

        // Call BFS Kahn's Algorithm for Topological Sort
        System.out.print("Topological Sort (BFS - Kahn's Algorithm): ");
        ArrayList<Integer> result = bfs(adj);
        for (int node : result) {
            System.out.print(node + " ");
        }
        System.out.println();
    }
        
    }

