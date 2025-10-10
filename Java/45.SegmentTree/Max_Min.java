public class Max_Min {
  static int tree[];
  public static void init(int n){
    tree=new int[4*n];
  }
  public static void build(int arr[], int i, int si,int sj){
    if (si==sj) {
      tree[i]=arr[si];
      return;
    }
    int mid=(si+sj)/2;
    build(arr, 2*i+1, si, mid);
    build(arr, 2*i+2, mid+1, sj);
    tree[i]=Math.max(tree[2*i+1], tree[2*i+2]);
  }
  public static void main(String[] args) {
    int arr[]={6,8,-1,2,17,1,3,2,4};
    int n=arr.length;
    init(n);
    build(arr, 0, 0, n-1);
    for(int i=0;i<tree.length;i++){
      System.out.print(tree[i]+" ");
    }
  }
}
