import java.util.Scanner;

public class Arrays_Creation {
 public static boolean search(int matrix[][], int key) {
  for(int i=0;i<matrix.length;i++){
   for(int j=0;j<matrix[0].length;j++){
    if(matrix[i][j]==key){
     System.out.println("Key found at cell no. ("+i+","+j+")");
     return true;
    }
   }
  }
  System.out.println("Key not found");
  return false;
 }
 public static void main(String[] args) {
  int matrix[][]=new int[3][3];
  int n=matrix.length, m=matrix[0].length;

  // input
  Scanner sc=new Scanner(System.in);
  for(int i=0;i<n;i++){
   for(int j=0;j<m;j++){
    matrix[i][j]=sc.nextInt();
   }
  }
  sc.close();
  // Output
  for(int i=0;i<n;i++){
   for(int j=0;j<m;j++){
    System.out.print(matrix[i][j]+" ");
   }
   System.out.println();
  }
  search(matrix, 5);
 }
}