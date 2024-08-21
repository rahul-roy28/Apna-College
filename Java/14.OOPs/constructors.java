public class constructors {
  public static void main(String[] args) {
   //non parameterized
   Student s1=new Student(); 
   //Parameterized
   Student s2=new Student("rahul"); 
   System.out.println(s1+","+s2.name);
   //  Copy Constrctor
   s1.name="Rahl";
   s1.roll=1;
   s1.password="abcd";
   s1.marks[0]=100;
   s1.marks[1]=80;
   s1.marks[2]=90;
   Student s3= new Student(s1);
   s3.password="efgh";
   s1.marks[2]=100;
   for(int i=0;i<3;i++){
    System.out.println(s3.marks[i]);
   }
  }
}

class Student{
  String name;
  int roll;
  String password;
  int marks[];
  
  //Shallow Copy Constrctor
  // Student(Student s1){
  //   marks=new int[3];
  //   this.name=s1.name;
  //   this.roll=s1.roll;
  //   this.marks=s1.marks;
  // }
  
  // Deep copy constructor
  Student (Student s1){
    marks=new int[3];
    this.name=s1.name;
    this.roll=s1.roll;
    for(int i=0;i<marks.length;i++){
      this.marks[i]=s1.marks[i];
    }
  }
  
  
  // Non Parameterized
  Student(){
    marks= new int[3];
    System.out.println("constructor is called....");
  }
  
  // Parameterized
  Student(String name){
    marks= new int[3];
    this.name=name;
  }
}
