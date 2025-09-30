package Assignment_17.tiles;

import Assignment_17.Tile;
import Assignment_17.TileImage;
import Assignment_17.TileType;

public class ForestTile implements Tile {
    @Override
    public TileImage getImage() {
        return TileGraphicFactory.getTileImage(TileType.FOREST);
    }

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
