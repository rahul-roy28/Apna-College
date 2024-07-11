import java.util.Scanner;

public class continue_question {
 public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);
  do{
   System.out.print("Enter a number :");
   int n=sc.nextInt();
   if(n%10==0){
    continue;
   }
   if(n==101){
    break;
   }
   System.out.println(n);
  }while(true);
  sc.close();
 }
}
