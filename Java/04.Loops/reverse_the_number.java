public class reverse_the_number {
 public static void main(String[] args) {
  int n=822002;
  int rev=0;
  while(n>0){
   int last_digit=n%10;
   rev=(rev*10)+last_digit;
   n=n/10;
  }
  System.out.print(rev);
 }
}
