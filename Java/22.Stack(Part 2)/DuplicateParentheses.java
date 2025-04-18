import java.util.*;
public class DuplicateParentheses {
  public static boolean isDuplicate(String str){
    Stack<Character> s=new Stack<>();
    for(int i=0;i<str.length();i++){
      char ch=str.charAt(i);
      // Closing
      if(ch==')'){
        int count=0;
        while(s.peek() !='('){
          s.pop();
          count++;
        }
        if(count<1){
          return true;
        }else{
          s.pop();
        }
      }else{//Opening
        s.push(ch);
      }
    }
    return false;
  }
  public static void main(String[] args) {
    String str1="((a+b)+(a-b))";//false(Duplicate does not exists)
    String str2="(((a+b)+(a-b)))";//True(Duplicate exists)
    System.out.println(isDuplicate(str1));
  }
}
