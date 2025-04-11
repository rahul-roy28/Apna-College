import java.util.*;
public class MargeSort {
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
  // Marge Sort
  public Node margesort(Node head){
    if(head ==null || head.next == null){
      return head;
    }
    // find Mid
    Node mid=findMid(head);
    // left and right MS
    Node rightHead=mid.next;
    mid.next=null;
    Node newLeft=margesort(head);
    Node newRight=margesort(rightHead);
    // Marge
    return marge(newLeft,newRight);
  }
  public Node findMid(Node head){
    Node slow=head;
    Node fast=head.next;
    while(fast != null && fast.next != null){
      slow=slow.next;
      fast=fast.next.next;
    }
    return slow;
  }
  public Node marge(Node head1,Node head2){
    Node margedLL=new Node(-1);
    Node temp=margedLL;
    while(head1 !=null && head2 != null){
      if(head1.data <=head2.data){
        temp.next=head1;
        head1=head1.next;
        temp=temp.next;
      }else{
        temp.next=head2;
        head2=head2.next;
        temp=temp.next;
      }
    }
    while(head1 != null){
      temp.next=head1;
      head1=head1.next;
      temp=temp.next;
    }
    while(head2 != null){
      temp.next=head2;
      head2=head2.next;
      temp=temp.next;
    }
    return margedLL.next;
  }
  public static void main(String[] args) {
    MargeSort ll=new MargeSort();
    ll.addFirst(5);
    ll.addFirst(2);
    ll.addFirst(9);
    ll.addFirst(4);
    ll.addFirst(2);
    ll.print();
    ll.head=ll.margesort(ll.head);
    ll.print();
  }
}
