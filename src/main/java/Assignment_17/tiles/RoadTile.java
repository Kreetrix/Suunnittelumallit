package Assignment_17.tiles;

import Assignment_17.Tile;
import Assignment_17.TileImage;
import Assignment_17.TileType;

public class RoadTile implements Tile {
    @Override
    public TileImage getImage() {
        return TileGraphicFactory.getTileImage(TileType.ROAD);
    }

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
