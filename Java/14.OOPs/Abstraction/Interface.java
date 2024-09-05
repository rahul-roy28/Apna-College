/**
 * Interface
 */
public class Interface {

  public static void main(String[] args) {
    Queen q=new Queen();
    q.moves();
    Bear b=new Bear();
    b.eat_grass();
    b.eat_meet();
  }
}
interface Chessplayer{
  void moves();
}

class Queen implements Chessplayer{

  public void moves(){
    System.out.println("up,right,left,down,diagonal-(in all 4 diorections)");
  }
}
class King implements Chessplayer{

  public void moves(){
    System.out.println("up,right,left,down,diagonal-(by 1 steps)");
  }
}
class Rook implements Chessplayer{

  public void moves(){
    System.out.println("up,right,left,down");
  }
}

// Home Work problem
// **Multiple Inheritance
interface Herbivore{
  void eat_grass();
}
interface Carnivore{
  void eat_meet();
}

class Bear implements Herbivore,Carnivore{
  public void eat_grass(){
    System.out.println("Eats grass");
  }
  public void eat_meet(){
    System.out.println("Eats meat");
  }
}