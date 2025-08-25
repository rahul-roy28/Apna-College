import java.util.*;
public class Prim {
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
    graph[0].add(new Edge(0,1,2));
    graph[0].add(new Edge(0,3,1));

    graph[1].add(new Edge(1,0,2));
    graph[1].add(new Edge(1,2,3));
    graph[1].add(new Edge(1,3,2));
    graph[1].add(new Edge(1,4,4));

    graph[2].add(new Edge(2,1,3));
    graph[2].add(new Edge(2,4,5));

    graph[3].add(new Edge(3,0,1));
    graph[3].add(new Edge(3,1,2));
    graph[3].add(new Edge(3,4,3));
    graph[3].add(new Edge(3,5,8));

    graph[4].add(new Edge(4,1,4));
    graph[4].add(new Edge(4,2,5));
    graph[4].add(new Edge(4,3,3));
    graph[4].add(new Edge(4,5,7));
    graph[4].add(new Edge(4,6,9));

    graph[5].add(new Edge(5,3,8));
    graph[5].add(new Edge(5,4,7));
    graph[5].add(new Edge(5,6,6));

    graph[6].add(new Edge(6,4,9));
    graph[6].add(new Edge(6,5,6));
  }
  static class Pair implements Comparable<Pair>{
    int v;
    int cost;
    public Pair(int v,int c){
      this.v=v;
      this.cost=c;
    }
    @Override
    public int compareTo(Pair p2){
      return this.cost-p2.cost;
    }
  }
  public static void mst(ArrayList<Edge>[] graph){
    boolean vist[]=new boolean[graph.length];
    PriorityQueue<Pair> pq=new PriorityQueue<>();
    pq.add(new Pair(0, 0));

    int finalCost=0;
    ArrayList<Integer> al=new ArrayList<>();
    while (!pq.isEmpty()) {
      Pair curr=pq.remove();
      if (!vist[curr.v]) {
        vist[curr.v]=true;
        finalCost +=curr.cost;
        al.add(curr.v);

        for(int i=0;i<graph[curr.v].size();i++){
          Edge e=graph[curr.v].get(i);
          if (!vist[e.dest]) {
            pq.add(new Pair(e.dest, e.weight));
          }
        }
      }
    }
    System.out.println("Final(min) cost of MST : "+finalCost);
    for(int i=0;i<al.size();i++){
      System.out.print(al.get(i)+" ");
    }
  }
  public static void main(String[] args) {
    int v=7;
    @SuppressWarnings("unchecked")
    ArrayList<Edge>[] graph=new ArrayList[v];
    createGraph(graph);
    mst(graph);
  }
}
