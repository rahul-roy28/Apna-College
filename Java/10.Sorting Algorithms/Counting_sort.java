public class Counting_sort {
 public static void counting(int[] numbers) {
  int largest=Integer.MIN_VALUE;
  for(int i=0;i<numbers.length;i++){
   largest=Math.max(largest, numbers[i]);
  }
  int count[]=new int[largest+1];
  for(int i=0;i<numbers.length;i++){
   count[numbers[i]]++;
  }
  int j=0;
  for(int i=0;i<count.length;i++){
   while (count[i]>0) {
    numbers[j]=i;
    j++;
    count[i]--;
   }
  }
 }
 public static void main(String[] args) {
  int numbers[]={5,4,1,3,2};
  counting(numbers);
  for(int i=0;i<numbers.length;i++){
   System.out.print(numbers[i]+", ");
  }
 }
}
