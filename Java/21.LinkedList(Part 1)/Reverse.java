import java.util.LinkedList;

public class Reverse {
  class Node{
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
  // Add data at the first
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
  // Add data at the last
  public void addLast(int data){
    Node newNode=new Node(data);
    size++;
    if(head==null){
      head=tail=newNode;
      return;
    }
    tail.next=newNode;
    tail=newNode;
  }
  // Print the LL
  public void print(){
    if(head==null){
      System.out.println("LL is empty");
      return;
    }
    Node temp=head;
    while(temp !=null){
      System.out.print(temp.data+"->");
      temp=temp.next;
    }
    System.out.println("null");
  }
  // Reverse a LinkedList
  public void reverse(){
    Node prev=null;
    Node curr=tail=head;
    Node next;
    while(curr != null){
      next=curr.next;
      curr.next=prev;
      prev=curr;
      curr=next;
    }
    head=prev;
  }
  // Find and Remove Nth Node from end
  public void deleteNthFromEnd(int n){
    // Calculate Size
    int sz=0;
    Node temp=head;
    while(temp != null){
      temp=temp.next;
      sz++;
    }

    if(sz==n){
      head=head.next;
      return;
    }

    // sz-n
    int i=1;
    int iToFind=sz-n;
    Node prev=head;
    while(i<iToFind){
      prev=prev.next;
      i++;
    }
    prev.next=prev.next.next;
    return;
  }
 
  public static void main(String[] args) {
    Reverse ll=new Reverse();
    ll.addFirst(4);
    ll.addFirst(3);
    ll.addFirst(2);
    ll.addFirst(1);
    ll.addLast(5);
    ll.addLast(6);
    ll.addLast(7);
    ll.print();
    ll.deleteNthFromEnd(5);
    ll.print();
    ll.reverse();
    ll.print();
  }
}

