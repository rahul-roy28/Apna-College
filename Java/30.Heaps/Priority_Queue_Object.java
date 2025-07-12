import java.util.*;
public class Priority_Queue_Object {
  static class Student implements Comparable<Student>{
    String name;
    int rank;
    public Student(String name, int rank){
      this.name=name;
      this.rank=rank;
    }
    @Override
    public int compareTo(Student s2){
      return this.rank-s2.rank;
    }
  }
  public static void main(String[] args) {
    PriorityQueue<Student> pq=new PriorityQueue<>();
    // PriorityQueue<Integer> pq=new PriorityQueue<>(Comparator.reverseOrder()); //For Desening order
    pq.add(new Student("Rahul", 200));
    pq.add(new Student("Puja", 150));
    pq.add(new Student("Sajeeb", 27));
    pq.add(new Student("Ayeshee", 320));
    pq.add(new Student("Raj", 78));
    pq.add(new Student("Hillol", 13));
    while (!pq.isEmpty()) {
      for(int i=0;i<pq.size();i++){
        System.out.println(pq.peek().name+"->"+pq.peek().rank);
        pq.remove();
      }
    }
  }
}
