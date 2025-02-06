public class marje_sort {
  public static void devide(int arr[],int si, int ei) {
    // Base Case
    if(si>=ei){
      return;
    }
    // mid
    int mid=si+(ei-si)/2;//(si+ei)/2
    // Work
    devide(arr, si, mid);
    devide(arr, mid+1, ei);
    marge(arr,si,mid,ei);
  }
  public static void marge(int arr[],int si, int mid,int ei) {
    int temp[]=new int[ei-si+1];
    int i=si;//for left part
    int j=mid+1;//for right part
    int k=0;//for temp array
    while(i<=mid && j<=ei){
      if(arr[i]<arr[j]){
        temp[k]=arr[i];
        i++;
      }else{
        temp[k]=arr[j];
        j++;
      }
      k++;
    }
    // For leftover elements for 1st sorted part
    while(i<=mid){
      // temp[k++]=arr[i++];
      temp[k]=arr[i];
      i++;
      k++;
    }
    // For leftover elements for 2nd sorted part
    while(j<=ei){
      // temp[k++]=arr[j++];
      temp[k]=arr[j];
      j++;
      k++;
    }
    // Copy temp to original array
    for(k=0,i=si;k<temp.length;k++,i++){
      arr[i]=temp[k];
    }
  }
  public static void main(String[] args) {
    int arr[]={6,3,9,5,2,8};
    devide(arr, 0, arr.length-1);
    for(int i=0;i<arr.length;i++){
      System.out.print(arr[i]+" ");
    }
  }
}
