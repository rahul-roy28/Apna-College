// Reverse a string and sort it
import java.util.*;
public class Q1 {
  public static String reverse(String str){
    Stack<Character> s=new Stack<>();
    StringBuilder st=new StringBuilder();
    for(int i=0;i<str.length();i++){
      s.push(str.charAt(i));
    }
    while (!s.isEmpty()) {
      st.append(s.pop());
    }
    return st.toString();
  }
  public static String sort(String str){
    char[] c=str.toCharArray();
    Arrays.sort(c);
    return new String(c);
  }
  public static void main(String[] args) {
    String str="kolkata";
    String result=reverse(str);
    String result2=sort(result);
    System.out.println(result2);

  }
}
