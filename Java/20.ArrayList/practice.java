import java.util.*;
public class practice {
  public static ArrayList<Integer> lonely(ArrayList<Integer> list) {
    ArrayList<Integer> ans=new ArrayList<>();
    for(int i=0;i<list.size();i++){
      int prev=list.get(i)-1;
      int front=list.get(i)+1;
      for(int j=i+1;j<list.size();j++){
        if(list.get(i)!=list.get(j) && prev!=list.get(j) && front!=list.get(j)){
          ans.add(list.get(i));
        }
      }
    }
    return ans;
  }
  public static void main(String[] args) {
    ArrayList<Integer> list=new ArrayList<>();
    list.add(10);
    list.add(6);
    list.add(5);
    list.add(8);
    System.out.println(lonely(list));
  }
}
