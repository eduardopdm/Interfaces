module epdm.eduardo_perezdemadrid_rodriguez_practica1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens epdm.eduardo_perezdemadrid_rodriguez_practica1 to javafx.fxml;
    exports epdm.eduardo_perezdemadrid_rodriguez_practica1;
}