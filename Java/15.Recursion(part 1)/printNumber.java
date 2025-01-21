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
  // Find factorial of N
  public static int fact(int n) {
    if(n==0){
      return 1;
    }
    fact(n-1);
    int fc=n* fact(n-1);
    return fc;
  }
  // Print sum of first n natural numbers
  public static int sum(int n) {
    if(n==1){
      return 1;
    }
    sum(n-1);
    int sm=n + sum(n-1);
    return sm;
  }
  // Print Nth Fibonacci number
  public static int fib(int n) {
    if(n==0 || n==1){
      return n;
    }
    int fib1=fib(n-1);
    int fib2=fib(n-2);
    int fb=fib1+fib2;
    return fb;
  }
  // Check if a given array is sorted or not
  public static boolean isSorted(int arr[], int i) {
    if(i==arr.length-1){
      return true;
    }
    if(arr[i]>arr[i+1]){
      return false;
    }
    return isSorted(arr, i+1);
  }
  public static int first(int arr[],int i,int key) {
    if(arr[i]==arr.length){
      return -1;
    }
    if(arr[i]==key){
      return i;
    }
    return first(arr, i+1,key);
  }
  public static void main(String[] args) {
    // int n=5;
    int arr[]={1,2,9,4,5};
    System.out.println(first(arr, 0, 7));
    // printInc(n);
    // System.out.println();
    // printDec(n);
    // System.out.println(fact(n));
    // System.out.println(sum(n));
    // System.out.println(fib(n));

  }
}