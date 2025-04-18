import java.util.*;
public class Histogram {
  public static void maxArea(int arr[]){
    int n=arr.length;
    int maxArea=0;
    int nsl[]=new int[n];
    int nsr[]=new int[n];
    // Next smallest Right
    Stack<Integer> s=new Stack<>();
    for(int i=n-1;i>=0;i--){
      int curr=arr[i];
      while(!s.isEmpty() && curr<=arr[s.peek()]){
        s.pop();
      }
      if(s.isEmpty()){
        nsr[i]=n;
      }else{
        nsr[i]=s.peek();
      }
      s.push(i);
    }
    // Next smallest Left
    s=new Stack<>();
    for(int i=0;i<n;i++){
      int curr=arr[i];
      while(!s.isEmpty() && curr<=arr[s.peek()]){
        s.pop();
      }
      if(s.isEmpty()){
        nsl[i]=-1;
      }else{
        nsl[i]=s.peek();
      }
      s.push(i);
    }
    // Calculate
    for(int i=0;i<n;i++){
      int height=arr[i];
      int width=nsr[i]-nsl[i]-1;
      int currArea=height*width;
      maxArea=Math.max(maxArea, currArea);      
    }
    System.out.println("Max area in Histogram= "+maxArea);
  }
  public static void main(String[] args) {
    int arr[]={2,1,5,6,2,3};
    maxArea(arr);
  }
}
