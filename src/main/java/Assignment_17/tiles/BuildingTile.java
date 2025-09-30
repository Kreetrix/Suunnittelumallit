package Assignment_17.tiles;

import Assignment_17.Tile;
import Assignment_17.TileImage;
import Assignment_17.TileType;

public class BuildingTile implements Tile {
    @Override
    public TileImage getImage() {
        return TileGraphicFactory.getTileImage(TileType.BUILDING);
    }

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
