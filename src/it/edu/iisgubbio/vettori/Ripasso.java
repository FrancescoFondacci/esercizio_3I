package it.edu.iisgubbio.vettori;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Ripasso extends Application {
	
	TextField tfNumeri=new TextField();
	Label lSValori=new Label("Valori");
	Label lPosizione=new Label("???");
	Label lSPosizione=new Label("Posizione");
	Label lMassimo=new Label("???");
	Label lSMassimo=new Label("Massimo");
	Label lElenco=new Label("???");
	Label lSElenco=new Label("Elenco");
	Button bRicerca=new Button("Ricerca");
	
	@Override
	public void start(Stage finestra) throws Exception {
		GridPane principale = new GridPane();
		
		principale.add(tfNumeri,1,0);
		principale.add(lSValori,0,0);
		principale.add(lMassimo,1,1);
		principale.add(lSMassimo,0,1);
		principale.add(lSPosizione,0,2);
		principale.add(lPosizione,1,2);
		principale.add(lElenco,1,3);
		principale.add(lSElenco,0,3);
		principale.add(bRicerca,1,4);
		bRicerca.setMaxWidth(Integer.MAX_VALUE);
		
		Scene scena = new Scene(principale);	  	        
	    finestra.setTitle("IndovinaNumero");
	    finestra.setScene(scena);
		finestra.show();
			
		bRicerca.setOnAction( e -> eseguiRicerca() );	
	}
	private void eseguiRicerca() {
		String testo,parti[];
		int massimo,pMassimo=0;
		testo=tfNumeri.getText();
		parti=testo.split(" ");
		int numeri[]=new int[parti.length];
		for(int pos=0;pos<parti.length;pos++) {
			numeri[pos]=Integer.parseInt(parti[pos]);
	    }
		massimo=numeri[0];
		for(int pos=1;pos<numeri.length;pos++) {
			if(numeri[pos]>massimo) {
				massimo=numeri[pos];
				pMassimo=pos;
			}
		}
		
		String se="";
		for(int pos=0;pos<numeri.length;pos++) {
			se+=";"+(numeri[pos]);
		}
		lMassimo.setText(""+massimo);
		lPosizione.setText(""+pMassimo);
		lElenco.setText(se);
		
	}
	public static void main(String[] args) {
		launch(args);
	}
}
