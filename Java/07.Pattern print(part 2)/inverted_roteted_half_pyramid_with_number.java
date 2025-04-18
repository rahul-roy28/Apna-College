public class inverted_roteted_half_pyramid_with_number {
 public static void i_r_h_p_w_num(int n) {
  for(int i=1;i<=n;i++){
   for(int j=1;j<=n-i+1;j++){
    System.out.print(j+" ");
   }
   System.out.println();
  }
 }
 public static void main(String[] args) {
  i_r_h_p_w_num(7);
 }
}
