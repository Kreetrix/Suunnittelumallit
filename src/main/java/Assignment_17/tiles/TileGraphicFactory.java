package Assignment_17.tiles;

import java.util.EnumMap;
import java.util.Map;

import Assignment_17.TileImage;
import Assignment_17.TileType;

public class TileGraphicFactory {
    private static final Map<TileType, TileImage> images = new EnumMap<>(TileType.class);

    public static TileImage getTileImage(TileType type) {
        TileImage image = images.get(type);
        if (image == null) {
            switch (type) {
                case FOREST:
                    image = new TileImage("images/forest_tile.png", "forest tile");
                    break;
                case WATER:
                    image = new TileImage("images/water_tile.png", "water tile");
                    break;
                case ROAD:
                    image = new TileImage("images/road_tile.png", "road tile");
                    break;
                case SWAMP:
                    image = new TileImage("images/swamp_tile.png", "swamp tile");
                    break;
                case BUILDING:
                    image = new TileImage("images/building_tile.png", "building tile");
                    break;
            }
            images.put(type, image);
        }
        return image;
    }
}
