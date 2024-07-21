public class Largest_Smallest {
 public static int large(int numbers[]) {
  int largest=Integer.MIN_VALUE;
  for(int i=0;i<numbers.length;i++){
   if(largest<numbers[i]){
    largest=numbers[i];
   }
  }
  return largest;
 }
 public static int small(int numbers[]) {
  int smallest=Integer.MAX_VALUE;
  for(int i=0;i<numbers.length;i++){
   if(smallest>numbers[i]){
    smallest=numbers[i];
   }
  }
  return smallest;
 }
 
 public static void main(String[] args) {
  int numbers[]={4,9,1,5,2,8,3};
  System.out.println("Largest number is: "+large(numbers));
  System.out.println("Smallest number is: "+small(numbers));
 }
}
