module epdm.ejercicio_8_5 {
    requires javafx.controls;
    requires javafx.fxml;


    opens epdm.ejercicio_8_5 to javafx.fxml;
    exports epdm.ejercicio_8_5;
    exports epdm.ejercicio_8_5.shapes;
    exports epdm.ejercicio_8_5.order;
    opens epdm.ejercicio_8_5.shapes to javafx.fxml;
}