public class subarray_print {
 public static void subarray(int numbers[]) {
  for(int i=0;i<numbers.length;i++){
   int start=i;
   for(int j=i;j<numbers.length;j++){
    int end=j;
    for(int k=start;k<=end;k++){
     System.out.print("["+numbers[k]+"]");
    }
    System.out.println();
   }
   System.out.println();
  }
 }
 public static void main(String[] args) {
  int numbers[]={2,4,6,8,10};
  subarray(numbers);
 }
}
