public class array_reverse {
 public static void reverse(int numbers[]) {
  int start=0;
  int end=numbers.length-1;
  while (start<end) {
   int temp=numbers[end];
   numbers[end]=numbers[start];
   numbers[start]=temp;
   start++;
   end--;
  }
 }
 public static void main(String[] args) {
  int numbers[]={5,9,2,8,1,6};
  reverse(numbers);
  for(int i=0;i<numbers.length;i++){
   System.out.print(numbers[i]+" ");
  }
 }
}
