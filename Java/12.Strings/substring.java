public class substring {
 public static String substr(String str, int si, int ei) {
  String substr="";
  for(int i=si;i<ei;i++){
   substr +=str.charAt(i);
  }
  return substr;
 }
 public static void main(String[] args) {
  String str="HelloWorld";
  System.out.println(str.substring(0,5));//Java Inbuilt function
  System.out.println(substr(str, 0, 5));
 }
}
