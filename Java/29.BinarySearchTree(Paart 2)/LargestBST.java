public class LargestBST {
  static class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
      this.data=data;
      this.left=null;
      this.right=null;
    }
  }
  static class Info{
    boolean isBST;
    int size;
    int min;
    int max;
    Info(boolean isBST,int size,int min,int max){
      this.isBST=isBST;
      this.size=size;
      this.min=min;
      this.max=max;
    }
  }
  public static int maxBST=0;
  public static Info largeBST(Node root){
    if (root==null) {
      return new Info(true, 0, Integer.MAX_VALUE, Integer.MIN_VALUE);
    }
    Info leftInfo=largeBST(root.left);
    Info rightInfo=largeBST(root.right);
    int size=leftInfo.size+rightInfo.size+1;
    int min=Math.min(root.data,Math.min(leftInfo.min, rightInfo.min));
    int max=Math.max(root.data,Math.max(leftInfo.max, rightInfo.max));
    if (root.data<=leftInfo.max || root.data>=rightInfo.min) {
      return new Info(false, size, min, max);
    }
    if (leftInfo.isBST && rightInfo.isBST) {
      maxBST=Math.max(size, maxBST);
      return new Info(true, size, min, max);
    }
    return new Info(false, size, min, max);
  }
  public static void main(String[] args) {
    Node root = new Node(50);
    
    root.left = new Node(30);
    root.left.left = new Node(5);
    root.left.right = new Node(20);
    
    root.right = new Node(60);
    root.right.right = new Node(70);
    root.right.left = new Node(45);
    root.right.right.right = new Node(80);
    root.right.right.left = new Node(65);
    Info info=largeBST(root);
    System.out.println("Largest BST Size: "+maxBST);
  }
}
