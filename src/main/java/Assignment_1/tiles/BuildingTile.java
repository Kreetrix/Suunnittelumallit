package Assignment_1.tiles;

import Assignment_1.Tile;

public class BuildingTile implements Tile {
    @Override
    public String getCharacter() {
        return "B";
    }

    @Override
    public String getDescription() {
        return "tile with a building";
    }

    @Override
    public void action() {
    }
}
