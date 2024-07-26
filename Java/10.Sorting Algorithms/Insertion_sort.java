public class Insertion_sort {
 public static void insertion(int[] numbers) {
  for(int i=1;i<numbers.length;i++){
   int currentval=numbers[i];
   int j=i-1;
   while(j>=0 && numbers[j]>currentval){
    numbers[j+1]=numbers[j];
    j--;
   }
   numbers[j+1]=currentval;
  }
 }
 public static void main(String[] args) {
  int numbers[]={5,4,1,3,2};
  insertion(numbers);
  for(int i=0;i<numbers.length;i++){
   System.out.print(numbers[i]+", ");
  }
 }
}
