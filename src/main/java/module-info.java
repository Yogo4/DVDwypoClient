module com.example.dvdwypoclient {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.dvdwypoclient to javafx.fxml;
    exports com.example.dvdwypoclient;
}