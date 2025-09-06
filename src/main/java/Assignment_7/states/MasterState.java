package Assignment_7.states;

import Assignment_7.Game;
import Assignment_7.absctactions.State;

public class MasterState extends State {

    public MasterState(Game game) {
        super(game);
    }

    @Override
    public void action() {
        System.out.println("You've finished the game");
        this.game.gameStop();
    }

}
