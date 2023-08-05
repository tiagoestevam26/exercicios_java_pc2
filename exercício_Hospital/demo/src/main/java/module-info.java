module com.pacientes {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.pacientes to javafx.fxml;
    exports com.pacientes;
}
