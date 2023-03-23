module net.golbarg.gdm.gdownloadmanager {
    requires javafx.controls;
    requires javafx.fxml;


    opens net.golbarg.gdm.gdownloadmanager to javafx.fxml;
    exports net.golbarg.gdm.gdownloadmanager;
}