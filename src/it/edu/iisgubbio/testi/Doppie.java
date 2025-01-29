package it.edu.iisgubbio.testi;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Doppie extends Application {
	
	TextField tfTesto= new TextField();
	Button bDoppie=new Button("Conta");
	Label lRisultato = new Label("??");
	Label lTesto = new Label("testo");
	Label lDoppie = new Label("n. Doppie");
	

	@Override
	public void start(Stage finestra) throws Exception {
		GridPane principale = new GridPane();
		
		principale.add(tfTesto, 1,0);
		principale.add(bDoppie, 1, 1);
		principale.add(lRisultato, 1, 2);
		principale.add(lTesto, 0, 0);
		principale.add(lDoppie, 0, 2);
		
		Scene scena = new Scene(principale);	  	        
	    finestra.setTitle("IndovinaNumero");
	    finestra.setScene(scena);
		finestra.show();
			
		bDoppie.setOnAction( e -> eseguiDoppie() );	
	}
	private void eseguiDoppie() {
		char lettere[]=tfTesto.getText().toCharArray();
		int c=0;
		for(int pos=0;pos<lettere.length-1;pos++) {
			if(lettere[pos+1]==lettere[pos]) {
				c+=1;
				lettere[pos]='#';
				lettere[pos+1]='#';
				
			}
		}
		String testo = new String(lettere);
		lRisultato.setText(""+c+" "+testo);
		
		
	}
	public static void main(String[] args) {
		launch(args);
	}
}
