import java.util.Scanner;

public class factorial {
 public static int calculatefactorial(int n) {
  int f=1;
  for(int i=1;i<=n;i++){
   f=f*i;
  }
  return f;
 }
 public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);
  System.out.print("Enter a number: ");
  int a=sc.nextInt();
  int fact=calculatefactorial(a);
  System.out.println("Factorial of "+a+" is :"+fact);
  sc.close();
 }
}
