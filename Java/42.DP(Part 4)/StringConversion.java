public class StringConversion {
  public static int stringConversion(String s1,String s2){
    int n=s1.length();
    int m=s2.length();
    int lcsAns=lcs(s1,s2);
    return (n-lcsAns)+(m-lcsAns);
  }
  public static int lcs(String text1, String text2) {
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
    String s1="abcdef";
    String s2="aceg";
    System.out.print(stringConversion(s1, s2));
  }
}
