package it.edu.iisgubbio.matematica;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Divisori extends Application {
	
	Label lNumero = new Label("Numero");
	TextField tfNumero = new TextField();
	Button bDivisori = new Button ("Divisori");
	Label lRisultato = new Label("???");
	
	@Override
	public void start(Stage finestra) throws Exception {
		GridPane principale = new GridPane();
		
		principale.add(lNumero, 0, 0);
		principale.add(tfNumero, 1, 0);
		principale.add(bDivisori, 2, 0);
		principale.add(lRisultato, 0, 1,3,1);
		
		Scene scena = new Scene(principale);
		//scena.getStylesheets().add("it/edu/iisgubbio/matematica/Divisori.css");
		finestra.setTitle("Divisori");
		finestra.setScene(scena);
		finestra.show();
		
		bDivisori.setOnAction( e -> eseguiDivisori() );
	}
	
	private void eseguiDivisori() {
		int numero;
		String sequenza;
		boolean primoNumero=true;
		numero=Integer.parseInt(tfNumero.getText());
		sequenza="";
		for(int x=2; x<numero; x++) {
			if(numero%x==0) {	
			  if(primoNumero) {
				  sequenza+=x;
				  primoNumero = false;		
			  }else {
				  sequenza+=", "+x;
			  }
			}
		}
			
		lRisultato.setText(sequenza);
	}
	public static void main(String[] args) {
		launch(args);
	}	
}
