package src.tiles;

import src.Tile;

public class SwampTile implements Tile {
    @Override
    public String getCharacter() {
        return "S";
    }

    @Override
    public String getDescription() {
        return "It's like water but different";
    }

    @Override
    public void action() {}
}
