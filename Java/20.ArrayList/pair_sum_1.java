import java.util.*;
public class pair_sum_1 {
  public static boolean pair(ArrayList<Integer> list, int target) {
    int left_p=0;
    int right_p=list.size()-1;
    while(left_p<right_p){
      if((list.get(left_p))+(list.get(right_p))==target){
        return true;
      }else if((list.get(left_p))+(list.get(right_p))<target){
        left_p++;
      }else{
        right_p--;
      }
    }
    return false;
    
  }
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    ArrayList<Integer> list=new ArrayList<>();
    System.out.print("Enter size of arraylist: ");
    int n=sc.nextInt();
    
    for(int i=0;i<n;i++){
      System.out.print("Enter element of the arrayList: ");
      int number=sc.nextInt();
      list.add(number);
    }
    System.out.print("enter your target: ");
    int target=sc.nextInt();
    System.out.println(pair(list,target));
  }
}
