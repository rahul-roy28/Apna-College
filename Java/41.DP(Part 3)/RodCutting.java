import java.util.*;
public class RodCutting {
  public static int profit(int len[],int price[],int Tlen){
    int n=len.length;
    int dp[][]=new int[n+1][Tlen+1];
    for(int i=0;i<dp.length;i++){
      dp[i][0]=0;
    }
    for(int j=0;j<dp[0].length;j++){
      dp[0][j]=0;
    }
    for(int i=1;i<n+1;i++){
      for(int j=1;j<Tlen+1;j++){
        int v=len[i-1];
        int p=price[i-1];
        if (v<=j) {
          int ans1=p+dp[i][j-v];
          int ans2=dp[i-1][j];
          dp[i][j]=Math.max(ans1, ans2);
        }else{
          dp[i][j]=dp[i-1][j];
        }
      }
    }
    return dp[n][Tlen];
  }
  public static void main(String[] args) {
    int length[]={1,2,3,4,5,6,7,8};
    int price[]={1,5,8,9,10,17,17,20};
    int rodLength=8;
    System.out.println(profit(length, price, rodLength));
  }
}
