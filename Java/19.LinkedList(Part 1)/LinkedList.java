public class LinkedList {
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
  public static int size;  //For calculating LinkedList size

  // Add data at the first
  public void addFirst(int data){
    // Step 1 => Create new Node
    Node newNode=new Node(data);
    size++;
    // When node does'n exists
    if(head==null){
      head=tail=newNode;
      return;
    }
    // Step 2 => newNode next=head;
    newNode.next=head;
    // Step 3 => head=newNode;
    head=newNode;
  }

  // Add data at the last
  public void addLast(int data){
    // Step 1 => Create new Node
    Node newNode=new Node(data);
    size++;
    // When node does'n exists
    if(head==null){
      head=tail=newNode;
      return;
    }
    // Step 2 => tail.next=newNode;
    tail.next=newNode;
    // Step 3 => tail=newNode;
    tail=newNode;
  }
  // Print LinkedList
  public void print(){
    if(head==null){
      System.out.println("LL is empty");
      return;
    }
    Node temp=head;
    while(temp != null){
      System.out.print(temp.data+"->");
      temp=temp.next;
    }
    System.out.println("null");
  }
  // Add data in the Middle
  public void add(int idx,int data){
    if(idx==0){
      addFirst(data);
      return;
    }
    Node newNode=new Node(data);
    size++;
    Node temp=head;
    int i=0;
    while(i<idx-1){
      temp=temp.next;
      i++;
    }
    newNode.next=temp.next;
    temp.next=newNode;
  }

  // Delete data from the first
  public int removeFirst(){
    if(size==0){
      System.out.println("LL is empty");
      return Integer.MIN_VALUE;
    }else if(size==1){
      int val=head.data;
      head=tail=null;
      size=0;
      return val;
    }
    int val=head.data;
    head=head.next;
    size--;
    return val;
  }
  // Delete data from the last
  public int removeLast(){
    if(size==0){
      System.out.println("LL is empty");
      return Integer.MIN_VALUE;
    }else if(size==1){
      int val=head.data;
      head=tail=null;
      size=0;
      return val;
    }
    // prev: i=size-2
    Node prev=head;
    for(int i=0;i<size-2;i++){
      prev=prev.next;
    }
    int val=prev.next.data; //tail.data
    prev.next=null;
    tail=prev;
    size--;
    return val;
  }
  public static void main(String[] args) {
    LinkedList ll=new LinkedList();
    ll.print();
    ll.addFirst(4);
    ll.print();
    ll.addFirst(3);
    ll.print();
    ll.addFirst(2);
    ll.print();
    ll.addFirst(1);
    ll.print();
    ll.addLast(5);
    ll.print();
    ll.addLast(6);
    ll.print();
    ll.addLast(7);
    ll.print();
    ll.addLast(8);
    ll.add(3, 10);  //Add in the Middle
    ll.print();
    System.out.println(ll.size);
    ll.removeFirst();
    ll.print();
    System.out.println(ll.size);
    ll.removeLast();
    ll.print();
    System.out.println(ll.size);
  }
}
