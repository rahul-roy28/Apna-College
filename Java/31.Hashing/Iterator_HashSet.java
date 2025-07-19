import java.util.*;
public class Iterator_HashSet {
  public static void main(String[] args) {
    HashSet<String> cities=new HashSet<>();
    cities.add("Kolkata");
    cities.add("Bengaluru");
    cities.add("Hydrabad");
    cities.add("Pune");
    cities.add("Delhi");
    // Using Iterator
    Iterator it=cities.iterator();
    while (it.hasNext()) {
      System.out.println(it.next());
    }
    System.out.println("Next process:");
    // Using Enhanced for loop
    for(String city:cities){
      System.out.println(city);
    }
  }
}
