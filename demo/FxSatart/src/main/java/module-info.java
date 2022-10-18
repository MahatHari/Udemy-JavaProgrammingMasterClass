module com.example.fxsatart {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens com.example.fxsatart to javafx.fxml;
    exports com.example.fxsatart;
}