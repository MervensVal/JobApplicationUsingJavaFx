package application.signup;

import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import application.Main;
import application.form.FormController;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;

public class SignupController {
	private Main main;
	private FormController form;
	
	@FXML
	private TextField firstName;
	
	@FXML
	private TextField lastName;
	
	@FXML
	private TextField email;
	
	@FXML
	private PasswordField password;
	
	@FXML
	private PasswordField retypePassword;
	
	@FXML
	private Label failMessage;
	
	@FXML
	private Label failMessageEmail;

	@FXML 
	private void showForm(ActionEvent event) throws IOException {
		
		
		
		if ( passwordValidation() && emailValidation()) { 
			main.showFormScene();
		}
	
	}
	
	private boolean passwordValidation() {
		String passordText = password.getText(); 
		String retypePasswordText = retypePassword.getText();
		if (passordText.equals(retypePasswordText) && passordText.length() < 15 && !passordText.equals("")) {
				return true;
		}
		else {
			failMessage.setText("Error. Password mismatch or field(s) left blank or lenth>15");
			failMessage.setTextFill(Color.INDIANRED);
			return false;
		}
	}
	
	private boolean emailValidation() {
		Pattern p = Pattern.compile("[a-zA-Z0-9][a-zA-Z0-9._]*@[a-zA-Z0-9]+([.][a-zA-Z]+)+");
		Matcher m = p.matcher(email.getText());
		if (m.find() && m.group().equals(email.getText()) && !email.getText().equals("")) {
		return true;
		}
		else {
			/*Alert alert = new Alert( AlertType.WARNING);
			alert.setTitle("Validate Email");
			alert.setContentText("Email Error. Correct Email Format");
			alert.showAndWait();
			*/
			failMessageEmail.setText("Email Error. Correct Email Format");
			failMessageEmail.setTextFill(Color.INDIANRED);
			return false;
		}
	}
	
}
