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
        this.game.player.HP += 10;
        System.out.println("\nGained 10 HP");
        System.out.println("Current HP - " + this.game.player.HP);
    };

    public void fight() {
        this.game.player.HP -= 20;
        System.out.println("\nLost 20 HP");
        System.out.println("Current HP - " + this.game.player.HP);
        if (this.game.player.HP <= 0) {
            System.out.println("\nGame over!");
            this.game.gameStop();
            return;
        }
        this.game.player.EXP += 150;
        this.game.checkLevelUp();
    };

    public void stats() {
        System.out.println(this.game.player.getStats());
    }
}
