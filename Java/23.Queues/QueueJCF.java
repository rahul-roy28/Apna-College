import java.util.*;
public class QueueJCF {
  public static void main(String[] args) {
    // Queue<Integer> q=new LinkedList<>(); //Using LinkedList
    Queue<Integer> q=new ArrayDeque<>(); //Using ArrayDeque
    q.add(1);
    q.add(2);
    q.add(3);
    while(!q.isEmpty()){
      System.out.println(q.peek());
      q.remove();
    }
  }
}
