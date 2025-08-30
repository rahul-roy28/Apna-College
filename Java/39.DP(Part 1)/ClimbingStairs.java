import java.lang.reflect.Array;
import java.util.*;
public class ClimbingStairs {
  // Recursion
  public static int ways(int n){
    if (n==0) {
      return 1;
    }
    if (n<0) {
      return 0;
    }
    return ways(n-1) + ways(n-2);
  }
  // Memorization
    public static int memWays(int n, int dp[]){
    if (n==0) {
      return 1;
    }
    if (n<0) {
      return 0;
    }
    if (dp[n] !=-1) {
      return dp[n];
    }
    dp[n] = memWays(n-1, dp) + memWays(n-2, dp);
    return dp[n];
  }
  // Tabulation
  public static int tabWays(int n){
    int dp[]=new int[n+1];
    dp[0]=1;
    dp[1]=1;
    for(int i=2;i<=n;i++){
      dp[i]=dp[i-1]+dp[i-2];
    }
    return dp[n];
  }
  public static void main(String[] args) {
    int n=5;
    int dp[]=new int[n+1];
    Arrays.fill(dp, -1);
    System.out.println(ways(n));
    System.out.println(memWays(n, dp));
    System.out.println(tabWays(n));
  }
}
