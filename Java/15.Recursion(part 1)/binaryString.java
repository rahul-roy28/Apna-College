/*Write a program in java to print all binary strings of size N without consecutive ones */
public class binaryString {
  public static void printBinStrings(int n, String str, int lastPlace) {
    // Base Case
    if(n==0){
      System.out.println(str);
      return;
    }
    // Work
    printBinStrings(n-1, str+"0", 0);
    if(lastPlace==0){
      printBinStrings(n-1, str+"1", 1);
    }

  }
  /*Write a program in java to print all binary strings of size N without consecutive zeros */
    public static void printBinStringsZeros(int n, String str, int lastPlace) {
      // Base Case
      if(n==0){
        System.out.println(str);
        return;
      } 
      // Work
      printBinStrings(n-1, str+"1", 1);
      if(lastPlace==1){
        printBinStrings(n-1, str+"0", 0);
      }
    }
    
  public static void main(String[] args) {
    int n=3;
    printBinStrings(n, "", 0);
  }
}
