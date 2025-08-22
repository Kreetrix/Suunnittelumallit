package src;
import java.util.Random;

import src.tiles.*;

public class WildernessMap extends Map{
    @Override
    public Tile createTile(){
        Tile[] classes = {new WaterTile(), new ForestTile(), new SwampTile()};
        Random random = new Random();
        int index = random.nextInt(classes.length);

        return classes[index];
    }
}
