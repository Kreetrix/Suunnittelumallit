package Assignment_7;

public class Player {
    protected Levels level = Levels.NOVICE;
    protected int HP = 100;
    protected int EXP = 0;

    public Stats getStats() {
        return new Stats(level, EXP, HP);
    }

}
