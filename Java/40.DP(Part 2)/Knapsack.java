
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
  public static void main(String[] args) {
    int val[]={15,14,10,45,30};
    int wt[]={2,5,1,3,4};
    int w=7;
    System.out.println(knapsackRec(val, wt, w, val.length));
  }
}
