public class RoadTile implements Tile {
    @Override
    public String getCharacter() {
        return "R";
    }

    @Override
    public String getDescription() {
        return "Road that one may walk on";
    }

    @Override
    public void action() {}
}
