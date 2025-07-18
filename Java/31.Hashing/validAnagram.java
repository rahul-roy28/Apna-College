import java.util.*;
public class validAnagram {
  public static boolean anagram(String s, String t) {
    if(s.length() != t.length()){
      return false;
    }
    HashMap<Character, Integer> hm=new HashMap<>();
    for(int i=0;i<s.length();i++){
      char ch=s.charAt(i);
      // if(hm.containsKey(s.charAt(i))){
      //   hm.put(s.charAt(i),hm.get(s.charAt(i)+1));
      // }else{
      //   hm.put(s.charAt(i),1);
      // }
      hm.put(ch,hm.getOrDefault(ch, 0)+1);
    }
    for(int j=0;j<t.length();j++){
      if(hm.get(t.charAt(j)) !=null){
        if(hm.get(t.charAt(j))==1){
          hm.remove(t.charAt(j));
        }else{
          hm.put(t.charAt(j),hm.get(t.charAt(j))-1);
        }
      }else{
        return false;
      }
    }
    return hm.isEmpty();
  }
  public static void main(String[] args) {
    String s="lipid";
    String t="diipl";
    System.out.println(anagram(s, t));
  }
}
