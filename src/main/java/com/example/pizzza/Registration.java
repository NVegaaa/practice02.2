package com.example.pizzza;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.event.ActionEvent;

public class Registration {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField LoginReg;

    @FXML
    private TextField NameField;

    @FXML
    private PasswordField PasswordReg;

    @FXML
    private TextField SurnameField;

    @FXML
    private Button registration;

    @FXML
    public void register(ActionEvent event) {
        String Name = NameField.getText();
        String Surname = SurnameField.getText();
        String login = LoginReg.getText();
        String password = PasswordReg.getText();

        LoginConnection loginConnection = new LoginConnection();
        loginConnection.createUser(Name, Surname, login, password);

        Node node = (Node) event.getSource();
        Stage stage = (Stage) node.getScene().getWindow();
        stage.close();

        try{
            FXMLLoader loader = new FXMLLoader(getClass().getResource("hello-view.fxml"));
            Parent root = loader.load();
            Stage primaryStage = new Stage();
            primaryStage.setScene(new Scene(root));
            primaryStage.show();
        }catch (IOException e){
            e.printStackTrace();
        }



        //registration.setOnAction(event -> {
        //    registration.getScene().getWindow().hide();


        //    FXMLLoader loader = new FXMLLoader();
        //    loader.setLocation(getClass().getResource("hello-view.fxml"));


        //    try {
        //        loader.load();
        //    } catch (IOException e) {
        //        throw new RuntimeException(e);
        //    }


        //    Parent root = loader.getRoot();
        //    Stage stage = new Stage();
        //    stage.setScene(new Scene(root));
        //    stage.show();

        //});


    }

}