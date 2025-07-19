import java.util.*;
public class Hash_Set {
  public static void main(String[] args) {
    HashSet<Integer> hs=new HashSet<>();
    hs.add(1);
    hs.add(2);
    hs.add(4);
    hs.add(2);
    hs.add(1);
    System.out.println(hs);
    System.out.println(hs.size());
    hs.remove(4);
    if (hs.contains(4)) {
      System.out.println("key exists");
    }else{
      System.out.println("key does not exists");
    }
    hs.clear();
    System.out.println(hs.size());
    System.out.println(hs.isEmpty());
  }
}
