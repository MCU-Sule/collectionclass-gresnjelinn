module com.example.pt02collection2072028 {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.example.pt02collection2072028 to javafx.fxml;
    opens com.example.pt02collection2072028.model to javafx.fxml;
    exports com.example.pt02collection2072028;
    exports com.example.pt02collection2072028.model;
}