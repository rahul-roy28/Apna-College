import java.util.*;
public class reverseString {
  public static String reverse(String str){
    Stack<Character> s=new Stack<>();
    int idx=0;
    while(idx<str.length()){
      s.push(str.charAt(idx));
      idx++;
    }
    StringBuilder result=new StringBuilder("");
    while(!s.isEmpty()){
      char ch=s.pop();
      result.append(ch);
    }
    return result.toString();
  }
  public static void main(String[] args) {
    String str="abc";
    String result=reverse(str);
    System.out.println(result);
  }
}
