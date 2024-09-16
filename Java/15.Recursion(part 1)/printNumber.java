/**
 * printNumber
 */
public class printNumber {
  //Print number in decresing order
  public static void printDec(int n) {
    if(n==1){
      System.out.println(1);
      return;
    }
    System.out.print(n+" ");
    printDec(n-1);
  }
  //print number in increasing order
  public static void printInc(int n) {
    if(n==1){
      System.out.print(1);
      return;
    }
    printInc(n-1);
    System.out.print(" "+n);
    
  }
  public static void main(String[] args) {
    int n=10;
    printInc(n);
    System.out.println();
    printDec(n);
  }
}