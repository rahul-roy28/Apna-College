public class Operators{
 public static void main(String args[]){
  //Arithmetic Operators
 int a=20;
 int b=6;
 System.out.println("Sum= "+(a+b)); 
 System.out.println("Difference= "+(a-b)); 
 System.out.println("Multipication= "+(a*b)); 
 System.out.println("Division= "+(a/b)); 
 System.out.println("Remainder= "+(a%b)); 
 //Relational Operators
 int c=40;
 int d=100;
 System.out.println((c==d)); 
 System.out.println((c!=d)); 
 System.out.println((c>d)); 
 System.out.println((c<d)); 
 System.out.println((c>=d)); 
 System.out.println((c<=d)); 
 //Logical Operator
 System.out.println((3>2) && (6>5));
 System.out.println((3<2) && (6>5));
 System.out.println((3<2) || (6>5));
 System.out.println((3<2) || (6<5));
 System.out.println(!(3>2));
 System.out.println(!(3<2));
 //Assignment Operators
 int A=10;
 A+=10;
 System.out.println(A);
  int B=10;
 B-=10;
 System.out.println(B);
  int C=10;
 C*=10;
 System.out.println(C);
  int D=10;
 D/=10;
 System.out.println(D);
 }
}