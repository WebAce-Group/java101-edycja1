package me.webace.zajecia6;

import javafx.beans.value.ChangeListener;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import me.webace.zajecia6.database.DatabaseController;
import me.webace.zajecia6.database.User;

public class HelloController {
    @FXML
    public TextField usernameField;

    @FXML
    public TextField emailField;

    @FXML
    public PasswordField passwordField;

    @FXML
    public Text actionLabel;

    DatabaseController dbController;

    boolean isUserAdded = false;

    public void createDatabase(){
        dbController = new DatabaseController();
    }

    public void handleAddUserClick() {
        String username = usernameField.getText();
        String email = emailField.getText();
        String password = passwordField.getText();
        boolean ifAdded = dbController.addUser(new User(username, email, password));
        if (ifAdded) {
            actionLabel.setText("User added to database");
            isUserAdded = true;
            usernameField.focusedProperty().addListener(focusListener);
            emailField.focusedProperty().addListener(focusListener);
            passwordField.focusedProperty().addListener(focusListener);
        }
    }

    public void clearFields(){
        usernameField.setText("");
        emailField.setText("");
        passwordField.setText("");
        actionLabel.setText("");
    }

    ChangeListener<Boolean> focusListener = ((observableValue, oldValue, newValue) -> {
        if (newValue && isUserAdded){
            clearFields();
            isUserAdded = false;
        }
    });

}