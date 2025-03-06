package epdm.ejercicio_8_5;

import epdm.ejercicio_8_5.order.ImageCell;
import epdm.ejercicio_8_5.order.Order;
import epdm.ejercicio_8_5.shapes.ShapeCell;
import epdm.ejercicio_8_5.shapes.ShapeCellFactory;
import javafx.beans.property.SimpleStringProperty;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableCell;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class Controller5 {

    @FXML
    public ComboBox shapes;

    @FXML
    public TableView tablaPedidos;
    @FXML
    public TableColumn<Order, Integer> orderId;
    @FXML
    public TableColumn<Order, Boolean> priority;
    @FXML
    public TableColumn<Order, Integer> courier;
    @FXML
    public TableColumn<Order, String> cost;
    @FXML
    public TableColumn<Order, String> driver;


    @FXML
    public void initialize() {
        shapes.getItems().addAll("Line", "Rectangle", "Circle", "Text");
        shapes.setCellFactory(new ShapeCellFactory());
        shapes.setButtonCell(new ShapeCell());

        tablaPedidos.setEditable(true);

        tablaPedidos.getItems().add(new Order(1, false, 0, 0.07, "Ellen Jowels"));
        tablaPedidos.getItems().add(new Order(2, true, 1, 0.08, "Eric Northope"));
        tablaPedidos.getItems().add(new Order(3, false, 0, 0.15, "Stella Gerrard"));

        orderId.setCellValueFactory(new PropertyValueFactory<>("orderId"));
        priority.setCellValueFactory(new PropertyValueFactory<>("priority"));
        courier.setCellValueFactory(new PropertyValueFactory<>("courier"));
        cost.setCellValueFactory(new PropertyValueFactory<>("cost"));
        driver.setCellValueFactory(new PropertyValueFactory<>("driver"));

        priority.setCellFactory(_ -> new ImageCell());

        cost.setCellValueFactory(data -> new SimpleStringProperty("$" + data.getValue().getCost()));
    }

}