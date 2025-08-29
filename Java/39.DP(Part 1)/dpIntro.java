import java.util.*;
public class dpIntro {
  public static int fiboMemo(int n, int dp[]){
    if (n==0 || n==1) {
      return n;
    }
    if (dp[n] != 0) {
      return dp[n];
    }
    dp[n]=fiboMemo(n-1, dp) + fiboMemo(n-2, dp);
    return dp[n];
  }
  public static int fiboTab(int n){
    int dp[]=new int[n+1];
    dp[1]=1;
    for(int i=2;i<=n;i++){
      dp[i]=dp[i-1]+dp[i-2];
    }
    return dp[n];
  }
  public static void main(String[] args) {
    int n=6;
    int dp[]=new int[n+1];
    System.out.println(fiboMemo(n, dp));
    System.out.println(fiboTab(n));
  }
}
