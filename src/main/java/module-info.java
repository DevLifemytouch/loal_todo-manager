module at.htlkaindorf.loal_todomanager {
    requires javafx.controls;
    requires javafx.fxml;


    opens at.htlkaindorf.loal_todomanager to javafx.fxml;
    exports at.htlkaindorf.loal_todomanager;
}