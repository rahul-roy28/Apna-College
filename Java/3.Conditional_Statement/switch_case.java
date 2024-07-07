import java.util.*;
public class switch_case{
 public static void main(String args[]){
  Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();
  switch(n){
   case 1:System.out.println("Light");
    break;
   case 2:System.out.println("Fan");
    break;
   case 3:System.out.println("Charging point");
    break;
   default:System.out.println("There is nothing");
  }
 }
}
