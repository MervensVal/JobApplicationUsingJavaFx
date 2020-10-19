package application.login;

import application.Main;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class ForgotPassController {
	private Main main;
	
	@FXML
	TextField typeemail;
	
	@FXML
	public void closeForgotPass() {
		main.closeForgotPass();
	}
	
}
