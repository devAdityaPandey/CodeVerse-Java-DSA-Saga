public class Interfaces {
    public static void main(String args[]) {
        Queen q = new Queen();
        q.moves();
    }
}

interface ChessPlayer {
    void moves();
}

class Queen implements ChessPlayer {
    public void moves() {
        System.out.println("left, right, up, down, diagonal (in all directions)");
    }
}

class Rook implements ChessPlayer {
    public void moves() {
        System.out.println("left, right, up, down");
    }
}

class Pawn implements ChessPlayer {
    public void moves() {
        System.out.println("up");
    }
}

class King implements ChessPlayer {
    public void moves() {
        System.out.println("left, right, up, down, diagonal(one step)");
    }
}

// Complete the notes of abstract classes for constructor point.
// Code for multiple intheritence... (herbivore, carnivore, bear)...