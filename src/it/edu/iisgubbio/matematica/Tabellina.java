package it.edu.iisgubbio.matematica;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Tabellina extends Application {
	
	TextField tfNumero = new TextField();
	Button bTabellina = new Button("Tabellina");
	Label lTabellina = new Label("???");
	
	@Override
	public void start(Stage finestra) throws Exception {
		GridPane principale = new GridPane();
		
		principale.add(tfNumero, 0, 0);
		principale.add(bTabellina, 1, 0);
		principale.add(lTabellina, 0, 1);
		
		Scene scena = new Scene(principale);	        
		finestra.setTitle("IndovinaNumero");
		finestra.setScene(scena);
		finestra.show();
			
		bTabellina.setOnAction( e -> eseguiTabellina() );
	}
	
	private void eseguiTabellina() {
		int numero;
		String sequenza;
		numero=Integer.parseInt(tfNumero.getText());
		sequenza=""+numero;
		for(int x=numero*2; x<=numero*10; x+=numero) {
			sequenza+=", "+x;
		}
		lTabellina.setText(sequenza);
	}
	
	public static void main(String[] args) {
		launch(args);
	}	
}
