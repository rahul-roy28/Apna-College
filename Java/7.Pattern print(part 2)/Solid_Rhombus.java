public class Solid_Rhombus {
 public static void rhombus(int n) {
  for(int i=1;i<=n;i++){
   // For space: (n-i)
   for(int j=1;j<=(n-i);j++){
    System.out.print("  ");
   }
   // For star
   for(int j=1;j<=n;j++){
    System.out.print("* ");
   }
   System.out.println();
  }
 }
 public static void main(String[] args) {
  rhombus(9);
 }
}
