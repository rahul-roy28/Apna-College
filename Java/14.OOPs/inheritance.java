public class inheritance {
  public static void main(String[] args) {
    Fish carp= new Fish();
    carp.eat();
    Dog leo=new Dog();
    leo.eat();
    leo.legs=4;
    System.out.println(leo.legs);
  }
}

class Animal{   //class 6
  String color;
  void eat(){
    System.out.println("Eats");
  }
  void breath(){
    System.out.println("Breath");
  }
}
// Single Level Inheritance
class Fish extends Animal{//class 7
  int fins;
  void swim(){
    System.out.println("Swim in water");
  }
}
// Multi Levele Inheritance
class Mammal extends Animal{
  int legs;
}
class Dog extends Mammal{//Hierarchial 
  String bread;
}
class Bird extends Mammal{//Hierarchial
  void fly(){
    System.out.println("can Fly");
  }
}