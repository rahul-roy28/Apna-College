import java.util.*;
public class LCS {
  public static int rec(String str1, String str2, int n, int m){
    if (n==0 || m==0) {
      return 0;
    }
    if (str1.charAt(n-1) == str2.charAt(m-1)) {
      return rec(str1, str2, n-1, m-1)+1;
    }else{
      int ans1=rec(str1, str2, n-1, m);
      int ans2=rec(str1, str2, n, m-1);
      return Math.max(ans1, ans2);
    }
  }
  public static int memo(String str1, String str2, int n, int m,int dp[][]){
    if (n==0 || m==0) {
      return 0;
    }
    if (dp[n][m] != -1) {
      return dp[n][m];
    }
    if (str1.charAt(n-1) == str2.charAt(m-1)) {
      return dp[n][m] = memo(str1, str2, n-1, m-1, dp)+1;
    }else{
      int ans1=memo(str1, str2, n-1, m,dp);
      int ans2=memo(str1, str2, n, m-1,dp);
      return dp[n][m] = Math.max(ans1, ans2);
    }
  }
  public static int tab(String text1, String text2) {
    int n=text1.length();
        int m=text2.length();
        //Tabulation
        int dp[][]=new int[n+1][m+1];
        for(int i=0;i<dp.length;i++){
            dp[i][0]=0;
        }
        for(int j=0;j<dp[0].length;j++){
            dp[0][j]=0;
        }
        for(int i=1;i<n+1;i++){
            for(int j=1;j<m+1;j++){
                if(text1.charAt(i-1) == text2.charAt(j-1)){
                    dp[i][j]=dp[i-1][j-1]+1;
                }else{
                    int ans1=dp[i-1][j];
                    int ans2=dp[i][j-1];
                    dp[i][j]=Math.max(ans1,ans2);
                }
            }
        }
        return dp[n][m];      
  }      
  public static void main(String[] args) {
    String str1="abcdge";
    String str2="abdg";
    int n=str1.length();
    int m=str2.length();
    //For memoization
    int dp[][]=new int[n+1][m+1];
    for(int i=0;i<n+1;i++){
      for(int j=0;j<m+1;j++){
        dp[i][j]=-1;
      }
    }
    System.out.println(rec(str1, str2, n, m));
    System.out.println(memo(str1, str2, n, m, dp));
    System.out.println(tab(str1, str2));
  }
}
