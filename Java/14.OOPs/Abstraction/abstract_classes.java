/**
 * abstract_classes
 */
public class abstract_classes {

  public static void main(String[] args) {
    Horse h=new Horse();
    h.eat();
    h.walk();
    System.out.println(h.color);
    Chicken c=new Chicken();
    c.eat();
    c.walk();
    System.out.println(c.color);
    // Animal a=new Animal(); *** We can not create Abstract class object**
    Mustang m=new Mustang(); //***Animal -> Horse -> Mustang***
    System.out.println(m); //this is not required
  }
}


abstract class Animal{
  // construictor
  String color;
  Animal(){
    color="Brown";
    System.out.println("Animal constructor called");
  }
  
  void eat(){
    System.out.println("animal eats");
  }

  abstract void walk();//This is an idea , this idea implement in Horse and Chicken class
}


class Horse extends Animal{
  Horse(){
    System.out.println("Horse constructor called");
  }
  void colorchange(){
    color="Dark Brown";
  }

  void walk(){//idea implementation
    System.out.println("Walk with 4 legs");
  }
}

class Mustang extends Horse{
  Mustang(){
    System.out.println("Mustang constructor called");
  }
}

class Chicken extends Animal{

  void colorchange(){
    color="Golden Red";
  }

  void walk(){//idea implementation
    System.out.println("Walk with 2 legs");
  }
}