public class sort_rotate {
  public static int search(int arr[], int tar, int si, int ei) {
    // base Case
    if(si>ei){
      return -1;
    }
    // Work
    int mid=si+(ei-si)/2;
    // Case Found
    if(arr[mid]==tar){
      return mid;
    }
    // Mid on L1
    if(arr[si]<=arr[mid]){
      if(arr[si]<=tar && tar<=arr[mid]){
        return search(arr, tar, si, mid-1);
      }else{
        return search(arr, tar, mid+1, ei);
      }
    }
    // Mid on L2
    else{
      if(arr[mid]<=tar && tar<=arr[ei]){
        return search(arr, tar, mid+1, ei);
      }else{
        return search(arr, tar, si, mid-1);
      }
      
    }
  }
  public static void main(String[] args) {
    int arr[]={4,5,6,7,0,1,2};
    int targate=3;
    int result=search(arr, targate, 0, arr.length-1);
    
    if(result==-1){
      System.out.println("Target not found !!!!!");
    }else{
      System.out.println(result);

    }
  }
}
