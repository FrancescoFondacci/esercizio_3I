package it.edu.iisgubbio.vettori;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class TrovaPosizione extends Application {
	
	TextField tfNumeri=new TextField();
	TextField tfNumero=new TextField();
	Label lNumero= new Label("Numero");
	Label lRisultato= new Label("???");
	Button bCerca= new Button("Cerca");
	
	@Override
	public void start(Stage finestra) throws Exception {
		GridPane principale = new GridPane();
		
		principale.add(tfNumeri, 0, 0,3,1);
		principale.add(tfNumero, 1, 1);
		principale.add(lNumero, 0, 1);
		principale.add(bCerca, 2, 1);
		principale.add(lRisultato, 0, 2,3,1);
		tfNumeri.setPrefWidth(100);
		lRisultato.setMaxWidth(Integer.MAX_VALUE);
		principale.setVgap(10);
		principale.setHgap(10);
		
		Scene scena = new Scene(principale);
		//scena.getStylesheets().add("it/edu/iisgubbio/vettori/Cerca.css");
		//principale.getStyleClass().add("principale");
	    finestra.setTitle("cerca");
	    finestra.setScene(scena);
		finestra.show();
			
		bCerca.setOnAction( e -> eseguiCerca() );				
	}
	private void eseguiCerca() {
		String testo,parti[];
		int numero;
		numero=Integer.parseInt(tfNumero.getText());
		testo=tfNumeri.getText();
		parti=testo.split(" ");
		int numeri[]=new int[parti.length];
		for(int pos=0;pos<parti.length;pos++) {
			numeri[pos]=Integer.parseInt(parti[pos]);
	    }
		boolean presente=false;
		String se="";
		for(int pos=0;pos<numeri.length;pos++) {
			if(numeri[pos]==numero) {
				presente=true;	
				se+=","+(pos+1);
				
			}
		}
		if(presente) {
			lRisultato.setText("Il numero"+""+numero+" è presente alla posizione"+" "+se);
		}else {
			lRisultato.setText("Il numero"+" "+numero+" non è presente");
		}
	}
	public static void main(String[] args) {
		launch(args);
	}
}
