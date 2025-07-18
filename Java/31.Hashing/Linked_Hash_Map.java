import java.util.*;
public class Linked_Hash_Map {
  public static void main(String[] args) {
    LinkedHashMap<String, Integer> lhm=new LinkedHashMap<>();
    lhm.put("India", 100);
    lhm.put("USA", 2300);
    lhm.put("China", 15400);
    lhm.put("Japan", 700);
    lhm.put("Russia", 2500);
    lhm.put("England", 7800);
    System.out.println(lhm);
  }
}
