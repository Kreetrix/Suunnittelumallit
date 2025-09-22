package Assignment_11;

import java.util.ArrayList;
import java.util.List;

public class Controller {
    private Model model;
    private Gui gui;
    private List<IMemento> history; // Memento history
    private List<IMemento> redoHistory;
    private boolean undoDone;

    public Controller(Gui gui) {
        this.model = new Model();
        this.gui = gui;
        this.history = new ArrayList<>();
        this.redoHistory = new ArrayList<>();
        this.undoDone = false;
    }

    public void setOption(int optionNumber, int choice) {
        saveToHistory();
        model.setOption(optionNumber, choice);
        saveToRedoHistory();
    }

    public int getOption(int optionNumber) {
        return model.getOption(optionNumber);
    }

    public void setIsSelected(boolean isSelected) {
        saveToHistory();
        model.setIsSelected(isSelected);
        saveToRedoHistory();
    }

    public boolean getIsSelected() {
        return model.getIsSelected();
    }

    public void undo() {
        if (!history.isEmpty()) {
            System.out.println("Memento found in history");
            IMemento previousState = history.remove(history.size() - 1);
            model.restoreState(previousState);
            gui.updateGui();
            undoDone = true;
        }
    }

    public void redo() {
        if (!redoHistory.isEmpty() && undoDone) {
            System.out.println("Memento found in history");
            IMemento previousState = redoHistory.remove(0);
            history.add(previousState);
            model.restoreState(previousState);
            gui.updateGui();
        }
    }

    private void saveToHistory() {
        IMemento currentState = model.createMemento();
        history.add(currentState);
    }

    private void saveToRedoHistory() {
        IMemento currentState = model.createMemento();
        undoDone = false;
        redoHistory.add(currentState);
    }

    public List<IMemento> getHistoryList() {
        List<IMemento> h = new ArrayList<>(history);
        if (!redoHistory.isEmpty() && !h.isEmpty() && !undoDone) {
            h.set(h.size() - 1, redoHistory.get(redoHistory.size() - 1));
        }
        return h;
    }

    public void setCurrentState(IMemento selectedItem, int index) {
        history.subList(index, history.size()).clear();
        redoHistory.clear();
        model.restoreState(selectedItem);
        gui.updateGui();

    }
}
