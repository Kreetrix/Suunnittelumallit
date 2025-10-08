package Assignment_22.commands;

import Assignment_22.Command;
import Assignment_22.PixelGrid;

public class MoveCursorLeftCommand implements Command {
    private PixelGrid grid;

    public MoveCursorLeftCommand(PixelGrid grid) {
        this.grid = grid;
    }

    @Override
    public void execute() {
        grid.moveLeft();
    }
}