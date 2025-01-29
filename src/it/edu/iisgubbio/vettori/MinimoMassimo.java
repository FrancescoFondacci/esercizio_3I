package it.edu.iisgubbio.vettori;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class MinimoMassimo extends Application {
	
	TextField tfNumeri=new TextField();
	Label lRisultato= new Label("???");
	Button bMinimo= new Button("Minimo");
	Button bMassimo= new Button("Massimo");
	
	@Override
	public void start(Stage finestra) throws Exception {
		GridPane principale = new GridPane();
		
		principale.add(tfNumeri, 0, 0,3,1);
		principale.add(bMinimo, 0, 1);
		principale.add(bMassimo, 1, 1);
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
			
		bMinimo.setOnAction( e -> eseguiMinimo() );		
		bMassimo.setOnAction( e -> eseguiMassimo() );		
	}
	private void eseguiMinimo() {
		String testo,parti[];
		int minimo;
		testo=tfNumeri.getText();
		parti=testo.split(" ");
		int numeri[]=new int[parti.length];
		for(int pos=0;pos<parti.length;pos++) {
			numeri[pos]=Integer.parseInt(parti[pos]);
	    }
		minimo=numeri[0];
		for(int pos=1;pos<numeri.length;pos++) {
			if(numeri[pos]<minimo) {
				minimo=numeri[pos];
			}
		}
		lRisultato.setText(""+minimo);
	}
	private void eseguiMassimo() {
		String testo,parti[];
		int massimo;
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
			}
		}
		lRisultato.setText(""+massimo);
	}
	public static void main(String[] args) {
		launch(args);
	}
}
