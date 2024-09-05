public class super_keyword {
  public static void main(String[] args) {
    @SuppressWarnings("unused")
    Horse h=new Horse();
  }
}
class Animal{
  Animal(){
    System.out.println("Animal contructor called");
  }
}
class Horse extends Animal{
  Horse(){
    super();
    System.out.println("Horse contructor called");
  }
}