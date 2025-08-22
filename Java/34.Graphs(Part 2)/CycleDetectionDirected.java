import java.util.*;
public class CycleDetectionDirected {
  static class Edge{
    int src;
    int dest;
    int weight;
    public Edge(int s,int d,int w){
      this.src=s;
      this.dest=d;
      this.weight=w;
    }
  }
  public static void createGraph(ArrayList<Edge>[] graph){
    for(int i=0;i<graph.length;i++){
      graph[i]=new ArrayList<>();
    }
    //*****Reurn False ::::::

    // graph[0].add(new Edge(0, 1, 1));
    // graph[0].add(new Edge(0, 2, 1));

    // graph[1].add(new Edge(1, 3, 1));

    // graph[2].add(new Edge(2, 3, 1));
    
    //******Return True ::::::

    graph[0].add(new Edge(0, 2, 1));

    graph[1].add(new Edge(1, 0, 1));

    graph[2].add(new Edge(2, 3, 1));
    
    graph[3].add(new Edge(3, 0, 1));
  }
  public static boolean isCycle(ArrayList<Edge>[] graph){
    boolean vist[]=new boolean[graph.length];
    boolean stack[]=new boolean[graph.length];
    for(int i=0;i<graph.length;i++){
      if (!vist[i]) {
        if (isCycleUtil(graph,i,vist,stack)) {
          return true;
        }
      }
    }
    return false;
  }
  public static boolean isCycleUtil(ArrayList<Edge>[] graph, int curr, boolean[] vist,boolean[] stack){
    vist[curr]=true;
    stack[curr]=true;
    for(int i=0;i<graph[curr].size();i++){
      Edge e=graph[curr].get(i);
      if (stack[e.dest]) {
        return true;
      }
      if (!vist[e.dest]) {
        if (isCycleUtil(graph, e.dest, vist, stack)) {
          return true;
        }
      }
    }
    stack[curr]=false;
    return false;
  }
  public static void main(String[] args) {
    int v=4;
    ArrayList<Edge>[] graph=new ArrayList[v];
    createGraph(graph);
    
    if (isCycle(graph)) {
      System.out.println("Cycle exists in the graph");
    }else {
      System.out.println("No cycle in the graph");
    }

  }
}
