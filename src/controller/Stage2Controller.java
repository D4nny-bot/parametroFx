package controller;

import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.fxml.FXML;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;
import java.io.IOException;
import javafx.scene.Scene;
import javafx.scene.Parent;



public class Stage2Controller implements Initializable {
	
	
	Stage1Controller stage1_controller_stage2;
	
	@FXML
	private TextField txtAreaRecibir;
	@FXML
	private TextField txtAreaDevolver;
	@FXML
	private Button btnCerrar;
	
	public void initialize(URL url, ResourceBundle rb) {
		
		
		
	}
	//@FXML
	public void recibeParametros(Stage1Controller stage1, String texto) {
		
		txtAreaRecibir.setText(texto);
		stage1_controller_stage2=stage1;
		
	}
	
	
	@FXML 
	public void btnCerrarEnviar(ActionEvent event) {
		
		stage1_controller_stage2.recibeparametros(txtAreaDevolver.getText());
		Stage stage = (Stage) btnCerrar.getScene().getWindow();
		stage.close();
		
	}

}
