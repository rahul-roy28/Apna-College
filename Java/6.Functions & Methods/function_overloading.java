public class function_overloading {
 
 // Using Parameters
 // public static int sum(int a,int b) {
 //  return a+b;
 // }
 // public static int sum(int a,int b,int c) {
 //  return a+b+c;
 // }
 
 // Using Data types
 public static int sum(int a,int b) {
  return a+b;
 }
 public static float sum(float a,float b) {
  return a+b;
 }
 public static void main(String[] args) {
  System.out.println(sum(2,5));
  System.out.println(sum(5.7f,2.3f));
 }
}
