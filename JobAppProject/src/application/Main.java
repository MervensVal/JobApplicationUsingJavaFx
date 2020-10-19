package application;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class Main extends Application {

	private static Stage window;
	private static BorderPane mainLayout;
	private static Stage addForgotPassBox;
	@Override
	public void start(Stage primaryStage) throws IOException {
		this.window = primaryStage;
		window.setTitle("Job Application App");
		window.setMinWidth(400);
		window.setMinHeight(450);

		showMainView();
		showHomePage();

	}

	private void showMainView() throws IOException{

		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(Main.class.getResource("view/MainView.fxml"));
		mainLayout = loader.load();
		
		
		Scene scene = new Scene(mainLayout,700,600);
		window.setScene(scene);
		window.show();
	}
	
	public static void  showHomePage() throws IOException {
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(Main.class.getResource("view/HomePage.fxml"));
		BorderPane homePage = loader.load();
		mainLayout.setCenter(homePage);
	}
	
	public static void displayHelpBox() throws IOException {
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(Main.class.getResource("view/Help.fxml"));
		BorderPane helpBox = loader.load();
		
		Stage addHelpBox = new Stage();
		addHelpBox.setTitle("Help with application");
		addHelpBox.initModality(Modality.WINDOW_MODAL);
		addHelpBox.initOwner(window);
		Scene scene = new Scene(helpBox);
		addHelpBox.setScene(scene);
		addHelpBox.showAndWait();
		addHelpBox.setMinHeight(400);
		addHelpBox.setMinHeight(500);
		
	}
	
	public static void showLoginScene() throws IOException {
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(Main.class.getResource("login/login.fxml"));
		BorderPane login = loader.load();
		mainLayout.setCenter(login);
	}
	
	public static void forgotPassword() throws IOException {
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(Main.class.getResource("login/ForgotPassword.fxml"));
		BorderPane forgotpass = loader.load();
		
		//Stage addForgotPassBox = new Stage();
		addForgotPassBox = new Stage();
		addForgotPassBox.setTitle("Forgot Password");
		addForgotPassBox.initModality(Modality.WINDOW_MODAL);
		addForgotPassBox.initOwner(window);
		Scene scene = new Scene(forgotpass);
		addForgotPassBox.setScene(scene);
		addForgotPassBox.showAndWait();
		addForgotPassBox.setMinHeight(400);
		addForgotPassBox.setMinWidth(500);
	}
	public static void closeForgotPass() {
		addForgotPassBox.close();
	}
	public static void showCreateAccountScene() throws IOException {
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(Main.class.getResource("signup/signup.fxml"));
		BorderPane signup = loader.load();
		mainLayout.setCenter(signup);
	}
	
	public static void showFormScene() throws IOException {
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(Main.class.getResource("form/Form.fxml"));
		VBox form = loader.load();
		mainLayout.setCenter(form);
	}

	
	public static void lastPage() throws IOException{
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(Main.class.getResource("lastPage/LastPage.fxml"));
		BorderPane lastPage = loader.load();
		mainLayout.setCenter(lastPage);
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
