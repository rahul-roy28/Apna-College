// Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct
public class Q_1 {
 public static boolean repeat(int numbers[]) {
  for(int i=0;i<numbers.length-1;i++){
   for(int j=i+1;j<numbers.length;j++){
    if(numbers[j]==numbers[i]){
     return true;
    }
   }
  }
  return false;
 }
 public static void main(String[] args) {
  int numbers_1[]={1,2,3,1};
  int numbers_2[]={1,2,3,4};
  int numbers_3[]={1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
  System.out.println(repeat(numbers_1));
  System.out.println(repeat(numbers_2));
  System.out.println(repeat(numbers_3));
 }
}
