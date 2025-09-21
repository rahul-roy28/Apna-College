import java.util.Arrays;

public class ArrayJumps {
  public static int jumps(int arr[]){
    int n=arr.length;
    int dp[]=new int[n];
    Arrays.fill(dp, -1);
    dp[n-1]=0;
    for(int i=n-2;i>=0;i--){
      int jumps=arr[i];
      int ans=Integer.MAX_VALUE;
      for(int j=i+1;j<=i+jumps && j<n;j++){
        if (dp[j] != -1) {
          ans=Math.min(ans, dp[j]+1);
        }
      }
      if (ans != Integer.MAX_VALUE) {
        dp[i]=ans;
      }
    }
    print(dp);
    return dp[0];
  }
  public static void print(int arr[]){
    for(int i=0;i<arr.length;i++){
      System.out.print(arr[i]+"|");
    }
    System.out.println();
  }
  public static void main(String[] args) {
    int arr[]={2,3,1,1,4};
    System.out.println(jumps(arr));
  }
}
