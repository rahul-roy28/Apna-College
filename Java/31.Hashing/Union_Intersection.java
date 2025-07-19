import java.util.*;
public class Union_Intersection {
  public static void union(int arr1[],int arr2[]){
    HashSet<Integer> hs=new HashSet<>();
    for(int i=0;i<arr1.length;i++){
      hs.add(arr1[i]);
    }
    for(int i=0;i<arr2.length;i++){
      hs.add(arr2[i]);
    }
    System.out.println("The Union size of arr1 and arr2 is :"+hs.size());
  }
  public static void intersection(int arr1[],int arr2[]){
    HashSet<Integer> hs=new HashSet<>();
    for(int i=0;i<arr1.length;i++){
      hs.add(arr1[i]);
    }
    int count=0;
    for(int i=0;i<arr2.length;i++){
      if (hs.contains(arr2[i])) {
        count++;
        hs.remove(arr2[i]);
      }
    }
    System.out.println("The intersection size of arr1 and arr2 is :"+count);
  }
  public static void main(String[] args) {
    int arr1[]={7,3,9};
    int arr2[]={6,3,9,2,9,4};
    union(arr1, arr2);
    intersection(arr1, arr2);
  }
}
