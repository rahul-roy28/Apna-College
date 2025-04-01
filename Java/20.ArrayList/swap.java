import java.util.*;
public class swap {
  public static void sw(ArrayList<Integer> list, int idx1,int idx2){
    int temp=list.get(idx1);
    list.set(idx1,list.get(idx2));
    list.set(idx2,temp);
  }
  public static void main(String[] args) {
    ArrayList<Integer> list=new ArrayList<>();
    list.add(18);
    list.add(7);
    list.add(37);
    list.add(20);
    list.add(32);
    list.add(97);
    System.out.println(list);
    int idx1=2,idx2=5;
    sw(list, idx1, idx2);
    System.out.println(list);
  
  }
}
