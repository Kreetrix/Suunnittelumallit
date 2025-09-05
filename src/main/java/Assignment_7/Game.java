package Assignment_7;

import java.util.Scanner;

import Assignment_7.absctactions.State;

public class Game {
    public Player player;
    protected State state;

    public Game(Player player) {
        this.player = player;
        state = new NoviceState(this);
    }

    private static Scanner scanner = new Scanner(System.in);

    public void start() {
        while (true) {
            if (state == null) {
                System.out.println("Machine out of order");
                return;
            }
            state.action();
        }
    }

    private void levelUpMessage(int threshold) {
        System.out.println("New level - " + this.player.level);
        if (this.player.level != Levels.MASTER) {
            System.out.println("Exp for next level - " + (threshold - this.player.EXP));
        } else
            System.out.println("You have reach the max level!");

    }

    public void checkLevelUp() {
        if (this.player.HP >= 100 && this.player.level == Levels.NOVICE) {
            this.player.level = Levels.INTERMEDIATE;
            this.levelUpMessage(Levels.EXPERT.getThreshold());
            return;
        }
        if (this.player.HP >= 300 && this.player.level == Levels.INTERMEDIATE) {
            this.player.level = Levels.EXPERT;
            this.levelUpMessage(Levels.INTERMEDIATE.getThreshold());
            return;
        }
        if (this.player.HP >= 1000 && this.player.level == Levels.EXPERT) {
            this.player.level = Levels.MASTER;
            return;
        } else if (this.player.level != Levels.MASTER) {
            Levels[] levels = Levels.values();
            System.out.println(this.player.level.ordinal());
            System.out.println("EXP for next level - "
                    + (levels[this.player.level.ordinal() + 1].getThreshold() - this.player.EXP));
        }
    }

    public void setState(State state) {
        this.state = state;
    }

    public int readInput(String[] options) {
        System.out.println("\nSelect an option:");
        for (int i = 1; i <= options.length; i++) {
            System.out.println(i + ". " + options[i - 1]);
        }
        return scanner.nextInt();
    }
}
