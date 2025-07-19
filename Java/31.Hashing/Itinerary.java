import java.util.*;
public class Itinerary {
  public static String getStart(HashMap<String,String> hm){
    HashMap<String, String> rhm= new HashMap<>();
    for(String key: hm.keySet()){
      rhm.put(hm.get(key), key);
    }
    for(String key: hm.keySet()){
      if (!rhm.containsKey(key)) {
        return key;
      }
    }
    return null;
  }
  public static void main(String[] args) {
    HashMap<String,String> hm= new HashMap<>();
    hm.put("Chennai", "Bengaluru");
    hm.put("Mumbai", "Delhi");
    hm.put("Goa", "Chennai");
    hm.put("Delhi", "Goa");
    String start=getStart(hm);
    System.out.print(start);
    for(String key: hm.keySet()){
      System.out.print("->"+hm.get(start));
      start=hm.get(start);
    }
    System.out.println();
  }
}
