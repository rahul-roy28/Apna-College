public class even_odd {
 public static void OddorEven(int n) {
  int bitMask=1;
  if((n & bitMask)==0){
   System.out.println(n+" is Even Numbers");
  }else{
   System.out.println(n+" is Odd Number");
  }
 }
 public static void main(String[] args) {
  OddorEven(3);
  OddorEven(6);
  OddorEven(11);
  OddorEven(70);
 }
}
