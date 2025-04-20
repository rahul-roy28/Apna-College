import java.util.*;
public class DequeQ {
  public static void main(String[] args) {
    Deque<Integer> dq=new LinkedList<>();
   dq.addFirst(1);
   dq.addFirst(2);
   dq.addLast(3);
   dq.addLast(4);
   System.out.println(dq);
   System.out.println("Deque first element : "+dq.getFirst());
   System.out.println("Deque last element : "+dq.getLast());
   dq.removeFirst();
   dq.removeLast();
   System.out.println(dq);

  }
}
