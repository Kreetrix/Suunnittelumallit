package Assignment_1;

import java.util.Random;

import Assignment_1.tiles.*;

public class WildernessMap extends Map {
    @Override
    public Tile createTile() {
        Tile[] classes = { new WaterTile(), new ForestTile(), new SwampTile() };
        Random random = new Random();
        int index = random.nextInt(classes.length);

        return classes[index];
    }
}
