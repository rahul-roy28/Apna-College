public class minimumPartitioning {
   public static int minimumDifference(int[] nums) {
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        int n=nums.length;
        int W=(sum/2);
        int dp[][]=new int[n+1][W+1];
        for(int i=1;i<n+1;i++){
            for(int j=1;j<W+1;j++){
                int v=nums[i-1];
                int w=nums[i-1];
                if(w<=j){
                    int inc=v+dp[i-1][j-w];
                    int exc=dp[i-1][j];
                    dp[i][j]=Math.max(inc,exc);
                }else{
                    dp[i][j]=dp[i-1][j];
                }
            }
        }
        int sum1=dp[n][W];
        int sum2=sum-sum1;
        return Math.abs(sum1-sum2);
    }
  public static void main(String[] args) {
    int numbers[]={1,6,11,5};
    System.out.println(minimumDifference(numbers));
  }
}
