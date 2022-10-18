module hari.fx.learnfx {
    requires javafx.controls;
    requires javafx.fxml;


    opens hari.fx.learnfx to javafx.fxml;
    exports hari.fx.learnfx;
}