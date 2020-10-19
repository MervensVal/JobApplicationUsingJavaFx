package application.form;

import java.io.IOException;
import application.Main;
import application.signup.SignupController;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class FormController {
	
	Main main;
	SignupController signup;
	
	@FXML
	private Label applicationIDLabel;
	
	@FXML
	private Label applicationIDNum;
	
	@FXML
	private Label submitbtn;
	/*
	@FXML
	public void createAppID(){
		long appID = (long)(Math.random()*1000000000);
		String appIDString = Long.toString(appID);
		String officialID = "J"+appIDString;
		applicationIDNum.setText(officialID);
	}
	*/
	@FXML
	public void showFinalPage() throws IOException {
		main.lastPage();
		//createAppID();
	}

}
