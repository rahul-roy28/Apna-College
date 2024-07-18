public class inverted_roteted_half_pyramid {
 public static void i_r_h_p(int n) {
  // Outer loop
  for(int i=1;i<=n;i++){
   // For space
   for(int j=1;j<=n-i;j++){
    System.out.print("  ");
   }
   // For star
   for(int j=1;j<=i;j++){
    System.out.print("* ");
   }
   System.out.println();
  }
 }
 public static void main(String[] args) {
  i_r_h_p(9);
 }
}
