package Assignment_17.tiles;

import Assignment_17.Tile;
import Assignment_17.TileImage;
import Assignment_17.TileType;

public class WaterTile implements Tile {
    @Override
    public TileImage getImage() {
        return TileGraphicFactory.getTileImage(TileType.WATER);
    }

    @Override
    public String getCharacter() {
        return "W";
    }

    @Override
    public String getDescription() {
        return "A water tile filled with... water";
    }

    @Override
    public void action() {
    }

}