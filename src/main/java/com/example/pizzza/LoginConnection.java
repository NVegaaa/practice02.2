package com.example.pizzza;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginConnection {
    public boolean checkLogin(String login, String password){
        String query = "SELECT * FROM clients WHERE login = ? AND password = ?";
        try (Connection connection = DBConnection.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setString(1, login);
            preparedStatement.setString(2, password);
            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                return resultSet.next();  // возвращает true, если совпадение найдено, иначе - false
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public void createUser(String name, String surname, String login, String password){
        String query = "INSERT INTO clients(surname, name, login, password) VALUES (?, ?, ?, ?)";
        try(Connection connection = DBConnection.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(query)){
            preparedStatement.setString(1, surname);
            preparedStatement.setString(2, name);
            preparedStatement.setString(3, login);
            preparedStatement.setString(4, password);

            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
