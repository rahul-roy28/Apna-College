import java.util.Scanner;

public class product {
 public static int productnum(int num1,int num2) {
  int mul=num1*num2;
  return mul;
 }
 public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);
  System.out.print("Enter number a : ");
  int a=sc.nextInt();
  System.out.print("Enter number b : ");
  int b=sc.nextInt();
  int prod=productnum(a, b);
  System.out.println(prod);
  sc.close();
 }
}
