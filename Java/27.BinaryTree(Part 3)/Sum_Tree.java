public class Sum_Tree {
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
 public static int SumTree(Node root){
  if (root==null) {
    return 0;
  }
  int leftTree=SumTree(root.left);
  int rightTree=SumTree(root.right);

  int data=root.data;

  int newleft=root.left==null ? 0:root.left.data;
  int newright=root.right==null ? 0:root.right.data;
  
  root.data=leftTree+newleft+rightTree+newright;
  
  return data;
 }
 public static void preorder(Node root){
  if (root==null) {
    return;
  }
  System.out.print(root.data+" ");
  preorder(root.left);
  preorder(root.right);
 }
  public static void main(String[] args) {
  /*
                 1
                / \
               2   3
             /  \ /  \
            4   56   7
     */
    Node root=new Node(1);
    root.left=new Node(2);
    root.right=new Node(3);
    root.left.left=new Node(4);
    root.left.right=new Node(5);
    root.right.left=new Node(6);
    root.right.right=new Node(7);
    SumTree(root);
    preorder(root);
 } 
}
