import java.util.*;
public class TargetSum {
  public static boolean targetSumSubset(int val[],int sum){
      int n=val.length;
      boolean dp[][]=new boolean[n+1][sum+1];
      for(int i=0;i<dp.length;i++){
        dp[i][0]=true;
      }

      for(int i=1;i<n+1;i++){
        for(int j=1;j<sum+1;j++){
          int v=val[i-1];
          if (v<=j && dp[i-1][j-v]==true) {
            dp[i][j]=true;
          }else if (dp[i-1][j]==true) {
            dp[i][j]=true;
          }
        }
      }
      return dp[n][sum];
  }
  public static void main(String[] args) {
    int arr[]={4,2,7,1,3};
    int target=10;
    System.out.println(targetSumSubset(arr, target));
  }
}
