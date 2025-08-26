import java.util.*;
import java.util.LinkedList;
public class Flights {
  static class Edge{
    int src;
    int dst;
    int wt;
    public Edge(int s,int d,int w){
      this.src=s;
      this.dst=d;
      this.wt=w;
    }
  }
  public static void createGraph(int flights[][],ArrayList<Edge>[] graph){
    for(int i=0;i<graph.length;i++){
      graph[i]=new ArrayList<>();
    }

    for(int i=0;i<flights.length;i++){
      int sre=flights[i][0];
      int dst=flights[i][1];
      int wt=flights[i][2];

      Edge e=new Edge(sre, dst, wt);
      graph[sre].add(e);
    }
  }
  static class Info{
    int v;
    int cost;
    int stops;
    public Info(int v,int c,int s){
      this.v=v;
      this.cost=c;
      this.stops=s;
    }
  }
  public static int cheapestFlight(int n,int flights[][],int src,int dst,int k){
    @SuppressWarnings("unchecked")
    ArrayList<Edge> graph[]=new ArrayList[n];
    createGraph(flights, graph);

    int dist[]=new int[n];
    for(int i=0;i<n;i++){
      if (i !=src) {
        dist[i]=Integer.MAX_VALUE;
      }
    }
    Queue<Info> q=new LinkedList<>();
    q.add(new Info(src, 0, 0));

    while (!q.isEmpty()) {
      Info curr=q.remove();
      if (curr.stops>k) {
        break;
      }

      for(int i=0;i<graph[curr.v].size();i++){
        Edge e=graph[curr.v].get(i);
        if (curr.cost+e.wt<dist[e.dst] && curr.stops<=k) {
          dist[e.dst]=curr.cost+e.wt;
          q.add(new Info(e.dst, dist[e.dst], curr.stops+1));
        }
      }
    }
    if (dist[dst] == Integer.MAX_VALUE) {
      return -1;
    }else{
      return dist[dst];
    }

  }
  public static void main(String[] args) {
    int n=4;
    int flights[][]={{0,1,100},{1,2,100},{2,0,100},{1,3,600},{2,3,200}};
    int src=0;
    int dst=3;
    int k=1;
    System.out.println(cheapestFlight(n, flights, src, dst, k));
    
  }
}
