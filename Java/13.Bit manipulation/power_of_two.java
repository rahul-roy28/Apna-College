public class power_of_two {
  public static void main(String[] args) {
    int n=5;
    if((n & (n-1))==0){
      System.out.println(n+" is Power of 2");
    }else{
      System.out.println(n+" not a power of 2");
    }
  }
}
