public class Diagonal_sum {
 public static int diagonal(int matrix[][]) {
  int sum=0;
      
           // Time complexicity = O(n^2)

  // for(int i=0;i<matrix.length;i++){
  //  for(int j=0;j<matrix[0].length;j++){
  //   if(i==j){
  //    sum += matrix[i][j];
  //   }
  //   else if(i+j==matrix.length-1){
  //    sum += matrix[i][j];
  //   }
  //  }
  // }

          // Time complexicity = O(n)
  for(int i=0;i<matrix.length;i++){
   // primary diagonal
   sum +=matrix[i][i];
   // Secondary diagonal
   if(i!=matrix.length-i-1){//i!=j
    sum += matrix[i][matrix.length-i-1];
   }
  }
  return sum;
 }
 public static void main(String[] args) {
  int matrix[][]={{1,2,3,4},
                  {5,6,7,8},
                  {9,10,462,12},
                  {256,14,15,784}
                 };
 int sum= diagonal(matrix); 
 System.out.println(sum);             
 }
}
