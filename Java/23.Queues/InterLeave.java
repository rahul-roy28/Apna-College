import java.util.*;
import java.util.LinkedList;
public class InterLeave {
  public static void interLeave(Queue<Integer> q){
    int s=q.size();
    if (s % 2 != 0) {
      System.out.println("Queue size must be even for proper interleaving.");
      return;
    }
    int firstS=s/2;
    Queue<Integer> first=new LinkedList<>();
    for(int i=0;i<firstS;i++){
      first.add(q.remove());
    }
    while (!first.isEmpty()) {
      q.add(first.remove());
      q.add(q.remove());
    }
  }
  public static void main(String[] args) {
    Queue<Integer> q=new LinkedList<>();
    q.add(1);
    q.add(2);
    q.add(3);
    q.add(4);
    q.add(5);
    q.add(6);
    q.add(7);
    q.add(8);
    q.add(9);
    q.add(10);
    interLeave(q);
    while (!q.isEmpty()) {
      System.out.print(q.peek()+" ");
      q.remove();
    }
    System.out.println();
  }
}
