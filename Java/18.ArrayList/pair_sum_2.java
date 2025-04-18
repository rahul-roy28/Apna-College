import java.util.*;

public class pair_sum_2 {
  public static boolean pair(ArrayList<Integer> list,int target) {
    int lp=0;
    int rp=0;
    for(int i=0;i<list.size()-1;i++){
      if(list.get(i)>list.get(i+1)){
        lp=i+1;
        rp=i;
        break;
      }
    }
    while(lp!=rp){
      if((list.get(lp))+(list.get(rp))==target){
        return true;
      }else if((list.get(lp))+(list.get(rp))<target){
        lp=(lp+1)%list.size();
      }else{
        rp=(list.size()+rp-1)%list.size();
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
