module com.sitesdoarthur.teste {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.webEmpty;
    requires javafx.web;
    requires java.base;
    requires java.desktop;
    requires org.json;

    opens com.sitesdoarthur.teste to javafx.fxml;
    exports com.sitesdoarthur.teste;
}
