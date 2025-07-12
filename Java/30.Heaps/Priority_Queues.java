import java.util.Comparator;
import java.util.PriorityQueue;
public class Priority_Queues {
  public static void main(String[] args) {
    PriorityQueue<Integer> pq=new PriorityQueue<>();
    // PriorityQueue<Integer> pq=new PriorityQueue<>(Comparator.reverseOrder()); //For Desening order
    pq.add(10);
    pq.add(1);
    pq.add(5);
    pq.add(8);
    pq.add(3);
    pq.add(2);
    while (!pq.isEmpty()) {
      for(int i=0;i<pq.size();i++){
        System.out.println(pq.peek());
        pq.remove();
      }
    }
  }
}
