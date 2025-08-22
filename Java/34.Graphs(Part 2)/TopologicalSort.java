import java.util.*;
public class TopologicalSort {
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
    graph[2].add(new Edge(2, 3, 1));

    graph[3].add(new Edge(3, 1, 1));

    graph[4].add(new Edge(4, 0, 1));
    graph[4].add(new Edge(4, 1, 1));

    graph[5].add(new Edge(5, 0, 1));
    graph[5].add(new Edge(5, 2, 1));
  }
  public static void topSort(ArrayList<Edge>[] graph){
    boolean vist[]=new boolean[graph.length];
    Stack<Integer> s=new Stack<>();
    for(int i=0;i<graph.length;i++){
      if (!vist[i]) {
        topSortUtil(graph,i,vist,s);
      }
    }
    while (!s.isEmpty()) {
      System.out.print(s.pop()+" ");
    }
  }
  public static void topSortUtil(ArrayList<Edge>[] graph, int curr,boolean[] vist,Stack<Integer> s){
    vist[curr]=true;
    for(int i=0;i<graph[curr].size();i++){
      Edge e=graph[curr].get(i);
      if (!vist[e.dest]) {
        topSortUtil(graph, e.dest, vist,s);
      }
    }
    s.push(curr);
  }
  public static void main(String[] args) {
    int v=6;
    ArrayList<Edge>[] graph=new ArrayList[v];
    createGraph(graph);
    topSort(graph);
  }
}
