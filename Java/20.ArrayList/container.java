import java.util.*;

public class container {
  public static int max(ArrayList<Integer> list) {
    int max_val=Integer.MIN_VALUE;
    for(int i=0;i<list.size();i++){
      for(int j=i+1;j<list.size();j++){
        int height=Math.min(list.get(i),list.get(j));
        int width=j-i;
        int product=height*width;
        if(max_val<product){
          max_val=product;
        }
      }
    }
    return max_val;
  }
  public static void main(String[] args) {
    
    Scanner sc=new Scanner(System.in);
    ArrayList<Integer> list=new ArrayList<>();
    System.out.print("Enter size of arraylist:");
    int n=sc.nextInt();
    
    for(int i=0;i<n;i++){
      System.out.print("Enter element of the arrayList:");
      int number=sc.nextInt();
      list.add(number);
    }
    System.out.println("Result is "+max(list));
  }
}
