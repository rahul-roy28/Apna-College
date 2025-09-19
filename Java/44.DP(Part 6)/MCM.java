
public class MCM {
  public static int mcmSolution(int arr[], int i, int j){
    if (i==j) {
      return 0;
    }
    int ans=Integer.MAX_VALUE;
    for(int k=i;k<=j-1;k++){
      int cost1=mcmSolution(arr, i, k);//Ai....Ak =>arr[i-1]*arr[k]
      int cost2=mcmSolution(arr, k+1, j);//Ak+1....Aj =>arr[k]*arr[j]
      int cost3=arr[i-1]* arr[k] * arr[j];//Multiolication of cost1 and cost2
      int finalAns=cost1+cost2+cost3;
      ans=Math.min(ans, finalAns);
    }
    return ans;
  }
  public static void main(String[] args) {
    int arr[]={1,2,3,4,3};
    int n=arr.length;
    System.out.println(mcmSolution(arr, 1, n-1));
  }
}
