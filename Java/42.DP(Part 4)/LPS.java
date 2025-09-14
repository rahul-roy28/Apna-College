public class LPS {
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
  public static int lps(String s){
    String s2="";
    for(int i=s.length()-1;i>=0;i--){
      s2+=s.charAt(i);
    }
    return tab(s,s2);
  }
  public static void main(String[] args) {
    String s="cbbd";
    System.out.println(lps(s));
  }
}
