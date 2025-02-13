package it.edu.iisgubbio.testi;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class IP extends Application {
	
	Label lIndirizzo=new Label("Indirizzo");
	TextField tfIndirizzo=new TextField();
	Button bVerifica=new Button ("Verifica");
	Label lRisultato=new Label("???");
	
	public void start(Stage finestra) throws Exception {
		GridPane principale = new GridPane();
		
		principale.add(lIndirizzo, 0, 0);
		principale.add(tfIndirizzo, 1, 0);
		principale.add(bVerifica, 0, 1);
		principale.add(lRisultato, 1, 1);
		
		Scene scena = new Scene(principale);
		finestra.setTitle("Cesare");
		finestra.setScene(scena);
		finestra.show();
		
		bVerifica.setOnAction( e -> eseguiVerifica() );
	}
	private void eseguiVerifica() {
		String indirizzo=tfIndirizzo.getText();
		String parti[];
		parti= indirizzo.split("\\.");
		boolean lettera=false;
		char controllo[]=indirizzo.toCharArray();
		for(int i=0;i<controllo.length;i++ ) {
			if(controllo[i]>='A' && controllo[i]<='z') {
				
				lettera=true;
			}
		}
		if(lettera==false)	{
			int ip[]= new int[parti.length];
			for(int i=0;i<parti.length;i++) {
				ip[i]= Integer.parseInt(parti[i]);		
			}	
			
			if(parti.length==4) {
				boolean valido=true;
				for(int pos=0;pos<ip.length;pos++) {
					if(ip[pos]>=255 || ip[pos]<0) {
						valido=false;
					}
					if(valido==false) {
						lRisultato.setText("Indirizzo errato");
					}else {
						lRisultato.setText("Indirizzo valido");
					}
				}
			}else {
				lRisultato.setText("Indirizzo errato");
			}	
		}else {
			lRisultato.setText("Indirizzo errato");
		}
		
		
	}
	public static void main(String[] args) {
		launch(args);
	}
}
