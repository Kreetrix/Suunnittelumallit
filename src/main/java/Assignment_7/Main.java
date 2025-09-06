package Assignment_7;

public class Main {
    public static void main(String[] args) {
        String name = "Vesa";
        Player player = new Player(name);
        Game game = new Game(player);
        game.start();
    }
}