public class polymorphism {
  public static void main(String[] args) {
    // Method Overloading
    Calculaor calc=new Calculaor();
    System.out.println(calc.sum(7875, 456));
    System.out.println(calc.sum((float)1.5, (float)2.5));
    System.out.println(calc.sum(4, 6, 8));
    // Method Overriding
    Deer d=new Deer();
    d.eat();
  }
}
// Method Overloading
class Calculaor{
  int sum(int a,int b){
    return a+b;
  }
  float sum(float a,float b){
    return a+b;
  }
  int sum(int a,int b,int c){
    return a+b+c;
  }
}
// Method Overriding
class Animal{
  void eat(){
    System.out.println("Eats Anything");
  }
}
class Deer extends Animal{
  void eat(){
    System.out.println("Eats Grass");
  }
}