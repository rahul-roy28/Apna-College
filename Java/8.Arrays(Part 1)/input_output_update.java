import java.util.Scanner;

public class input_output_update {
 public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);
  int marks[]=new int[100];
  // Length of array
  System.out.println("Length : "+marks.length);
  // Input 
  marks[0]=sc.nextInt();
  marks[1]=sc.nextInt();
  marks[2]=sc.nextInt();
  // Output
  System.out.println("Physics : "+marks[0]);
  System.out.println("Chemistry : "+marks[1]);
  System.out.println("Math : "+marks[2]);
  // Update
  marks[2]=marks[2]+4;
  System.out.println("Updated Math : "+marks[2]);
  // find percentage
  int percentage=(marks[0]+marks[1]+marks[2])/3;
  System.out.println("Percentage : "+percentage+" %");
  sc.close();
 }
}
