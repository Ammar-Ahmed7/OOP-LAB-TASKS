module com.example.dbjavafxassignment {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires java.sql;

    opens com.example.dbjavafxassignment to javafx.fxml;
    exports com.example.dbjavafxassignment;
}