
public class Knapsack {
  public static int knapsackRec(int val[],int wt[],int w,int n){
    if (w==0 || n==0) {
      return 0;
    }
    if (wt[n-1]<=w) {//Valid
      int ans1=val[n-1]+knapsackRec(val, wt, w-wt[n-1], n-1);//Include
      int ans2=knapsackRec(val, wt, w, n-1);//Exclude
      return Math.max(ans1, ans2);
    }else{//Invalid
      return knapsackRec(val, wt, w, n-1);//Exclude
    }
  }
  public static int knapsackMemo(int val[],int wt[],int w,int n,int dp[][]){
    if (w==0 || n==0) {
      return 0;
    }
    if (dp[n][w] != -1) {
      return dp[n][w];
    }
    if (wt[n-1]<=w) {//Valid
      int ans1=val[n-1]+knapsackMemo(val, wt, w-wt[n-1], n-1, dp);//Include
      int ans2=knapsackMemo(val, wt, w, n-1,dp);//Exclude
      dp[n][w] = Math.max(ans1, ans2);
      return dp[n][w];
    }else{//Invalid
      dp[n][w] = knapsackMemo(val, wt, w, n-1,dp);//Exclude
      return dp[n][w];
    }
  }
  public static void main(String[] args) {
    int val[]={15,14,10,45,30};
    int wt[]={2,5,1,3,4};
    int w=7;
    int  dp[][]=new int[val.length+1][w+1];
    for(int i=0;i<dp.length;i++){
      for(int j=0;j<dp[0].length;j++){
        dp[i][j]=-1;
      }
    }
    System.out.println(knapsackRec(val, wt, w, val.length));
    System.out.println(knapsackMemo(val, wt, w, val.length,dp));
  }
}
