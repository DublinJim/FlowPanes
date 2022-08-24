module com.example.flowpanes {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.example.flowpanes to javafx.fxml;
    exports com.example.flowpanes;
}