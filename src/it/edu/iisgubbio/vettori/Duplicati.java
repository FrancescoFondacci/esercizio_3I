package it.edu.iisgubbio.vettori;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Duplicati extends Application {
	
	TextField tfNumeri= new TextField();
	Button bDuplicati=new Button("Trova duplicati");
	Label lRisultato = new Label("??");
	
	@Override
	public void start(Stage finestra) throws Exception {
		GridPane principale = new GridPane();
		
		principale.add(tfNumeri, 0,0,5,1);
		principale.add(bDuplicati, 0, 1,5,1);
		principale.add(lRisultato, 0, 2,5,1);
		bDuplicati.setMaxWidth(Integer.MAX_VALUE);
		
		Scene scena = new Scene(principale);	  	        
	    finestra.setTitle("IndovinaNumero");
	    finestra.setScene(scena);
		finestra.show();
			
		bDuplicati.setOnAction( e -> eseguiDuplicati() );	
	}
	private void eseguiDuplicati() {
		String testo,parti[];
		testo=tfNumeri.getText();
		parti=testo.split(" ");
		int numeri[]=new int[parti.length];
		for(int pos=0;pos<parti.length;pos++) {
			numeri[pos]=Integer.parseInt(parti[pos]);
		}
		boolean presente=false;
		for(int pos=0;pos<numeri.length-1;pos++) {
			if(numeri[pos+1]==numeri[pos]) {
				presente=true;				
			}
		}
		if(presente) {
			lRisultato.setText("Sono presenti dei duplicati");
		}else {
			lRisultato.setText("Non sono presenti dei duplicati");
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}

}
