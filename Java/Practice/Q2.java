
public class Q2 {
  public static void main(String[] args) {
    String str="aeiou";
    int count=0;
    for(int i=0;i<str.length();i++){
      char ch=str.charAt(i);
      if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
        count ++;
      }
    }
    System.out.println(count);
  }
}
