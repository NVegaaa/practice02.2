package com.example.pizzza;


import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class Basket {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button back;

    @FXML
    void initialize() {
        back.setOnAction(event ->{
            back.getScene().getWindow().hide();


            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("firstmenu.fxml"));


            try {
                loader.load();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }


            Parent root = loader.getRoot();
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.show();

        });

    }

}
