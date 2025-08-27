package Assignment_1.tiles;

import Assignment_1.Tile;

public class ForestTile implements Tile {
    @Override
    public String getCharacter() {
        return "F";
    }

    @Override
    public String getDescription() {
        return "tile but with trees";
    }

    @Override
    public void action() {
    }
}
