import java.util.*;

public class CircleArea{
 public static void main(String args[]){
  Scanner sc=new Scanner(System.in);
  float rad=sc.nextFloat();
  float area=3.14f*rad*rad;//when we don't use f with a decimal number java automatically consider that this is a Double number . For this problem we use f with decimal number to make it a FLOATING NUMBER.
  System.out.println(area);
 }
}