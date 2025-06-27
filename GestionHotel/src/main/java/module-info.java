module com.mycompany.gestionhotel {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;

    opens com.mycompany.gestionhotel to javafx.fxml;
    exports com.mycompany.gestionhotel;
}
