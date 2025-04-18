/**
 * Intro
 */
import java.util.*;
public class Intro {

  public static void main(String[] args) {
    ArrayList<Integer> list=new ArrayList<>();
    ArrayList<Float> list2=new ArrayList<>();
    // Operatoin in ArrayList
    // ADD element
    list.add(1);
    list.add(2);
    list.add(3);
    list.add(4);
    list.add(5);
    System.out.println(list);
    // add element in a particular position
    list.add(2,10);
    System.out.println(list);
    // Size of array
    System.out.println(list.size());
    // GET element
    int element=list.get(3);
    System.out.println(element);
    // REMOVE element
    list.remove(2);
    System.out.println(list);
    // Set Element
    list.set(2,9);
    System.out.println(list);
    // CONTAINS element(check if a element is present in arraylist or not)
    System.out.println(list.contains(1));
    System.out.println(list.contains(6));
  }
}