import java.util.*;
public class Treeheight {
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
  public static int height(Node root){
      if(root==null){
        return 0;
      }
      int lh=height(root.left);
      int rh=height(root.right);
      return Math.max(lh, rh)+1;
  }
  public static int NodeCount(Node root){
    if(root==null){
      return 0;
    }
    int lCount=NodeCount(root.left);
    int rCount=NodeCount(root.right);
    return lCount+rCount+1;
  }
  public static int NodeSum(Node root){
    if(root==null){
      return 0;
    }
    int lSum=NodeSum(root.left);
    int rSum=NodeSum(root.right);
    return lSum+rSum+root.data;
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
    System.out.println("Height of the Tree: "+height(root));
    System.out.println("Number of Nodes in this Tree: "+NodeCount(root));
    System.out.println("Sum of Nodes: "+NodeSum(root));
  }
}
