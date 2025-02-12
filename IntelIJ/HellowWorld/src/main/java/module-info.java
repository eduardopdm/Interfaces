module helloworld.hellowworld {
    requires javafx.controls;
    requires javafx.fxml;


    opens helloworld to javafx.fxml;
    exports helloworld;
}