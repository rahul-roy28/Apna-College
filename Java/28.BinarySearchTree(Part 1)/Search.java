public class Search {
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
  public static boolean search(Node root,int key){
    if (root==null) {
      return false;
    }
    if (root.data==key) {
      return true;
    }
    if (root.data>key) {
      return search(root.left, key);
    }else{
      return search(root.right, key);
    }
  }
  public static void inorder(Node root){
    if (root==null) {
      return;
    }
    inorder(root.left);
    System.out.print(root.data+" ");
    inorder(root.right);
  }
  public static void main(String[] args) {
   int values[]={8,5,10,3,6,11,1,4,14};
    Node root=null;
    for(int i=0;i<values.length;i++){
      root=insert(root, values[i]);
    }
    int key=7;
    System.out.println(search(root, key));
    inorder(root);
 } 
}
