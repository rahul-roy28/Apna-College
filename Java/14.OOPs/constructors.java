public class constructors {
  public static void main(String[] args) {
   Student s1=new Student(); 
   Student s2=new Student("rahul"); 
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
