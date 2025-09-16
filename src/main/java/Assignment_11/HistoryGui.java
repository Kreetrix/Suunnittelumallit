package Assignment_11;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.List;
import java.util.function.Consumer;

public class HistoryGui {

    private Stage stage;
    private ListView<IMemento> listView;
    private ObservableList<IMemento> items;
    private Consumer<IMemento> onItemClick;

    public HistoryGui() {
        stage = new Stage();

        items = FXCollections.observableArrayList();
        listView = new ListView<>(items);

        listView.setOnMouseClicked(e -> {
            IMemento selected = listView.getSelectionModel().getSelectedItem();
            if (selected != null && onItemClick != null) {
                onItemClick.accept(selected);
            }
        });

        VBox root = new VBox(listView);
        stage.setScene(new Scene(root, 400, 300));
        stage.setTitle("History");
    }

    public void show() {
        stage.show();
    }

    public void addLine(IMemento line) {
        items.add(line);
    }

    public void setLines(List<IMemento> lines) {
        items.setAll(lines);
    }

    public void setOnItemClick(Consumer<IMemento> callback) {
        this.onItemClick = callback;
    }

    public ListView<IMemento> getListView() {
        return listView;
    }
}
