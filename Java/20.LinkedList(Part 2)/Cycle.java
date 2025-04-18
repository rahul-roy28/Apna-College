public class Cycle{
  static class Node{
    int data;
    Node next;
    public Node(int data){
      this.data=data;
      this.next=null;
    }
  }
  public static Node head;
  public static Node tail;
  public static int size;
  // Add first
  public void addFirst(int data){
    Node newNode=new Node(data);
    size++;
    if(head==null){
      head=tail=newNode;
      return;
    }
    newNode.next=head;
    head=newNode;
  }
  // Print the LL
  public void print(){
    if(head==null){
      System.out.println("LL is empty");
    }
    Node temp=head;
    while(temp != null){
      System.out.print(temp.data+"->");
      temp=temp.next;
    }
    System.out.println("null");
  }
  // Find Cycle
  public static boolean isCycle(){
    Node slow=head;
    Node fast=head;
    while(fast != null && fast.next != null){
      slow=slow.next;
      fast=fast.next.next;
      if(slow == fast){
        return true;
      }
    }
    return false;
  }
  // Remove cycle
  public static void removecycle(){
    Node slow=head;
    Node fast=head;
    boolean cycle=false;
    while(fast != null && fast.next != null){
      slow=slow.next;
      fast=fast.next.next;
      if(slow == slow){
        cycle=true;
        break;
      }
    }
    if(cycle==false){
      return;
    }
    // find meeting point
    slow=head;
    Node prev=null;
    while(slow != fast){
      prev=fast;
      slow=slow.next;
      fast=fast.next;
    }
    // remove cycle 
    prev.next=null;
  }
  public static void main(String[] args) {
    head=new Node(1);
    Node temp=new Node(2);
    head.next=temp;
    head.next.next=new Node(3);
    head.next.next.next=temp;
    System.out.println(isCycle());
    removecycle();
    System.out.println(isCycle());
  }
}