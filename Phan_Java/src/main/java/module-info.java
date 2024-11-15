module com.andersen.tasks.phan_java {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens com.andersen.tasks.phan_java to javafx.fxml;
    exports com.andersen.tasks.phan_java;
}