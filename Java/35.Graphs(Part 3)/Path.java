import java.util.*;
public class Path {
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
    graph[0].add(new Edge(0, 3, 1));
    graph[2].add(new Edge(2, 3, 1));

    graph[3].add(new Edge(3, 1, 1));

    graph[4].add(new Edge(4, 0, 1));
    graph[4].add(new Edge(4, 1, 1));

    graph[5].add(new Edge(5, 0, 1));
    graph[5].add(new Edge(5, 2, 1));
  }public static void printAllPaths(ArrayList<Edge>[] graph, int src,int dest, String path){
    if (src==dest) {
      System.out.println(path+dest);
      return;
    }
    for(int i=0;i<graph[src].size();i++){
      Edge e=graph[src].get(i);
      printAllPaths(graph, e.dest, dest, path+src);
    }
  }
  public static void main(String[] args) {
    int v=6;
    ArrayList<Edge>[] graph=new ArrayList[v];
    createGraph(graph);
    printAllPaths(graph, 5, 1, "");
  }
}
