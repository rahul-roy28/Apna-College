import java.util.Arrays;
import java.util.Collections;

public class Inbuilt_sort {
 public static void main(String[] args) {
  int numbers[]={5,4,1,3,2};
  Arrays.sort(numbers);
  for(int i=0;i<numbers.length;i++){
   System.out.print(numbers[i]+", ");
  }
  System.out.println();
  Integer arr[]={5,4,1,3,2};
  Arrays.sort(arr,Collections.reverseOrder());
  for(int i=0;i<numbers.length;i++){
   System.out.print(arr[i]+", ");
  }
 }
}
