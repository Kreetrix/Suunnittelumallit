import java.util.Random;

public class CityMap extends Map {
    
    @Override
    public Tile createTile(){
        Tile[] classes = {new RoadTile(), new BuildingTile()};
        Random random = new Random();
        int index = random.nextInt(classes.length);

        return classes[index];
    }
}