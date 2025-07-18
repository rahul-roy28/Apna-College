import java.util.TreeMap;

public class Tree_Map {
  public static void main(String[] args) {
    TreeMap<String, Integer> tm=new TreeMap<>();
    tm.put("India", 100);
    tm.put("USA", 2300);
    tm.put("China", 15400);
    tm.put("Japan", 700);
    tm.put("Russia", 2500);
    tm.put("England", 7800);
    System.out.println(tm);
  }
}
