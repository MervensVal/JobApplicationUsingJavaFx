package application.login;

import java.io.IOException;

import application.Main;
import application.signup.SignupController;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginController {
private Main main; 

	@FXML 
	private TextField email;
	
	@FXML
	private PasswordField password;
	
	//Method that searches database for email is needed
	//If email does not exist in database display error
	
	//Method that compares email to password is needed
	//If email does not match password display error

	@FXML
	private void showForm() throws IOException {
		main.showFormScene();
	}
	
	@FXML
	private void showForgotPassword() throws IOException {
		main.forgotPassword();
	}
}
