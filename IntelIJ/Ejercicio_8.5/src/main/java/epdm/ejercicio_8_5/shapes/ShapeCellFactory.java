package epdm.ejercicio_8_5.shapes;

import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.util.Callback;

public class ShapeCellFactory implements Callback<ListView<String>, ListCell<String>> {

    @Override
    public ListCell<String> call(ListView<String> stringListView) {
        return new ShapeCell();
    }
}
