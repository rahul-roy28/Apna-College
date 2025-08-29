import java.util.*;
public class ClimbingStairs {
  public static int ways(int n){
    if (n==0) {
      return 1;
    }
    if (n<0) {
      return 0;
    }
    return ways(n-1) + ways(n-2);
  }
  public static void main(String[] args) {
    int n=5;
    System.out.println(ways(n));
  }
}
