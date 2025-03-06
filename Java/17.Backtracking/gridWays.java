public class gridWays {
  public static void main(String[] args) {
    int n=3,m=3;
    System.out.println(ways(0, 0, n, m));
    System.out.println(simpleWays(n, m));
  }
  public static int ways(int i,int j,int n, int m) {
    // Base case
    if(i==n-1 && j==m-1){
      return 1;
    }else if(i==n || j==m){
      return 0;
    }
    int w1=ways(i, j+1, n, m);
    int w2=ways(i+1, j, n, m);
    return w1+w2;
  }
  // linear lime
  public static int simpleWays(int n, int m) {
    int x=(n-1);
    int y=(m-1);
    int z=x+y;
    int b=fact(z);
    int c=fact(x);
    int d=fact(y);
    return b/(c*d);
  }
  public static int fact(int a) {
    int f=1;
    for(int i=1;i<=a;i++){
      f=f*i;
    }
    return f;
  }
}
