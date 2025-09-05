package Assignment_7;

public class Actions {
    protected Game game;

    public Actions(Game game) {
        this.game = game;
    }

    public void train() {
        this.game.player.EXP += 50;
        this.game.checkLevelUp();
    };

    public void meditate() {
    };

    public void fight() {
    };
}
