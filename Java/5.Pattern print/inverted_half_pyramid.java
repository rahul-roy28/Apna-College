public class inverted_half_pyramid {
 public static void main(String[] args) {
  int n=4;
  for(int i=1;i<=n;i++){
   for(int j=n;j>=i;j--){
    System.out.print(j);
   }
   System.out.println("");
  }
 }
}
