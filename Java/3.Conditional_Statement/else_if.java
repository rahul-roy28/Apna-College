public class else_if{
 public static void main(String args[]){
  int age=22;
  if(age>=18){
   System.out.println("Adult:Drive,vote");
  }//if this condition is true then else if and else condition does not compile. if thecondition is false then else if and else condition will compile. 
  else if(age>16 && age<18){
   System.out.println("Teenager");
  }
  else{
   System.out.println("Not Adult");
  }
 }
}