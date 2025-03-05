public class nQueen {
  public static boolean isSafe(char board[][], int r, int c) {
    // Up
    for(int i=r-1;i>=0;i--){
      if(board[i][c]=='Q'){
        return false;
      }
    }
    // Left up
    for(int i=r-1, j=c-1;i>=0 && j>=0;i--,j--){
      if(board[i][j]=='Q'){
        return false;
      }
    }
    // Right up
    for(int i=r-1,j=c+1; i>=0 && j<board.length; i--, j++){
      if(board[i][j]=='Q'){
        return false;
      }
    }
    return true;
  }
  public static void queen(char board[][], int r) {
    // Base Case
    if(r==board.length){
      print(board);
      count++;
      return;
    }
    // Column loop
    for(int j=0;j<board.length;j++){
      if(isSafe(board,r,j)){
        board[r][j]='Q';
        queen(board, r+1);
        board[r][j]='*';
      }
      
    }
  }
  public static void print(char board[][]) {
    System.out.println("-----------*****---------");
    for(int i=0;i<board.length;i++){
      for(int j=0;j<board.length;j++){
        System.out.print(board[i][j]+" ");
      }
      System.out.println();
    }
  } 
  static int count=0;
  public static void main(String[] args) {
  int n=5;
  char board[][]=new char[n][n];
  for(int i=0; i<board.length;i++){
    for(int j=0;j<board.length;j++){
      board[i][j]='*';
    }
  }
  queen(board,0);
  System.out.println("Total ways to solve N-Queens : "+ count);
 } 
}
