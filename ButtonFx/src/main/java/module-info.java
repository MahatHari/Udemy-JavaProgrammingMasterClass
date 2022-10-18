module com.example.buttonfx {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens com.example.buttonfx to javafx.fxml;
    exports com.example.buttonfx;
}