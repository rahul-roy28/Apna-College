public class constructors {
  public static void main(String[] args) {
   Student s1=new Student(); 
   Student s2=new Student("rahul"); 
   System.out.println(s1+","+s2.name);
  }
}

class Student{
  String name;
  int roll;
  // Non Parameterized
  Student(){
    System.out.println("constructor is called....");
  }
  Student(String name){
    this.name=name;
  }
}
