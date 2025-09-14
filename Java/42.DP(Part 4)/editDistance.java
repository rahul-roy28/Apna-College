public class editDistance {
  public static int minDistance(String word1, String word2) {
    int n=word1.length();
    int m=word2.length();
    int dp[][]=new int[n+1][m+1];
    for(int i=0;i<dp.length;i++){
      for(int j=0;j<dp[0].length;j++){
        if(i==0){
          dp[0][j]=j;
        }
        if(j==0){
          dp[i][0]=i;
        }
      }
    }
    for(int i=1;i<n+1;i++){
      for(int j=1;j<m+1;j++){
        if(word1.charAt(i-1)==word2.charAt(j-1)){
          dp[i][j]=dp[i-1][j-1];
        }else{
          dp[i][j]=Math.min(Math.min(dp[i][j-1],dp[i-1][j]),dp[i-1][j-1])+1;
        }
      }
    }
    return dp[n][m];
  }
  public static void main(String[] args) {
    String s1="intention";
    String s2="execution";
    System.out.print(minDistance(s1, s2));
  }
}
