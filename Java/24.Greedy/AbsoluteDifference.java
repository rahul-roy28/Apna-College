import java.util.*;
public class AbsoluteDifference {
  public static void main(String[] args) {
    int A[]={4,1,8,7};
    int B[]={2,3,6,5};
    Arrays.sort(A);
    Arrays.sort(B);
    int minAbs=0;
    for(int i=0;i<A.length;i++){
      minAbs += Math.abs(A[i]-B[i]);
    }
    System.out.println("Minimum Absolute Difference is :"+minAbs);
  }
}
