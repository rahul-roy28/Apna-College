public class if_else{
 public static void main(String args[]){
  int age=22;
  if(age>=18){
   System.out.println("Adult:Drive,vote");
  }
  if(age>16 && age<18){
   System.out.println("Teenager");
  }
  else{
   System.out.println("Not Adult");
  }
 }
}