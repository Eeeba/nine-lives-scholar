module com.ninelivesscholar.ninelivesscholar {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.ikonli.javafx;
    requires javafx.graphics;

    opens com.ninelivesscholar.ninelivesscholar to javafx.fxml;
    exports com.ninelivesscholar.ninelivesscholar;
}