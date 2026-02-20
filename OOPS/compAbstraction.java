package OOPS;

public class compAbstraction {
    public static void main(String args[]){
      Queen q = new Queen();
      q.moves();
    }
}

interface Chessplayer {
    void moves();
}

class Queen implements Chessplayer{
    public void moves(){
        System.out.println("up, down , left , right, diagonal, in all direction");
    }
}

class Rook implements Chessplayer{
    public void moves(){
        System.out.println("up, down , left ,right ");
    }
}