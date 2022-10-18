module com.example.startfx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.startfx to javafx.fxml;
    exports com.example.startfx;
}