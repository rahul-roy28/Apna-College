public class palindrome {
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
    // Find mid node of the LL
    public Node findMid(Node head){
      Node slow=head;
      Node fast=head;
      while(fast != null && fast.next != null){
        slow=slow.next; //+1
        fast=fast.next.next; //+2
      }
      return slow;
    }
    // Find Palindrome
    public boolean checkPalindrome(){
      if(head == null || head.next == null){
        return true;
      }
      // Find mid
      Node mid=findMid(head);
      // 2nd half reverse
      Node prev=null;
      Node curr=mid;
      Node next;
      while(curr !=null){
        next=curr.next;
        curr.next=prev;
        prev=curr;
        curr=next;
      }
      Node left=head;
      Node right=prev;
      // Check if 1st half == 2nd half
      while(right !=null){
        if(left.data != right.data){
          return false;
        }
        left=left.next;
        right=right.next;
      }
      return true;
    }
  public static void main(String[] args) {
    palindrome ll=new palindrome();
    ll.addFirst(1);
    ll.addFirst(2);
    ll.addFirst(2);
    ll.addFirst(1);
    ll.print();
    System.out.println(ll.checkPalindrome());
  }
}
