package com.example.pizzza;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class FirstMenu {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private ImageView ChChiken;

    @FXML
    private ImageView Chiken;

    @FXML
    private ImageView Fourch;

    @FXML
    private ImageView Hamch;

    @FXML
    private ImageView Margarita;

    @FXML
    private ImageView Mushroom;

    @FXML
    private ImageView Pepperoni;

    @FXML
    private Button basket;

    @FXML
    private Button ch;

    @FXML
    private Button chch;

    @FXML
    private Button cream;

    @FXML
    private ImageView creamy;

    @FXML
    private Button fourchick;

    @FXML
    private Button hum;

    @FXML
    private Button info;

    @FXML
    private Button marg;

    @FXML
    private Button mush;

    @FXML
    private Button pepper;

    @FXML
    private Button profile;

    @FXML
    private Button ven;

    @FXML
    private ImageView venice;

    @FXML
    void initialize(MouseEvent event) {

    }

    @FXML
    void initialize() {

        profile.setOnAction(event ->{
            profile.getScene().getWindow().hide();


            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("profile.fxml"));


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

        info.setOnAction(event ->{
            info.getScene().getWindow().hide();


            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("info.fxml"));


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

        basket.setOnAction(event ->{
            basket.getScene().getWindow().hide();


            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("basket.fxml"));


            try {
                loader.load();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }


            Parent root = loader.getRoot();
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.showAndWait();

        });



    }

}