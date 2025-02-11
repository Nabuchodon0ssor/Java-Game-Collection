module Minesweeper {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.media;

    opens main.java.com.minesweeper to javafx.graphics;
}