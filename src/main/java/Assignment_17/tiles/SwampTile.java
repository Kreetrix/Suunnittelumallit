package Assignment_17.tiles;

import Assignment_17.Tile;
import Assignment_17.TileImage;
import Assignment_17.TileType;

public class SwampTile implements Tile {
    @Override
    public TileImage getImage() {
        return TileGraphicFactory.getTileImage(TileType.SWAMP);
    }

    @Override
    public String getCharacter() {
        return "S";
    }

    @Override
    public String getDescription() {
        return "It's like water but different";
    }

    @Override
    public void action() {
    }
}
