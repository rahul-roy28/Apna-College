public class CharAt {
 public static void printLetters(String str) {
  for(int i=0;i<str.length();i++){
   System.out.print(str.charAt(i)+" ");
  }
  System.out.println();
 }
 public static void main(String[] args) {
  String firstname="Rahul";
  String lastname="Roy";
  String fullname=firstname+" "+lastname;
  printLetters(fullname);
 }
}
