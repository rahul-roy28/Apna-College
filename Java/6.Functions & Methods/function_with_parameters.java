import java.util.Scanner;

public class function_with_parameters {
 public static int calculateSum(int num1,int num2) {//use int to return sum
  int sum=num1+num2;
  // System.out.println("Sum of a and b is :"+sum);
  return sum;//return sum to claculateSum function
 }
 public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);
  System.out.print("Enter number a:");
  int a=sc.nextInt();
  System.out.print("Enter number b:");
  int b=sc.nextInt();
  // calculateSum(a, b);
  int sum=calculateSum(a, b);//print sum in main function
  System.out.println("Sum of a and b is :"+sum);
  sc.close();
 }
}
