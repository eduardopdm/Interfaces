module epdm.colorfulcircles {
    requires javafx.controls;
    requires javafx.fxml;


    opens epdm.colorfulcircles to javafx.fxml;
    exports epdm.colorfulcircles;
}