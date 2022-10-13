module com.example.jfxcontrols {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.jfxcontrols to javafx.fxml;
    exports com.example.jfxcontrols;
}