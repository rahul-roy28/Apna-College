/*  Problem Statement
You are given a 2xn board and an infinite number of 2x1 tiles. Your task is to write a function that calculates the number of ways to tile the entire 2xn board using these 2x1 tiles. The tiles can be placed either vertically or horizontally.
*/
public class tilingProblem {
 public static int tiling(int n) {
  if(n==0||n==1){
   return 1;
  }
  // Vertical
  int fnm1=tiling(n-1);
  // Horizontal
  int fnm2=tiling(n-2);
  int ways=fnm1+fnm2;
  return ways;
 }
 public static void main(String[] args) {
  System.out.println(tiling(4));
 } 
}
