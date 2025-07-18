import java.util.*;
public class Hashmap {
  public static void main(String[] args) {
    HashMap<String,Integer> hm=new HashMap<>();
    // Insert
    hm.put("India",38);
    hm.put("China",79);
    hm.put("Japan",90);
    System.out.println(hm);

    // Get
    int population=hm.get("Japan");
    System.out.println(population);
    System.out.println(hm.get("USA"));

    // containsKey(Key exists or not)
    System.out.println(hm.containsKey("Bangladesh"));//False
    System.out.println(hm.containsKey("India"));//true

    // Remove
    hm.remove("China");
    System.out.println(hm);

    // Size
    System.out.println(hm.size());

    // is Empty
    System.out.println(hm.isEmpty());

    // Clear map
    hm.clear();
    System.out.println(hm);
  }

}
