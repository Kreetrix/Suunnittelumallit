package Assignment_22;

public class PixelGrid {
    private boolean[][] pixels = new boolean[8][8];
    private int cursorX = 0;
    private int cursorY = 0;

    public void moveUp() {
        if (cursorY > 0)
            cursorY--;
    }

    public void moveDown() {
        if (cursorY < 7)
            cursorY++;
    }

    public void moveLeft() {
        if (cursorX > 0)
            cursorX--;
    }

    public void moveRight() {
        if (cursorX < 7)
            cursorX++;
    }

    public void togglePixel() {
        pixels[cursorY][cursorX] = !pixels[cursorY][cursorX];
    }

    public void generateCode() {
        System.out.println("Pixel art result: ");
        for (int i = 0; i < 8; i++) {
            System.out.print("[");
            for (int j = 0; j < 8; j++) {
                System.out.print(pixels[i][j] ? 1 : 0);
                if (j < 7)
                    System.out.print(" ");
            }
            System.out.println("]");
        }
    }

    public boolean isPixelOn(int row, int col) {
        return pixels[row][col];
    }

    public int getCursorX() {
        return cursorX;
    }

    public int getCursorY() {
        return cursorY;
    }
}