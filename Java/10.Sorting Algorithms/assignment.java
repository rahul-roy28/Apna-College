public class assignment {
 public static void bubble(int numbers[]) {
  int n=numbers.length;
  for(int turns=0;turns<n-1;turns++){
   for(int j=0;j<n-1-turns;j++){
    // swap
    if(numbers[j]<numbers[j+1]){
     int temp=numbers[j];
     numbers[j]=numbers[j+1];
     numbers[j+1]=temp;
    }
   }
  }
 }


 public static void selection(int numbers[]) {
  int n=numbers.length;
  for(int i=0;i<n-1;i++){
   int minpos=i; 
   for(int j=i+1;j<n;j++){
    if(numbers[minpos]<numbers[j]){
     minpos=j;
    }
   }
   int temp=numbers[minpos];
   numbers[minpos]=numbers[i];
   numbers[i]=temp;
  }
 }

 public static void insertion(int[] numbers) {
  for(int i=1;i<numbers.length;i++){
   int currentval=numbers[i];
   int j=i-1;
   while(j>=0 && numbers[j]<currentval){
    numbers[j+1]=numbers[j];
    j--;
   }
   numbers[j+1]=currentval;
  }
 }

 public static void counting(int[] numbers) {
  int largest=Integer.MIN_VALUE;
  for(int i=0;i<numbers.length;i++){
   largest=Math.max(largest, numbers[i]);
  }
  int count[]=new int[largest+1];
  for(int i=0;i<numbers.length;i++){
   count[numbers[i]]++;
  }
  int j=0;
  for(int i=0;i<count.length;i++){
   while (count[i]<0) {
    numbers[j]=i;
    j++;
    count[i]--;
   }
  }
 }

 public static void print(int numbers[]) {
  for(int i=0;i<numbers.length;i++){
   System.out.print(numbers[i]+", ");
  }
  System.out.println();
 }
 public static void main(String[] args) {
  int numbers[]={3,6,2,1,8,7,4,5,3,1};
  bubble(numbers);
  print(numbers);
  selection(numbers);
  print(numbers);
  insertion(numbers);
  print(numbers);
  counting(numbers);
  print(numbers);
 }
}
