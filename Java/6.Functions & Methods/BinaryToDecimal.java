public class BinaryToDecimal {
 public static void BinToDec(int BinNum) {
  int mynum=BinNum;
  int pow=0;
  int DecNum=0;
  while(BinNum>0){
   int lastdigit=BinNum%10;
   DecNum=DecNum+(lastdigit*(int)Math.pow(2, pow));
   pow++;
   BinNum=BinNum/10;
  }
  System.out.println("Decimal number of "+mynum+" is : "+DecNum);
 }
 public static void main(String[] args) {
  BinToDec(1111);
 }
}
