import java.util.ArrayList;

public class BSTtoBalancedBST {
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
  public static void preorder(Node root){
    if(root==null){
      return;
    }
    System.out.print(root.data+" ");
    preorder(root.left);
    preorder(root.right);
  }
  public static void getInorder(Node root, ArrayList<Integer> inorder){
    if (root==null) {
      return;
    }
    getInorder(root.left, inorder);
    inorder.add(root.data);
    getInorder(root.right, inorder);
  }
  public static Node createBST(ArrayList<Integer> inorder,int st,int end){
    if (st>end) {
      return null;
    }
    int mid=(st+end)/2;
    Node root=new Node(inorder.get(mid));
    root.left=createBST(inorder, st, mid-1);
    root.right=createBST(inorder, mid+1, end);
    return root;

  }
  public static Node balancedBST(Node root){
    // Inorder Sequence
    ArrayList<Integer> inorder=new ArrayList<>();
    getInorder(root, inorder);
    // Create BST
    root=createBST(inorder, 0, inorder.size()-1);
    return root;
  }
  public static void main(String[] args) {
    Node root = new Node(10);
    
    root.left = new Node(8);
    root.left.left = new Node(6);
    root.left.left.left = new Node(4);
    root.left.left.left.left = new Node(2);
    
    root.right = new Node(15);
    root.right.right = new Node(20);
    root.right.right.right = new Node(25);
    root.right.right.right.right = new Node(30);
    preorder(root);
    System.out.println();
    root=balancedBST(root);
    preorder(root);

  }
}
