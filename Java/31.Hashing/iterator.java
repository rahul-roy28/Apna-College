import java.util.*;
public class iterator {
  public static void main(String[] args) {
    HashMap<String,Integer> hm=new HashMap<>();
    hm.put("India", 100);
    hm.put("Nepal", 49);
    hm.put("China", 89);
    hm.put("Bangladesh", 23);
    hm.put("Japan", 78);
    hm.put("USA", 200);
    // iteration
    Set<String> keys=hm.keySet();
    for(String k:keys){
      System.out.println("Key: "+k+","+"Value: "+hm.get(k));
    }
  }
}
