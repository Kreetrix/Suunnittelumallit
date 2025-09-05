package Assignment_7.absctactions;

import Assignment_7.Player;

public abstract class Levels {
    protected Player player;

    public Levels(Player player) {
        this.player = player;
    }

    public abstract void isNovice();

    public abstract void isIntermediate();

    public abstract void isExpert();

    public abstract void isMaster();

}
