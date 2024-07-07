import java.util.*;
public class even_odd{
 public static void main(String args[]){
  Scanner sc=new Scanner(System.in);
  int input=sc.nextInt();
  if(input%2==0){
   System.out.println("Given number is EVEN");
  }
  else{
   System.out.println("Given number is ODD");
  }
 }
}