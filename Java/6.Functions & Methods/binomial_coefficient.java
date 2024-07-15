import java.util.Scanner;

public class binomial_coefficient {
 public static int calculatefactorial(int n) {
  int f=1;
  for(int i=1;i<=n;i++){
   f=f*i;
  }
  return f;
 }
 public static int bincoeff(int n,int r) {
  int a=calculatefactorial(n);
  int b=calculatefactorial(r);
  int c=calculatefactorial(n-r);
  int ans=a/(b*c);
  return ans;
 }
 public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);
  System.out.print("Enter the value of n : ");
  int n=sc.nextInt();
  System.out.print("Enter the value of r : ");
  int r=sc.nextInt();
  int b_c=bincoeff(n,r);
  System.out.println("binomial coefficient is "+b_c);
  sc.close();
 }
}

