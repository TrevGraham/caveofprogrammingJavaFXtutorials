package main;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

public class MainController implements Initializable {
	
	@FXML
	private Label greetingLabel;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
	}

	public void showGreeting(ActionEvent event) {
		greetingLabel.setText("Hello World!");
	}
}
