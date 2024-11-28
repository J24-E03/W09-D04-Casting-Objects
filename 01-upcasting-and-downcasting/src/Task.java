public class Task {
    public static void main(String[] args) throws ClassCastException {
        Game game = new Chess();
        game.play();

        Chess chess;
        try {
            chess = (Chess) new Game();
            chess.play();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
