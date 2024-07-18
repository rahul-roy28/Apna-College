public class Butterfly_pattern {
 public static void butterfly(int n) {
  // 1st Half
  for(int i=1;i<=n;i++){
   // for star
   for(int j=1;j<=i;j++){
    System.out.print("* ");
   }
   // for space :2*(n-i)
   for(int j=1;j<=2*(n-i);j++){
    System.out.print("  ");
   }
   // for star
   for(int j=1;j<=i;j++){
    System.out.print("* ");
   }
   System.out.println();
  }
  // 2nd Half
  for(int i=n;i>=1;i--){
   // for star
   for(int j=1;j<=i;j++){
    System.out.print("* ");
   }
   // for space :2*(n-i)
   for(int j=1;j<=2*(n-i);j++){
    System.out.print("  ");
   }
   // for star
   for(int j=1;j<=i;j++){
    System.out.print("* ");
   }
   System.out.println();
  }
 }
 public static void main(String[] args) {
  butterfly(6);
 }
}
