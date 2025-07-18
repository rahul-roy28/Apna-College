import java.util.*;
public class mejarityElement {
  public static void main(String[] args) {
    int arr[]={1,3,9,1,5,1,7,9};
    HashMap<Integer,Integer> hm=new HashMap<>();
    for(int i=0;i<arr.length;i++){
      // if(hm.containsKey(arr[i])){
      //   hm.put(arr[i],hm.get(arr[i])+1);
      // }else{
      //   hm.put(arr[i],1);
      // }
      hm.put(arr[i],hm.getOrDefault(arr[i],0)+1);
    }
    // Set<Integer> keyset=hm.keySet();
    for(Integer key:hm.keySet()){
      if(hm.get(key)>arr.length/3){
        System.out.println(key);
      }
    }
  }
}
