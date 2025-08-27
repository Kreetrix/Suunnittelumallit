package Assignment_1.tiles;

import Assignment_1.Tile;

public class RoadTile implements Tile {
    @Override
    public String getCharacter() {
        return "R";
    }

    @Override
    public String getDescription() {
        return "Road that one may walk on";
    }

    @Override
    public void action() {
    }
}
