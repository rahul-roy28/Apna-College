import java.util.ArrayList;

public class insert {
  static class Heap{
    ArrayList<Integer> arr=new ArrayList<>();
    
    // Insert
    
    public void add(int data){
      // Add at last
      arr.add(data);  //TC=O(1)

      int x=arr.size()-1; //Chile position
      int par=(x-1)/2; //Parent Position

      while (arr.get(x)<arr.get(par)) { //TC=O(logn)
        // swap
        int temp=arr.get(x);
        arr.set(x, arr.get(par));
        arr.set(par, temp);

        x=par;
        par=(x-1)/2;
      }
    }

    // Peek

    public int peek(){
      return arr.get(0);
    }

    // Remove

    public int remove(){
      int data=arr.get(0);

      // Step1: swap 1st and last
      int temp=data;
      arr.set(0, arr.get(arr.size()-1));
      arr.set(arr.size()-1, temp);

      // Step2:Remove last idx
      arr.remove(arr.size()-1);

      // Step3: Heapify
      heapify(0);
      return data;
    }
    private void heapify(int i){
      int left=(2*i)+1;
      int right=(2*i)+2;
      int minIdx=i;

      if (arr.size()>left && arr.get(minIdx)>arr.get(left)) {
        minIdx=left;
      }
      if (arr.size()>right && arr.get(minIdx)>arr.get(right)) {
        minIdx=right;
      }

      if (minIdx != i) {
        // Swap
        int temp=arr.get(i);
        arr.set(i, arr.get(minIdx));
        arr.set(minIdx, temp);

        heapify(minIdx);
      }
    }

    // IsEmpty
    public boolean isEmpty(){
      return arr.size()==0;
    }
  }
  public static void main(String[] args) {
    Heap h=new Heap();
    h.add(9);
    h.add(2);
    h.add(6);
    h.add(1);
    h.add(5);
    h.add(8);
    while (!h.isEmpty()) {
      System.out.println(h.peek());
      h.remove();
    }
  }
}
