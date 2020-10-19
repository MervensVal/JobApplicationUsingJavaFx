package application.view;

import java.io.IOException;

import application.Main;
import javafx.fxml.FXML;

public class HomePageController {

	private Main main;
	
	@FXML
	private void showLogin() throws IOException {
		main.showLoginScene();
	}
	
	@FXML
	private void showCreateAccount() throws IOException {
		main.showCreateAccountScene();
	}
	
}
