package Assignment_17;

import java.util.Arrays;

public abstract class Map {

    public abstract Tile createTile();

    public void display(int n, String[][] matrix) {
        for (int i = 0; i < n; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }
    }
}