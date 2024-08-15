public class getter_setter {
  public static void main(String[] args) {
    Pen p1=new Pen();
    p1.setcolor("Blue");
    System.out.println(p1.getcolor());
    p1.setTip(4);
    System.out.println(p1.getTip());
    p1.setTip(6);
    System.out.println(p1.getTip());
  }
}

class Pen{
  private String color;
  private int tip;
  // Getter
  String getcolor(){
    return this.color;
  }
  int getTip(){
    return this.tip;
  }
  // Setter
  void setcolor(String newcolor){
    color=newcolor;
  }
  void setTip(int newTip){
    tip=newTip;
  }
}
