
public class WaterTile implements Tile {

    @Override
    public String getCharacter() {
        return "W";
    }

    @Override
    public String getDescription() {
        return "A water tile filled with... water";
    }

    @Override
    public void action() {}
    
}