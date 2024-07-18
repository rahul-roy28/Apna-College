public class Hollo_Rectangular {
 public static void hollo_rectangle(int row,int col) {
  // outer loop
  for(int i=1;i<=row;i++){
   // inner loop
   for(int j=1;j<=col;j++){
    // cel=(i,j)
    if(i==1||i==row||j==1||j==col){
     // boundary condition
     System.out.print("*"); 
    }else{
     System.out.print(" ");
    }
   }
   System.out.println();
  }
 }
 public static void main(String[] args) {
  hollo_rectangle(4, 20);
 }
}
