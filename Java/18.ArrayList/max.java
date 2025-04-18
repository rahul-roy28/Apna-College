import java.util.*;
public class max {
  public static void main(String[] args) {
    ArrayList<Integer> list=new ArrayList<>();
    list.add(18);
    list.add(7);
    list.add(37);
    list.add(20);
    list.add(32);
    list.add(97);
    System.out.println(list);
    int max=Integer.MIN_VALUE;
    for(int i=0;i<list.size();i++){
      if(max<list.get(i)){
        max=list.get(i);
      }
    }
    System.out.println(max);
  }
}
