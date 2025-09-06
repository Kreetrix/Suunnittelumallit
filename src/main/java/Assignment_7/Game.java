package Assignment_7;

import java.util.Scanner;

import Assignment_7.absctactions.State;
import Assignment_7.states.ExpertState;
import Assignment_7.states.IntermediateState;
import Assignment_7.states.MasterState;
import Assignment_7.states.NoviceState;

public class Game {
    public Player player;
    protected State state;
    protected boolean gameOn = true;

    public Game(Player player) {
        this.player = player;
        state = new NoviceState(this);
    }

    private static Scanner scanner = new Scanner(System.in);

    public void gameStop() {
        gameOn = false;
    }

    public void start() {
        while (this.gameOn) {
            if (state == null) {
                System.out.println("Something went wrong");
                return;
            }
            state.action();
        }
    }

    private void levelUpMessage() {
        System.out.println("\nNew level - " + this.player.level);
        if (this.player.level != Levels.MASTER) {
            System.out.println("Exp for next level - " + (this.player.level.getThreshold() - this.player.EXP));
        } else
            System.out.println("\nYou have reach the max level!");

    }

    public void checkLevelUp() {
        if (this.player.EXP >= Levels.NOVICE.getThreshold() && this.player.level == Levels.NOVICE) {
            this.player.level = Levels.INTERMEDIATE;
            this.levelUpMessage();
            this.setState(new IntermediateState(this));
            return;
        }
        if (this.player.EXP >= Levels.INTERMEDIATE.getThreshold() && this.player.level == Levels.INTERMEDIATE) {
            this.player.level = Levels.EXPERT;
            this.levelUpMessage();
            this.setState(new ExpertState(this));
            return;
        }
        if (this.player.EXP >= Levels.EXPERT.getThreshold() && this.player.level == Levels.EXPERT) {
            this.player.level = Levels.MASTER;
            this.levelUpMessage();
            this.setState(new MasterState(this));
            return;
        } else if (this.player.level != Levels.MASTER) {
            System.out.println("\nEXP for next level - "
                    + (this.player.level.getThreshold() - this.player.EXP));
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
        System.out.println();
        return scanner.nextInt();
    }
}
