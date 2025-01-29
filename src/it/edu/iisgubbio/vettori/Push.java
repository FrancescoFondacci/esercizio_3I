package it.edu.iisgubbio.vettori;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Push extends Application {
	
	int numeroCaselle=15;
	TextField caselle[]= new TextField[numeroCaselle];
	TextField tfTesto= new TextField();
	Button bPush=new Button("Push");
	
	
	@Override
	public void start(Stage finestra) throws Exception {
		GridPane principale = new GridPane();
	
		principale.add(tfTesto, 0,numeroCaselle);
		principale.add(bPush, 1,numeroCaselle);
		for(int i=0;i<numeroCaselle;i++) {
			caselle[i]=new TextField();
			principale.add(caselle[i],0,i);			
		}				
		Scene scena = new Scene(principale);	  	        
	    finestra.setTitle("IndovinaNumero");
	    finestra.setScene(scena);
		finestra.show();	
		
		bPush.setOnAction( e -> eseguiPush() );
	}
	private void eseguiPush() {
		String testo;
		for(int pos=0; pos<numeroCaselle;pos++) {
			testo=caselle[numeroCaselle-1].getText();
			caselle[pos].setText(testo);
		}
	}
	public static void main(String[] args) {
		launch(args);
	}
}
