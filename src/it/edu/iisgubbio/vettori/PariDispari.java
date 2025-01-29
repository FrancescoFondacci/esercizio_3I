package it.edu.iisgubbio.vettori;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class PariDispari extends Application {
	
	TextField tfNumeri= new TextField();
	Button bPariDispari=new Button("Pari Dispari");
	Label lRisultato = new Label("??");
	
	@Override
	public void start(Stage finestra) throws Exception {
		GridPane principale = new GridPane();
		
		principale.add(tfNumeri, 0,0,5,1);
		principale.add(bPariDispari, 0, 1,5,1);
		principale.add(lRisultato, 0, 2,5,1);
		bPariDispari.setMaxWidth(Integer.MAX_VALUE);
		
		Scene scena = new Scene(principale);	  	        
	    finestra.setTitle("PariDisapr");
	    finestra.setScene(scena);
		finestra.show();
			
		bPariDispari.setOnAction( e -> eseguiPariDispari() );	
	}
	private void eseguiPariDispari() {
		String testo,parti[];
		testo=tfNumeri.getText();
		parti=testo.split(" ");
		int numeri[]=new int[parti.length];
		for(int pos=0;pos<parti.length;pos++) {
			numeri[pos]=Integer.parseInt(parti[pos]);
		}
		int contatoreP=0;
		int contatoreD=0;
		for(int pos=0;pos<numeri.length;pos++) {
			if(numeri[pos]%2==0) {
				contatoreP+=1;
			}else {
				contatoreD+=1;
			}
		}
		lRisultato.setText("I numeri pari sono"+" "+contatoreP+", I numeri Disapri sono"+" "+contatoreD);
	}
	public static void main(String[] args) {
		launch(args);
	}
}
