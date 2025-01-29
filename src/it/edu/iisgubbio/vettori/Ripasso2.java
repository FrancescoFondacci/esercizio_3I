package it.edu.iisgubbio.vettori;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Ripasso2 extends Application{
	TextField tfNumeri=new TextField();
	Label lElenco=new Label("Elenco");
	Button bScambia=new Button("Scambia");
	Label lRisultato=new Label("??");
	Label lSRisultato=new Label("Risultato");

	
	@Override
	public void start(Stage finestra) throws Exception {
		GridPane principale = new GridPane();
		
		principale.add(tfNumeri,1,0);
		principale.add(lElenco,0,0);
		principale.add(bScambia,0,2);
		principale.add(lSRisultato,0,1);
		principale.add(lRisultato,1,1);
		bScambia.setMaxWidth(Integer.MAX_VALUE);
		
		Scene scena = new Scene(principale);	  	        
	    finestra.setTitle("IndovinaNumero");
	    finestra.setScene(scena);
		finestra.show();	
		
		bScambia.setOnAction( e -> eseguiScambia() );
	
	}
	int[] testoNumeri (String testo) {
		String parti[];
		int vettoreNumeri[];
		parti= testo.split(" ");
		vettoreNumeri= new int[parti.length];
		for(int i=0;i<parti.length;i++) {
			vettoreNumeri[i]= Integer.parseInt(parti[i]);		
		}
		return vettoreNumeri;
	}
	private void eseguiScambia() {
		int numeri[],massimo,minimo,pMassimo=0,pMinimo=0;
		numeri=testoNumeri(tfNumeri.getText());
		massimo=numeri[0];
		for(int pos=1;pos<numeri.length;pos++) {
			if(numeri[pos]>massimo) {
				massimo=numeri[pos];
				pMassimo=pos;
			}
		}
		minimo=numeri[0];
		for(int pos=1;pos<numeri.length;pos++) {
			if(numeri[pos]<minimo) {
				minimo=numeri[pos];
				pMinimo=pos;
			}
		}
		numeri[pMinimo]=massimo;
		numeri[pMassimo]=minimo;
		String se="";
		for(int pos=0;pos<numeri.length;pos++) {
			if (pos==0) {
				se+=""+numeri[pos];			
			}else {
				se+=";"+numeri[pos];
			}
		}
		lRisultato.setText(se);
	}
	public static void main(String[] args) {
		launch(args);
	}
}
