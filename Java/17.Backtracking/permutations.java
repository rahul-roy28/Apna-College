public class permutations {
  public static void change(String str, String ans) {
    // Base Case
    if(str.length()==0){
      System.out.println("'"+ans+"'");
      return;
    }
    // Recursion
    for(int i=0;i<str.length();i++){
      char ch=str.charAt(i);
      // "abcde"=>"ab"+"de"="abde"
      String newstr=str.substring(0,i)+str.substring(i+1);
      change(newstr, ans+ch);
    }
  }
 public static void main(String[] args) {
  String str="abcde";
  change(str, "");
 } 
}
