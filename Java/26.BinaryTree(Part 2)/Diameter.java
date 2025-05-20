import java.util.*;
public class Diameter {
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
  public static int diameter(Node root){ //T.C=O(n^2)
    if(root==null){
      return 0;
    }
    int leftDiam=diameter(root.left);
    int leftHt=height(root.left);
    int rightDiam=diameter(root.right);
    int rightHt=height(root.right);
    
    int selfDiam=leftHt+rightHt+1;

    return Math.max(selfDiam, Math.max(leftDiam,rightDiam));
  }
  static class Info{
    int diam;
    int ht;
    public Info(int diam, int ht){
      this.diam=diam;
      this.ht=ht;
    }
  }
  public static Info diameter1(Node root){ //T.C=O(n)
    if(root==null){
      return new Info(0, 0);
    }

    Info leftInfo=diameter1(root.left);
    Info rightInfo=diameter1(root.right);

    int diam=Math.max(Math.max(leftInfo.diam, rightInfo.diam),leftInfo.ht+rightInfo.ht+1);
    int ht=Math.max(leftInfo.ht, rightInfo.ht)+1;
    return new Info(diam, ht);
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
    System.out.println("Diameter of the Tree: "+diameter(root));
    System.out.println("Diameter of the Tree: "+diameter1(root).diam);
    System.out.println("Height of the Tree: "+diameter1(root).ht);
  }
}
