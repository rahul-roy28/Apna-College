import java.util.*;
public class StackC {
  static class Node{
    int data;
    Node next;
    public Node(int data){
      this.data=data;
      this.next=null;
    }
  }
  // public static Node tail;
  // public static int size;
  static class stack{
    static Node head=null;

    public static boolean isEmpty(){
      return head==null;
    }
    // push
    public static void push(int data){
      Node newNode=new Node(data);
      if(isEmpty()){
        head=newNode;
        return;
      }
      newNode.next=head;
      head=newNode;
    }
    // pop
    public static int pop(){
      if(isEmpty()){
        return -1;
      }
      int pop=head.data;
      head=head.next;
      return pop; 
    }
    // peek
    public static int peek(){
      if(isEmpty()){
        return -1;
      }
      return head.data;
    }
  }
  public static void main(String[] args) {
    stack s=new stack();
    s.push(0);
    s.push(1);
    s.push(2);
    s.push(3);
    s.push(4);
    s.push(5);
    while (!s.isEmpty()) {
      System.out.println(s.peek());
      s.pop();
    }
  }
}
