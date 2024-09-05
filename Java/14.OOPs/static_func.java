public class static_func {
  @SuppressWarnings("static-access")
  public static void main(String[] args) {
    Student s1=new Student();
    s1.schoolName="KAV";
    Student s2=new Student();
    System.out.println(s2.schoolName);
    Student s3=new Student();
    System.out.println(s3.schoolName);
  }
}
class Student{
  String name;
  int marks;
  int roll;

  static String schoolName;

  void setName(String name){
    this.name=name;
  }

  String getName(){
    return this.name;
  }
}