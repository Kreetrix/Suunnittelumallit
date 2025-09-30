package Assignment_17;

import javafx.scene.image.Image;

public class Game {
    private static final int GRID_WIDTH = 8;
    private static final int GRID_HEIGHT = 5;
    private TileImage[][] matrix;

    public Game() {
        matrix = new TileImage[GRID_HEIGHT][GRID_WIDTH];
    }

    public void main() {
        createMap();
    }

    public void createMap() {
        // Map map = new WildernessMap();
        Map map = new CityMap();

        for (int i = 0; i < GRID_HEIGHT; i++) {
            for (int j = 0; j < GRID_WIDTH; j++) {
                matrix[i][j] = map.createTile().getImage();
            }
        }

        // map.display(height, matrix);
    }

    public Image getTreeImage(int row, int col) {
        TileImage tile = matrix[row][col];
        return tile.getImage();
    }

    public int getGridHeight() {
        return GRID_HEIGHT;
    }

    public int getGridWidth() {
        return GRID_WIDTH;
    }
}