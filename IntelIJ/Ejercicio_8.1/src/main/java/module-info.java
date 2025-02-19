module epdm.ejercicios_layouts {
    requires javafx.controls;
    requires javafx.fxml;


    opens epdm.ejercicios_layouts to javafx.fxml;
    exports epdm.ejercicios_layouts;
}