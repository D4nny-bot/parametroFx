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

import java.lang.System.Logger;
import java.lang.System.*;

public class Stage1Controller implements Initializable{

	//@FXML
	
	@FXML
	private TextField txtAreaEnviar;
	
	
	Stage1Controller Stage1Control;
	
	
	public void initialize(URL url, ResourceBundle rb) {
		
		Stage1Control=this; // inicializar la instancia de Stage1Controller
		
	}
	
	@FXML 
	public void btnLlamarStage2(ActionEvent event) throws IOException{
		
		Stage stage2 = new Stage();
		FXMLLoader loader = new FXMLLoader();
		AnchorPane root = (AnchorPane)loader.load(getClass().getResource("/view/stage2.fxml").openStream());
		
		//CREAR UNA INSTANCIA DEL CONTROLADOR STAGE2
		Stage2Controller Stage2ControllerInstancia = (Stage2Controller)loader.getController();
		
		Stage2ControllerInstancia.recibeParametros(Stage1Control, txtAreaEnviar.getText());
		
		Scene scene = new Scene(root);
		stage2.setScene(scene);
		stage2.alwaysOnTopProperty();
		stage2.initModality(Modality.APPLICATION_MODAL);//cuando se abre no deja que se vuelva a la ventana anterior
		stage2.show();
		
	}
	
	public void recibeparametros(String text) {
		
		txtAreaEnviar.setText(text);
		
	}
	//JAVFX#5 Abriendo Ventanas <============== DiscoDuroRoer
	// EJEMPLO SIMILAR A LO ANTERIOR
	//@FXML
	public void agregarPersona(ActionEvent event) {
		
		try {
			
			FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/nombre_vista.fxml"));
			Parent root = loader.load();
			
			//nombreControladorsiguienteVentana controlador = loader.getController();
			
			Scene scene = new Scene (root);
			Stage stage = new Stage();
			stage.initModality(Modality.APPLICATION_MODAL);// no se podrá volver a la ventana anterior
			stage.setScene(scene);
			stage.showAndWait();// util para las esperas de alertas
			
			
		} catch (Exception e) {
			//Logger.getLogger(Stage1Controller.class.getName()).log(Level.SEVERE, null, ex);
		}
		
	}
	
	
	
	
}
