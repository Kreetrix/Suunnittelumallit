package Assignment_7.states;

import Assignment_7.Game;
import Assignment_7.absctactions.State;

public class NoviceState extends State {

    public NoviceState(Game game) {
        super(game);
    }

    @Override
    public void action() {
        String[] options = { "Train", "Show stats" };
        switch (this.game.readInput(options)) {
            case 1:
                this.actions.train();
                break;
            case 2:
                this.actions.stats();
                break;
        }
    }

}
