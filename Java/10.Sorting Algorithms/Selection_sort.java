public class Selection_sort {
 public static void selection(int numbers[]) {
  int n=numbers.length;
  for(int i=0;i<n-1;i++){
   int minpos=i; 
   for(int j=i+1;j<n;j++){
    if(numbers[minpos]>numbers[j]){
     minpos=j;
    }
   }
   int temp=numbers[minpos];
   numbers[minpos]=numbers[i];
   numbers[i]=temp;
  }
 }
 public static void main(String[] args) {
  int numbers[]={5,4,1,3,2};
  selection(numbers);
  for(int i=0;i<numbers.length;i++){
   System.out.print(numbers[i]+", ");
  }
 }
}
