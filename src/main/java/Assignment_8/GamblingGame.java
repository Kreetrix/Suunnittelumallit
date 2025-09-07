package Assignment_8;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class GamblingGame extends Game {
    ArrayList<String> players = new ArrayList<String>();
    String[] symbols = { "*", "#", "@", "&", "$", "+", "!", "7" };
    Random random = new Random();
    boolean end = false;
    String winner;
    Scanner scanner = new Scanner(System.in);

    @Override
    public void initializeGame(int numberOfPlayers) {
        for (int i = 1; i <= numberOfPlayers; i++) {
            players.add("Player " + i);
        }
        System.out.println("Get all three symbols in order to win");
    }

    @Override
    public boolean endOfGame() {
        if (this.end) {
            scanner.close();
        }
        return this.end;
    }

    @Override
    public void playSingleTurn(int player) {
        String currentPlayer = players.get(player);
        System.out.println("Current player's turn - " + currentPlayer);
        System.out.println("Press enter to game...");

        scanner.nextLine();

        String slot1 = symbols[random.nextInt(symbols.length)];
        String slot2 = symbols[random.nextInt(symbols.length)];
        String slot3 = symbols[random.nextInt(symbols.length)];
        System.out.println("\n+-------------+");
        System.out.println(String.format("| [%s] [%s] [%s] |", slot1, slot2, slot3));
        System.out.println("+-------------+");
        if (slot1.equals(slot2) && slot2.equals(slot3)) {
            this.winner = currentPlayer;
            this.end = true;
        }

    }

    @Override
    public void displayWinner() {
        System.out.println("Winner is - " + this.winner);
    }

}
