import java.util.*;
public class Subarray {
  public static void main(String[] args) {
    int arr[]={15,-2,2,-8,1,7,10};
    HashMap<Integer,Integer> hm=new HashMap<>();

    int sum=0;
    int len=0;

    for(int j=0;j<arr.length;j++){
      sum +=arr[j];
      if (hm.containsKey(sum)) {
        len =Math.max(len, j-hm.get(sum));
      }else{
        hm.put(sum, j);
      }
    }
    System.out.println("Largest Subarray with 0 sum -> "+len);
  }
}
