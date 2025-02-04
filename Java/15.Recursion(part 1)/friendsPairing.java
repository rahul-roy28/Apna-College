/*Problem Statement: Friends Pairing Problem
Given n friends, each friend can either remain single or be paired with another friend. Determine the total number of ways to arrange them.*/
public class friendsPairing {
  public static int pairing(int n) {
    // Base Case
    if(n==1||n==2){
      return n;
    }
    // Choices
    // 1. Single
    int fnm1=pairing(n-1);
    // 2. Pair
    int fnm2=pairing(n-2);
    int pairWays=(n-1)*fnm2;
    // TotalWays
    int total=fnm1+pairWays;
    return total;
  }
  public static void main(String[] args) {
    int n=3;
    System.out.println(pairing(n));
  }
}
