package Assignment_22.commands;

import Assignment_22.Command;
import Assignment_22.PixelGrid;

public class TogglePixelCommand implements Command {
    private PixelGrid grid;

    public TogglePixelCommand(PixelGrid grid) {
        this.grid = grid;
    }

    @Override
    public void execute() {
        grid.togglePixel();
    }
}