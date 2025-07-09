public class Mirror {
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
  public static void preorder(Node root){
    if (root==null) {
      return;
    }
    System.out.print(root.data+" ");
    preorder(root.left);
    preorder(root.right);
  }
  public static Node mirrorBST(Node root){
    if (root==null) {
      return null;
    }
    Node leftMirror=mirrorBST(root.left);
    Node rightMirror=mirrorBST(root.right);

    root.left=rightMirror;
    root.right=leftMirror;
    
    return root;
  }
  public static void main(String[] args) {
    int values[]={8,5,10,3,6,11,1,4,14};
    Node root=null;
    for(int i=0;i<values.length;i++){
      root=insert(root, values[i]);
    }
    preorder(root);
    System.out.println();
    root=mirrorBST(root);
    preorder(root);
  }
}
