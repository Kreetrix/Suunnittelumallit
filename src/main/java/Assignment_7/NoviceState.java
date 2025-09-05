package Assignment_7;

import Assignment_7.absctactions.State;

public class NoviceState extends State {

    public NoviceState(Game game) {
        super(game);
    }

    @Override
    public void action() {
        String[] options = { "Train" };
        switch (this.game.readInput(options)) {
            case 1:
                this.actions.train();
                break;
        }
    }

}
