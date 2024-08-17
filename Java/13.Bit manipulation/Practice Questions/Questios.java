public class Questios {
  
  // Question 1:Swap two numbers without using any thirdvariable.
  public static void Q1(int a, int b) {
    a=a^b;
    b=a^b;
    a=a^b;
    System.out.println("a= "+a+", b= "+b);
  }

  // Question 2 :Add 1 to an integer using Bit Manipulation.
  // (Hint: try using Bitwise NOT Operator)
  public static void Q2(int a) {
    int result=-~a;
    System.out.println(result);
  }

  // Convert uppercase characters to lowercase using bits.
  public static void Q3() {
    for(char ch='A';ch<='Z';ch++){
      System.out.print((char)(ch | ' ')+" ");
    }
  }
  public static void main(String[] args) {
   Q1(3, 4);
   Q2(5);
   Q3();
  }
}
