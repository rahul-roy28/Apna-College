import java.util.Scanner;

public class sum_1_to_n {
 public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();
  int sum=0;
  int count=1;
  while(count<=n){
   sum=sum+count;
   count++;
  }
  System.out.println(sum);
  sc.close();
 }
}
