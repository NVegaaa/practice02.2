package com.example.pizzza;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.scene.Node;
import javafx.event.ActionEvent;

public class HelloController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button loginbut;

    @FXML
    private TextField loginfield;

    @FXML
    private PasswordField passwordfield;

    @FXML
    private Button register;

    @FXML
    //void initialize() {
        //register.setOnAction(event ->{
        //    register.getScene().getWindow().hide();

        //    FXMLLoader loader = new FXMLLoader();
        //    loader.setLocation(getClass().getResource("register.fxml"));


        //    try {
        //        loader.load();
        //    } catch (IOException e) {
        //        throw new RuntimeException(e);
        //    }

        //    Parent root = loader.getRoot();
        //    Stage stage = new Stage();
        //    stage.setScene(new Scene(root));
        //    stage.showAndWait();
        //});


            //login.setOnAction(event ->{
            //login.getScene().getWindow().hide();


            //FXMLLoader loader = new FXMLLoader();
            //loader.setLocation(getClass().getResource("firstmenu.fxml"));


            //try {
            //    loader.load();
            //} catch (IOException e) {
            //    throw new RuntimeException(e);
            //}


            //Parent root = loader.getRoot();
            //Stage stage = new Stage();
            //stage.setScene(new Scene(root));
            //stage.showAndWait();

        //});

    private void loginButClicked(ActionEvent event) {
        String login = loginfield.getText();
        String password = passwordfield.getText();
        LoginConnection loginConnection = new LoginConnection();

        if (loginConnection.checkLogin(login, password)) {
            try {
                FXMLLoader loader = new FXMLLoader(getClass().getResource("firstmenu.fxml"));
                Parent root = loader.load();
                Stage stage = new Stage();
                stage.setScene(new Scene(root));

                Node source = (Node) event.getSource();
                Stage currentStage = (Stage) source.getScene().getWindow();
                currentStage.close();

                stage.show();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("Error");
        }
    }

    @FXML
    private void goToRegister(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("registration.fxml"));
        Stage stage = (Stage) register.getScene().getWindow();
        stage.setScene(new Scene(root));
    }
}




