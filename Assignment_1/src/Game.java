package src;

public class Game {

    public void main() {
        int size = 10;
        createMap(size);
    }
    public static void createMap(int size){
        Map map = new WildernessMap();

        String[][] matrix = new String[size][size];
        
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = map.createTile().getCharacter();;
            }
        }
        
        map.display(size, matrix);
    }
}