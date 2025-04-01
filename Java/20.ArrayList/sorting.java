import java.util.*;

public class sorting {
  public static void main(String[] args) {
    ArrayList<Integer> list=new ArrayList<>();
    list.add(18);
    list.add(7);
    list.add(37);
    list.add(20);
    list.add(32);
    list.add(97);
    System.out.println(list);
    Collections.sort(list);
    System.out.println(list);
    Collections.sort(list,Collections.reverseOrder());
    System.out.println(list);

  }
  
}
