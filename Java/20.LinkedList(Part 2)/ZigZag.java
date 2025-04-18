import java.util.*;
public class ZigZag {
  static class Node {
    int data;
    Node next;
    public Node(int data) {
      this.data = data;
      this.next = null;
    }
  }

  public static Node head;

  // Add first
  public void addFirst(int data) {
    Node newNode = new Node(data);
    newNode.next = head;
    head = newNode;
  }

  // Print list
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

  public void zigZag(){
    // Find Mid
    Node slow=head;//slow =mid
    Node fast=head.next;
    while(fast != null && fast.next != null){
      slow=slow.next;
      fast=fast.next.next;
    }
    //2nd half reverse
    Node rightHead=slow.next;
    slow.next=null;
    Node prev=null;
    Node curr=rightHead;
    Node next;
    while(curr != null){
      next=curr.next;
      curr.next=prev;
      prev=curr;
      curr=next;
    } 
    // alternate merging
    Node lh=head;
    Node rh=prev;
    Node nextL;
    Node nextR;
    while(lh != null && rh != null){
      nextL=lh.next;
      lh.next=rh;
      nextR=rh.next;
      rh.next=nextL;

      lh=nextL;
      rh=nextR;
    }
  }
  public static void main(String[] args) {
    ZigZag ll=new ZigZag();
    ll.addFirst(6);
    ll.addFirst(5);
    ll.addFirst(4);
    ll.addFirst(3);
    ll.addFirst(2);
    ll.addFirst(1);
    ll.print();
    ll.zigZag();
    ll.print();
  }
}

