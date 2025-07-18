import java.util.*;
public class Accenture {
  public static void main(String[] args) {
    String str[]={"apple","banana","apple","orange","apple","banana","orange","mango"};
    HashMap<String,Integer> hm=new HashMap<>();
    for(int i=0;i<str.length;i++){
      // if(hm.containsKey(arr[i])){
      //   hm.put(arr[i],hm.get(arr[i])+1);
      // }else{
      //   hm.put(arr[i],1);
      // }
      hm.put(str[i],hm.getOrDefault(str[i],0)+1);
    }
    // System.out.println(hm);
    // Set<Integer> keyset=hm.keySet();
    for(String key:hm.keySet()){
      if(hm.get(key)>=3){
        System.out.println(key);
      }
    }
  }
}
