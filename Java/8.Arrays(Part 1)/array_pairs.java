public class array_pairs {
 public static void pairs(int numbers[]) {
  for(int i=0;i<numbers.length;i++){
   int curr=numbers[i];
   for(int j=i+1;j<numbers.length;j++){
    System.out.print("("+curr+","+numbers[j]+")");
   }
   System.out.println();
  }
 }
 public static void main(String[] args) {
  int numbers[]={2,4,6,8,10,12,14,16,18,20,22,24,26,28,30};
  pairs(numbers);
 }
}
