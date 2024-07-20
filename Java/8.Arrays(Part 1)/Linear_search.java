public class Linear_search {
 public static int LinearSearch(int numbers[],int key) {
  for(int i=0;i<numbers.length;i++){
   if(numbers[i]==key){
    return i;
   }
  }
  return -1;
 }
 public static void main(String[] args) {
  int numbers[]={2,4,6,8,20,21,12,60,70,30};
  int key=70;
  int index=LinearSearch(numbers, key);
  if(index==-1){
   System.out.println("Not Found");
  }else{
   System.out.println("Key found at index: "+index);
  }
 }
}
