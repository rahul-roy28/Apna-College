public class prime_check {
 public static boolean isprime(int n) {
  if(n==2){
   return true;
  }
  for(int i=2;i<=Math.sqrt(n);i++){
   if(n%i==0){
    return false;
   }
  }
  return true;
 }
 public static void primecheck(int n) {
  for(int i=2;i<=n;i++){
   if(isprime(i)){
     System.out.print(i+" ");   
   }
  }
 }
 public static void main(String[] args) {
  primecheck(200);
 }
}
