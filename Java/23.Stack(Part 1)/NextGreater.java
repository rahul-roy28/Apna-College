import java.util.*;
public class NextGreater {
  public static void nextGreater(int arr[],int next[]) {
    int n=arr.length;
    Stack<Integer> s=new Stack<>();
    for(int i=n-1;i>=0;i--){
      int curr=arr[i];
      while (!s.isEmpty() && curr>=arr[s.peek()]) {
        s.pop();
      }
      if(s.isEmpty()){
        next[i]=-1;
      }else{
        int greater=arr[s.peek()];
        next[i]=greater;
      }
      s.push(i);
    }
  }
  public static void main(String[] args) {
    int arr[]={5,9,1,0,10,45,2,5,13};
    int next[]=new int[arr.length];
    nextGreater(arr, next);
    for(int i=0;i<next.length;i++){
      System.out.print(next[i]+" ");
    }
  }
}
