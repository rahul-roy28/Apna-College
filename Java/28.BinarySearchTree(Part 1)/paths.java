import java.util.ArrayList;

public class paths {
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
  public static Node insert(Node root,int val){
    if(root==null){
      root=new Node(val);
      return root;
    }
    if (root.data>val) {
      // Left Subtree
      root.left=insert(root.left, val);
    }else{
      // Right Subtree
      root.right=insert(root.right, val);
    }
    return root;
  }
  public static void inorder(Node root){
    if (root==null) {
      return;
    }
    inorder(root.left);
    System.out.print(root.data+" ");
    inorder(root.right);
  }
  public static void printPath(ArrayList<Integer> path){
    for(int i=0;i<path.size();i++){
      System.out.print(path.get(i)+"->");
    }
    System.out.println("NULL");
  }
  public static void root2Leaf(Node root, ArrayList<Integer> path){
    if (root==null) {
      return;
    }
    path.add(root.data);
    if (root.left==null && root.right==null) {
      printPath(path);
    }
    root2Leaf(root.left, path);
    root2Leaf(root.right, path);
    path.remove(path.size()-1);
  }
  public static void main(String[] args) {
    int values[]={8,5,10,3,6,11,1,4,14};
    Node root=null;
    for(int i=0;i<values.length;i++){
      root=insert(root, values[i]);
    }
    inorder(root);
    System.out.println();
    root2Leaf(root, new ArrayList<>());
  }
}
