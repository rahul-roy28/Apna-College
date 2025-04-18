public class max_subarray_sum {
  public static void brute_force(int numbers[]) {
   int currentSum=0;
   int maxSum=Integer.MIN_VALUE;
   for(int i=0;i<numbers.length;i++){
    int start=i;
    for(int j=i;j<numbers.length;j++){
     int end=j;
     currentSum=0;
     for(int k=start;k<=end;k++){
      currentSum+=numbers[k];
     }
     System.out.println(currentSum);
     if(maxSum<currentSum){
      maxSum=currentSum;
     }
    }
   }
   System.out.println("Brute Force Max Sum = "+maxSum); 
  }
  public static void Prefix_sum(int numbers[]) {
    int currentSum=0;
    int maxSum=Integer.MIN_VALUE;
    int prefix[]=new int[numbers.length];
    
    // Calculate prefix array
    prefix[0]=numbers[0];
    for(int i=1;i<prefix.length;i++){
      prefix[i]=prefix[i-1]+numbers[i];
    }
    // Calculate sum
    for(int i=0;i<numbers.length;i++){
     int start=i;
     for(int j=i;j<numbers.length;j++){
      int end=j;
      if(start==0){
        currentSum=prefix[end];
      }else{
        currentSum=prefix[end]-prefix[start-1];
      }
      System.out.println(currentSum);
      if(maxSum<currentSum){
       maxSum=currentSum;
      }
     }
    }
    System.out.println("Prefix Sum: Max Sum = "+maxSum); 
   } 
  public static void kadane(int numbers[]) {
    int currentSum=0;
    int maxSum=Integer.MIN_VALUE;
    
    // When all array elements are negetive
    for(int j=0;j<numbers.length;j++){
      if(numbers[j]<0){
        maxSum=Math.max(maxSum, numbers[j]);
      }
    }
    System.out.println("Special condition max Sum : "+maxSum);
    
    for(int i=0;i<numbers.length;i++){
      currentSum +=numbers[i];
      if(currentSum<0){
        currentSum=0;
      }
      System.out.println(currentSum);
      maxSum=Math.max(maxSum, currentSum);
    }
    System.out.println("Kadane Max Sum : "+maxSum);
  }
   public static void main(String[] args) {
   int numbers[]={-2,-3,4,-1,-2,1,5,-3};
   brute_force(numbers);
   Prefix_sum(numbers);
   kadane(numbers);
  }
 } 
