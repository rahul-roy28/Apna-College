import java.util.Arrays;

public class CatalanNumber {
  // Recursion
  public static int cNumRec(int n){
    if(n==0 || n==1){
      return 1;
    }
    int ans=0;
    for(int i=0;i<=n-1;i++){
      ans +=cNumRec(i) * cNumRec(n-1-i);
    }
    return ans;
  }
  public static int cNumMem(int n, int[] dp){
    if (n==0 || n==1) {
      return 1;
    }
    if (dp[n] != -1) {
      return dp[n];
    }
    int ans =0;
    for(int i=0;i<=n-1;i++){
      ans +=cNumMem(i, dp) * cNumMem(n-1-i, dp);
    }
    return dp[n]=ans;
  }
  public static void main(String[] args) {
    int n=40;
    // System.out.println(cNumRec(n));
    int dp[]=new int[n+1];
    Arrays.fill(dp, -1);
    System.out.print(cNumMem(n, dp));
  }
}
