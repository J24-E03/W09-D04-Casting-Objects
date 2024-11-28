import gaming.Chess;
import gaming.Game;

public class Main {
    public static void main(String[] args) {

        Chess chess1 = new Chess();
        Game newGame1 = (Game) chess1;

        newGame1.play();

        Game newGame2 = new Chess();
        Chess chess2 = (Chess) newGame2;
        
        chess2.play();


    }
}