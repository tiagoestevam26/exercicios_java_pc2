module com.memoria {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.memoria to javafx.fxml;
    exports com.memoria;
}
