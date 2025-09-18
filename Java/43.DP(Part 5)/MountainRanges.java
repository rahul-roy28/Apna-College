public class MountainRanges {
  public static int mountain(int n){
    int dp[]=new int[n+1];
    dp[0]=dp[1]=1;
    for(int i=2;i<n+1;i++){
      for(int j=0;j<=i-1;j++){
        int inside=dp[j];
        int outside=dp[i-1-j];
        dp[i] +=inside*outside;
      }
    }
    return dp[n];
  }
  public static void main(String[] args) {
    int n=4;
    System.out.println(mountain(n));
  }
}
