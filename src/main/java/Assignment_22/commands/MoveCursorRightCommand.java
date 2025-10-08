package Assignment_22.commands;

import Assignment_22.Command;
import Assignment_22.PixelGrid;

public class MoveCursorRightCommand implements Command {
    private PixelGrid grid;

    public MoveCursorRightCommand(PixelGrid grid) {
        this.grid = grid;
    }

    @Override
    public void execute() {
        grid.moveRight();
    }
}