package it.edu.iisgubbio.vettori;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Media extends Application {
	
	TextField tfNumeri= new TextField();
	Button bMedia=new Button("Media");
	Label lMedia = new Label("??");
	
	@Override
	public void start(Stage finestra) throws Exception {
		GridPane principale = new GridPane();
		
		principale.add(tfNumeri, 0,0,5,1);
		principale.add(bMedia, 0, 1,5,1);
		principale.add(lMedia, 0, 2,5,1);
		bMedia.setMaxWidth(Integer.MAX_VALUE);
			
		Scene scena = new Scene(principale);	  	        
	    finestra.setTitle("IndovinaNumero");
	    finestra.setScene(scena);
		finestra.show();
			
		bMedia.setOnAction( e -> eseguiMedia() );	
	}
	private void eseguiMedia() {
		String testo,parti[],sMedia;
		double media,somma=0;
		testo=tfNumeri.getText();
		parti=testo.split(" ");
		int numeri[]=new int[parti.length];
		for(int pos=0;pos<parti.length;pos++) {
			numeri[pos]=Integer.parseInt(parti[pos]);
			somma+=numeri[pos];
		}
		media=somma/numeri.length;
		sMedia=""+media;
		lMedia.setText(sMedia);
	}
	public static void main(String[] args) {
		launch(args);
	}	

}