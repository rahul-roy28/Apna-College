public class Bubble_sort {
 public static void bubble(int numbers[]) {
  int n=numbers.length;
  for(int turns=0;turns<n-1;turns++){
   for(int j=0;j<n-1-turns;j++){
    // swap
    if(numbers[j]>numbers[j+1]){
     int temp=numbers[j];
     numbers[j]=numbers[j+1];
     numbers[j+1]=temp;
    }
   }
  }
 }
 public static void main(String[] args) {
  int numbers[]={5,4,1,3,2};
  bubble(numbers);
  for(int i=0;i<numbers.length;i++){
   System.out.print(numbers[i]+", ");
  }
 }
}
