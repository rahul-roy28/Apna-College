import java.util.ArrayList;

public class MargeBSTs {
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
  public static void inorder(Node root,ArrayList<Integer> order){
    if (root==null) {
      return;
    }
    inorder(root.left, order);
    order.add(root.data);
    inorder(root.right, order);
  }
  public static Node createBST(ArrayList<Integer> ans,int st,int end){
    if (st>end) {
      return null;
    }
    int mid=(st+end)/2;
    Node root=new Node(ans.get(mid));
    root.left=createBST(ans,st,mid-1);
    root.right=createBST(ans,mid+1,end);
    return root;
  }
  public static Node margeBSTs(Node root1, Node root2){
    // BST1 inorder sequence
    ArrayList<Integer> inorder1=new ArrayList<>();
    inorder(root1,inorder1);
    // BST2 inorder sequence
    ArrayList<Integer> inorder2=new ArrayList<>();
    inorder(root2,inorder2);
    // Marge
    int i=0;
    int j=0;
    ArrayList<Integer> ans=new ArrayList<>();
    while(i<inorder1.size() && j<inorder2.size()){
      if (inorder1.get(i)<=inorder2.get(j)) {
        ans.add(inorder1.get(i));
        i++;
      }else{
        ans.add(inorder2.get(j));
        j++;
      }
    }
    while (i<inorder1.size()) {
      ans.add(inorder1.get(i));
      i++;
    }
    while (j<inorder2.size()) {
      ans.add(inorder2.get(j));
      j++;
    }
    // Balanced BST
    return createBST(ans,0,ans.size()-1);
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
    Node root1=new Node(2);
    root1.left=new Node(1);
    root1.right=new Node(4);
    preorder(root1);
    System.out.println();
    Node root2=new Node(9);
    root2.left=new Node(3);
    root2.right=new Node(12);
    preorder(root2);
    System.out.println();
    Node root=margeBSTs(root1, root2);
    preorder(root);


  }
}
