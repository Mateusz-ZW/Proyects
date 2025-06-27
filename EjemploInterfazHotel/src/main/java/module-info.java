module com.mycompany.ejemplointerfazhotel {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;

    opens com.mycompany.ejemplointerfazhotel to javafx.fxml;
    exports com.mycompany.ejemplointerfazhotel;
}
