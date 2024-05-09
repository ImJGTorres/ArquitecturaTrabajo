package poo2.login.controllers;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import poo2.login.util.DataTransfer;

public class WelcomeScreenController implements Initializable{

	@FXML
	private Text nombreCompletoField;
	  @FXML
	    private Text textFieldHour;
	
	
	public WelcomeScreenController() {
		System.out.println("Iniciando WelcomeScreenController");
	}
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		DataTransfer dt = DataTransfer.getInstance();
		
		nombreCompletoField.setText(dt.getNombreCompleto());
		textFieldHour.setText(dt.getHoraMinuto());
		
	}
	

}









