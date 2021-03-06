package main;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class App extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		Parent root = FXMLLoader.load(getClass().getResource("/fxml/Main.fxml"));
		Scene scene = new Scene(root, 470, 332);
		
		primaryStage.setScene(scene);
		primaryStage.setTitle("Hello World!");
		primaryStage.show();
	}

}
