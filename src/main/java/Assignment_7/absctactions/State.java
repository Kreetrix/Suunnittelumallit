package Assignment_7.absctactions;

import Assignment_7.Actions;
import Assignment_7.Game;

public abstract class State {
    protected Game game;
    protected Actions actions;

    public State(Game game) {
        this.game = game;
        this.actions = new Actions(game);
    }

    public Game getGame() {
        return game;
    }

    public abstract void action();
}
