module clube.example {
    requires javafx.controls;
    requires javafx.fxml;

    opens clube.example to javafx.fxml;
    exports clube.example;
}
