module helloworld.fxmlexample {
    requires javafx.controls;
    requires javafx.fxml;


    opens helloworld.fxmlexample to javafx.fxml;
    exports helloworld.fxmlexample;
}