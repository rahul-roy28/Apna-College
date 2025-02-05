public class practice {
  /*For a given integer array of size N. You have to find all the occurrences(indices) of a given element(Key) and print them. Use a recursive function to solve this problem. */
  public static void q1(int arr[], int i, int key) {
    // Base Case
    if(i==arr.length){
      return;
    }
    // Work
    if(arr[i]==key){
      System.out.print(i+" ");
    }
    q1(arr, i+1, key);
  }
  /*Write a program to find Length of a String using Recursion. */
  public static int q3(String str, int i) {
    // Base Case
    if(i==str.length()){
      return i;
    }
    // Work
    return q3(str, i+1);
  }
  public static void main(String[] args) {
    int arr[]={1,9,3,7,5,5,7,3,9,1};
    int key=9;
    String str="Rahul";
    // q1(arr, 0, key);
    System.out.println(q3(str, 1));
  }
}
