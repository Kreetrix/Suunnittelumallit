package Assignment_7;

public class Player {
    protected Levels level = Levels.NOVICE;
    protected int HP = 50;
    protected int EXP = 0;
    protected String name;

    public Player(String name) {
        this.name = name;
    }

    public Stats getStats() {
        return new Stats(this.name, level, EXP, HP);
    }

}
