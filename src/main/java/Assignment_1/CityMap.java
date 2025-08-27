package Assignment_1;

import java.util.Random;

import Assignment_1.tiles.*;

public class CityMap extends Map {

    @Override
    public Tile createTile() {
        Tile[] classes = { new RoadTile(), new BuildingTile() };
        Random random = new Random();
        int index = random.nextInt(classes.length);

        return classes[index];
    }
}