public class classes_objects{
  public static void main(String[] args) {
    Pen p1=new Pen();
    p1.setcolor("Blue");
    System.out.println(p1.color);
    p1.setTip(4);
    System.out.println(p1.tip);
    p1.color="Yellow";
    System.out.println(p1.color);
    BankAccount myAcc=new BankAccount();
    myAcc.username="rahulroy";
    System.out.println(myAcc.username);
    // myAcc.password="abcde";//we can not use private access modifier outside class
    myAcc.setPassword("null");
  }
}

class BankAccount{
  public String username;
  public String password;
  public void setPassword(String pass){
    password=pass;
  }
}

class Pen{
  String color;
  int tip;
  void setcolor(String newcolor){
    color=newcolor;
  }
  void setTip(int newTip){
    tip=newTip;
  }
}

class Student{
  String name;
  int age;
  float percentage;
  void calpercentage(int phy,int che, int math){
    percentage=(phy+che+math)/3;
  }
}
