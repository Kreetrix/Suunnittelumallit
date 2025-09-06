package Assignment_7.states;

import Assignment_7.Game;
import Assignment_7.absctactions.State;

public class ExpertState extends State {

    public ExpertState(Game game) {
        super(game);
    }

    @Override
    public void action() {
        String[] options = { "Train", "Meditate", "Fight", "Show stats" };
        switch (this.game.readInput(options)) {
            case 1:
                this.actions.train();
                break;
            case 2:
                this.actions.meditate();
                break;
            case 3:
                this.actions.fight();
                break;
            case 4:
                this.actions.stats();
                break;
        }
    }

}
