public class Hollo_Rhombus {
 public static void hollo_rhombus(int n) {
  for(int i=1;i<=n;i++){
   // for space
   for(int j=1;j<=(n-i);j++){
    System.out.print("  ");
   }
   // Hollo rectangular
   for(int j=1;j<=n;j++){
    if(i==1||i==n||j==1||j==n){
     System.out.print("* ");
    }else{
     System.out.print("  ");
    }
   }
   System.out.println();
  }
 }
 public static void main(String[] args) {
  hollo_rhombus(5);
 }
}
