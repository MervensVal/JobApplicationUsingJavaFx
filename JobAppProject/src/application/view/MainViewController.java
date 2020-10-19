package application.view;

import java.io.IOException;

import application.Main;
import javafx.fxml.FXML;

public class MainViewController {
	
	private Main main;
	
	@FXML
	private void goToHome() throws IOException {
		main.showHomePage();
	}
	
	@FXML 
	private void goHelpBox() throws IOException {
		main.displayHelpBox();
	}

}
