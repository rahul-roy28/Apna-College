public class quick_sort {
  public static void quick(int arr[], int si, int ei) {
    // Base case
    if(si>=ei){
      return;
    }
    // Work
    // Pivot(last element)
    int pInd=pivotIndex(arr,si,ei);
    quick(arr, si, pInd-1);
    quick(arr, pInd+1, ei);
  }
  public static int pivotIndex(int arr[], int si, int ei) {
    int pivot=arr[ei];
    int i=si-1;
    for(int j=si; j<ei;j++){
      if(arr[j]<=pivot){
        i++;
        int temp=arr[j];
        arr[j]=arr[i];
        arr[i]=temp;
      }
    }
    i++;
    int temp=pivot;
    arr[ei]=arr[i];
    arr[i]=temp;
    return i;
  }
  public static void main(String[] args) {
    int arr[]={6,3,9,8,5};
    quick(arr, 0, arr.length-1);
    for(int i=0;i<arr.length;i++){
      System.out.print(arr[i]+" ");
    }

  }
}
