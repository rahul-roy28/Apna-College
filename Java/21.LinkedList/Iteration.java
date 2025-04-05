import java.util.LinkedList;

public class Iteration {
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
    System.out.println();
  }
  // Search(Iterative) ->Linear Search
  public int iteSearch(int key){
    Node temp=head;
    int i=0;
    while(temp != null){
      if(temp.data==key){
        return i;
      }
      temp=temp.next;
      i++;
    }
    return -1;
  }
  public int recSearch(int key){
    return helper(head,key);
  }
  public int helper(Node head,int key){
    if(head==null){
      return -1;
    }
    if(head.data==key){
      return 0;
    }
    int idx=helper(head.next, key);
    if(idx==-1){
      return -1;
    }
    return idx+1;
  }
  public static void main(String[] args) {
    Iteration ll=new Iteration();
    ll.addFirst(4);
    ll.addFirst(3);
    ll.addFirst(2);
    ll.addFirst(1);
    ll.addLast(5);
    ll.addLast(6);
    ll.addLast(7);
    ll.print();
    System.out.println(ll.iteSearch(4));
    System.out.println(ll.recSearch(4));

  }
}
